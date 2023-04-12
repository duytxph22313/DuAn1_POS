package Repositories.Interface;

import DomainModels.Size;
import java.util.List;
import java.util.UUID;

public interface SizeRepositoryInterface {

    public List<Size> all();

    public Boolean create(Size size) throws Exception;

    public Boolean update(Size size) throws Exception;

    public void delete(UUID id) throws Exception;
}
