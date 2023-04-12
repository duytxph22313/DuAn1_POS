package Services.Implement;

import DomainModels.SanPham;
import Repositories.Implement.SanPhamRepositoryImpl;
import Services.Interface.SanPhamServiceInterface;
import java.util.List;
import java.util.UUID;

public class SanPhamServiceImpl implements SanPhamServiceInterface {

    private SanPhamRepositoryImpl spRepo;

    public SanPhamServiceImpl() {
        spRepo = new SanPhamRepositoryImpl();
    }

    @Override
    public List<SanPham> getAll() {
        return new SanPhamRepositoryImpl().all();
    }

    @Override
    public String create(SanPham sp) throws Exception {
        List<SanPham> list = spRepo.all();
        if (sp.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (sp.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (SanPham sptest : list) {
            if (sp.getMa().equals(sptest.getMa())) {
                return "Không nhập trùng mã sản phẩm";
            }
        }
        if (sp.getTen().equals("")) {
            return "Không để trống tên sản phẩm";
        }
        if (sp.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (spRepo.create(sp) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(SanPham sp) throws Exception {
        if (sp.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (sp.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        if (sp.getTen().equals("")) {
            return "Không để trống tên sản phẩm";
        }
        if (sp.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (spRepo.update(sp) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID sp) throws Exception {
        spRepo.delete(sp);
    }

}
