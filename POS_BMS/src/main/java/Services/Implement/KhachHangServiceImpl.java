package Services.Implement;

import DomainModels.KhachHang;
import Repositories.Implement.KhachHangRepositoryImpl;
import Services.Interface.KhachHangServiceInterface;
import java.util.List;
import java.util.UUID;

public class KhachHangServiceImpl implements KhachHangServiceInterface {

    private KhachHangRepositoryImpl KHRepo;

    public KhachHangServiceImpl() {
        KHRepo = new KhachHangRepositoryImpl();
    }

    @Override
    public List<KhachHang> getAll() {
        return new KhachHangRepositoryImpl().all();
    }

    @Override
    public String create(KhachHang kh) throws Exception {
        List<KhachHang> list = KHRepo.all();
        if (kh.getMa().equals("")) {
            return "Không để trống mã khách hàng";
        }
        if (kh.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (KhachHang khtest : list) {
            if (kh.getMa().equals(khtest.getMa())) {
                return "Không nhập trùng mã khách hàng";
            }
        }
        if (kh.getHoTen().equals("")) {
            return "Không để trống tên khách hàng";
        }
        if (kh.getHoTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }
        if (kh.getSdt().equals("")) {
            return "Không để trống sđt khách hàng";
        }
        if (!kh.getSdt().matches("^0\\d{9}")) {
            return "Vui lòng nhập đúng định dạng sđt";
        }
        if (kh.getEmail().equals("")) {
            return "Không để trống email khách hàng";
        }
        if (!kh.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            return "Vui lòng nhập đúng định dạng email";
        }

        if (KHRepo.create(kh) == true) {
            return "Thêm thành công ^^";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(KhachHang kh) throws Exception {
        if (kh.getMa().equals("")) {
            return "Không để trống mã khách hàng";
        }
        if (kh.getMa().contains(" ")) {
            return "Mã không nhập kí tự trắng";
        }
        if (kh.getHoTen().equals("")) {
            return "Không để trống tên khách hàng";
        }
        if (kh.getHoTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }
        if (kh.getSdt().equals("")) {
            return "Không để trống sđt khách hàng";
        }
        if (!kh.getSdt().matches("^0\\d{9}")) {
            return "Vui lòng nhập đúng định dạng sđt";
        }
        if (kh.getEmail().equals("")) {
            return "Không để trống email khách hàng";
        }
        if (!kh.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            return "Vui lòng nhập đúng định dạng email";
        }

        if (KHRepo.update(kh) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        KHRepo.delete(id);
    }

}
