package Services.Interface;

import DomainModels.ChiTietSP;
import DomainModels.SanPham;
import java.util.List;
import java.util.UUID;

public interface ChiTietSPServiceInterface {

    public List<ChiTietSP> getAll();

    public String create(ChiTietSP ctsp) throws Exception;

    public String update(ChiTietSP ctsp) throws Exception;

    public void delete(UUID id) throws Exception;
}
