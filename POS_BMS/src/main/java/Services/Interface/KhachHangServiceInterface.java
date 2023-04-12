package Services.Interface;

import DomainModels.KhachHang;
import java.util.List;
import java.util.UUID;

public interface KhachHangServiceInterface {

    public List<KhachHang> getAll();

    public String create(KhachHang kh) throws Exception;

    public String update(KhachHang kh) throws Exception;

    public void delete(UUID id) throws Exception;
}
