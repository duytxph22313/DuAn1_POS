package Services.Interface;

import DomainModels.Size;
import java.util.List;
import java.util.UUID;

public interface SizeServiceInterface {

    public List<Size> getAll();

    public String create(Size size) throws Exception;

    public String update(Size size) throws Exception;

    public void delete(UUID id) throws Exception;
}
