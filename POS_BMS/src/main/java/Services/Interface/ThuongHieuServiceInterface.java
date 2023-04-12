package Services.Interface;

import DomainModels.ThuongHieu;
import java.util.List;
import java.util.UUID;

public interface ThuongHieuServiceInterface {

    public List<ThuongHieu> getAll();

    public String create(ThuongHieu th) throws Exception;

    public String update(ThuongHieu th) throws Exception;

    public void delete(UUID id) throws Exception;
}
