package Services.Implement;

import DomainModels.Size;
import Repositories.Implement.SizeRepositoryImpl;
import Services.Interface.SizeServiceInterface;
import java.util.List;
import java.util.UUID;

public class SizeServiceImpl implements SizeServiceInterface {

    private SizeRepositoryImpl szRepo;

    public SizeServiceImpl() {
        szRepo = new SizeRepositoryImpl();
    }

    @Override
    public List<Size> getAll() {
        return new SizeRepositoryImpl().all();
    }

    @Override
    public String create(Size size) throws Exception {
        List<Size> list = szRepo.all();
        if (size.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (size.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (Size test : list) {
            if (size.getMa().equals(test.getMa())) {
                return "Không nhập trùng mã";
            }
        }
        if (size.getSz().equals("")) {
            return "Không để trống size";
        }
        if (Integer.parseInt(size.getSz()) < 0) {
            return "Size không nhập số âm";
        }

        if (szRepo.create(size) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(Size size) throws Exception {
        List<Size> list = szRepo.all();
        if (size.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (size.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        if (size.getSz().equals("")) {
            return "Không để trống tên";
        }
        if (Integer.parseInt(size.getSz()) < 0) {
            return "Size không nhập số âm";
        }

        if (szRepo.update(size) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        szRepo.delete(id);
    }

}
