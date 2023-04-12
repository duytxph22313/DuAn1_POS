package Repositories.Interface;

import DomainModels.ChiTietSP;
import DomainModels.SanPham;
import java.util.List;
import java.util.UUID;

public interface ChiTietSPRepositoryInterface {

    public List<ChiTietSP> all();

    public Boolean create(ChiTietSP ctsp) throws Exception;

    public Boolean update(ChiTietSP ctsp) throws Exception;

    public void delete(UUID id) throws Exception;
}
