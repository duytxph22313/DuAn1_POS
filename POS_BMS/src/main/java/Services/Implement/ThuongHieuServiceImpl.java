package Services.Implement;

import DomainModels.ThuongHieu;
import Repositories.Implement.ThuongHieuRepositoryImpl;
import Services.Interface.ThuongHieuServiceInterface;
import java.util.List;
import java.util.UUID;

public class ThuongHieuServiceImpl implements ThuongHieuServiceInterface {

    private ThuongHieuRepositoryImpl thRepo;

    public ThuongHieuServiceImpl() {
        thRepo = new ThuongHieuRepositoryImpl();
    }

    @Override
    public List<ThuongHieu> getAll() {
        return new ThuongHieuRepositoryImpl().all();
    }

    @Override
    public String create(ThuongHieu th) throws Exception {
        List<ThuongHieu> list = thRepo.all();
        if (th.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (th.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (ThuongHieu thtest : list) {
            if (th.getMa().equals(thtest.getMa())) {
                return "Không nhập trùng mã";
            }
        }
        if (th.getTen().equals("")) {
            return "Không để trống tên";
        }
        if (th.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (thRepo.create(th) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(ThuongHieu th) throws Exception {
        List<ThuongHieu> list = thRepo.all();
        if (th.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (th.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        if (th.getTen().equals("")) {
            return "Không để trống tên";
        }
        if (th.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (thRepo.update(th) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        thRepo.delete(id);
    }

}
