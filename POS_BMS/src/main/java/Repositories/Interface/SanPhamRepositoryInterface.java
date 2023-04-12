package Repositories.Interface;

import DomainModels.SanPham;
import java.util.List;
import java.util.UUID;

public interface SanPhamRepositoryInterface {

    public List<SanPham> all();

    public Boolean create(SanPham sp) throws Exception;

    public Boolean update(SanPham sp) throws Exception;

    public void delete(UUID id) throws Exception;
}
