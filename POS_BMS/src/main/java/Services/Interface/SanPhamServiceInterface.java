package Services.Interface;

import DomainModels.SanPham;
import java.util.List;
import java.util.UUID;

public interface SanPhamServiceInterface {

    public List<SanPham> getAll();

    public String create(SanPham sp) throws Exception;

    public String update(SanPham sp) throws Exception;

    public void delete(UUID id) throws Exception;
}
