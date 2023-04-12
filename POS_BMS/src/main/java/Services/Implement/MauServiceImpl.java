package Services.Implement;

import DomainModels.Mau;
import Repositories.Implement.MauRepositoryImpl;
import Services.Interface.MauServiceInterface;
import java.util.List;
import java.util.UUID;

public class MauServiceImpl implements MauServiceInterface {

    private MauRepositoryImpl mauRepo;

    public MauServiceImpl() {
        mauRepo = new MauRepositoryImpl();
    }

    @Override
    public List<Mau> getAll() {
        return new MauRepositoryImpl().all();
    }

    @Override
    public String create(Mau mau) throws Exception {
        List<Mau> list = mauRepo.all();
        if (mau.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (mau.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (Mau test : list) {
            if (mau.getMa().equals(test.getMa())) {
                return "Không nhập trùng mã";
            }
        }
        if (mau.getMau().equals("")) {
            return "Không để trống tên màu";
        }
        if (mau.getMau().trim().isEmpty()) {
            return "Tên màu không nhập kí tự trắng";
        }

        if (mauRepo.create(mau) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(Mau mau) throws Exception {
        List<Mau> list = mauRepo.all();
        if (mau.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (mau.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        if (mau.getMau().equals("")) {
            return "Không để trống tên màu";
        }
        if (mau.getMau().trim().isEmpty()) {
            return "Tên màu không nhập kí tự trắng";
        }

        if (mauRepo.update(mau) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        mauRepo.delete(id);
    }

}
