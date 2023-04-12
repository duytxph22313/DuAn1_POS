package Repositories.Interface;

import DomainModels.DeGiay;
import java.util.List;
import java.util.UUID;

public interface DeGiayRepositoryInterface {

    public List<DeGiay> all();

    public Boolean create(DeGiay dg) throws Exception;

    public Boolean update(DeGiay dg) throws Exception;

    public void delete(UUID id) throws Exception;
}
