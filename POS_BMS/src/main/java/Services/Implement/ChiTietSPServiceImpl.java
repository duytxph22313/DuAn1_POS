package Services.Implement;

import DomainModels.ChiTietSP;
import Repositories.Implement.ChiTietSPRepositoryImpl;
import Services.Interface.ChiTietSPServiceInterface;
import java.util.List;
import java.util.UUID;

public class ChiTietSPServiceImpl implements ChiTietSPServiceInterface {

    private ChiTietSPRepositoryImpl ctspRepo;

    public ChiTietSPServiceImpl() {
        ctspRepo = new ChiTietSPRepositoryImpl();
    }

    @Override
    public List<ChiTietSP> getAll() {
        return new ChiTietSPRepositoryImpl().all();
    }

    @Override
    public String create(ChiTietSP ctsp) throws Exception {
        List<ChiTietSP> list = ctspRepo.all();
        if (ctsp.getTrongLuong().equals("")) {
            return "Không để trống trọng lượng";
        }
        if (ctsp.getDonGia().equals("")) {
            return "Không để trống đơn giá";
        }
        if (ctsp.getSoLuong().equals("")) {
            return "Không để trống tên số lượng";
        }
        if (ctspRepo.create(ctsp) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(ChiTietSP ctsp) throws Exception {
        if (ctsp.getTrongLuong().equals("")) {
            return "Không để trống trọng lượng";
        }
        if (ctsp.getDonGia().equals("")) {
            return "Không để trống đơn giá";
        }
        if (ctsp.getSoLuong().equals("")) {
            return "Không để trống tên số lượng";
        }

        if (ctspRepo.update(ctsp) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        ctspRepo.delete(id);
    }

}
