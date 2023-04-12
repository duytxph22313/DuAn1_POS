package Repositories.Interface;

import DomainModels.KhachHang;
import java.util.List;
import java.util.UUID;

public interface KhachHangRepositoryInterface {

    public List<KhachHang> all();

    public Boolean create(KhachHang kh) throws Exception;

    public Boolean update(KhachHang kh) throws Exception;

    public void delete(UUID id) throws Exception;
}
