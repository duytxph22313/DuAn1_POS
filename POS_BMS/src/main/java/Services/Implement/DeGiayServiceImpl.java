package Services.Implement;

import DomainModels.DeGiay;
import Repositories.Implement.DeGiayRepositoryImpl;
import Services.Interface.DeGiayServiceInterface;
import java.util.List;
import java.util.UUID;

public class DeGiayServiceImpl implements DeGiayServiceInterface {

    private DeGiayRepositoryImpl dgRepo;

    public DeGiayServiceImpl() {
        dgRepo = new DeGiayRepositoryImpl();
    }

    @Override
    public List<DeGiay> getAll() {
        return new DeGiayRepositoryImpl().all();
    }

    @Override
    public String create(DeGiay dg) throws Exception {
        List<DeGiay> list = dgRepo.all();
        if (dg.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (dg.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (DeGiay test : list) {
            if (dg.getMa().equals(test.getMa())) {
                return "Không nhập trùng mã";
            }
        }
        if (dg.getTen().equals("")) {
            return "Không để trống tên";
        }
        if (dg.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (dgRepo.create(dg) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(DeGiay dg) throws Exception {
        List<DeGiay> list = dgRepo.all();
        if (dg.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (dg.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        if (dg.getTen().equals("")) {
            return "Không để trống tên";
        }
        if (dg.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (dgRepo.update(dg) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        dgRepo.delete(id);
    }

}
