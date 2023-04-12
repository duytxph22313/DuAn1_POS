package Repositories.Interface;

import DomainModels.ThuongHieu;
import java.util.List;
import java.util.UUID;

public interface ThuongHieuRepositoryInterface {

    public List<ThuongHieu> all();

    public Boolean create(ThuongHieu th) throws Exception;

    public Boolean update(ThuongHieu th) throws Exception;

    public void delete(UUID id) throws Exception;
}
