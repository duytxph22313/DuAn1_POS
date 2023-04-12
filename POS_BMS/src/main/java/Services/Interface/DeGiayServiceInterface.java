package Services.Interface;

import DomainModels.DeGiay;
import java.util.List;
import java.util.UUID;

public interface DeGiayServiceInterface {

    public List<DeGiay> getAll();

    public String create(DeGiay dg) throws Exception;

    public String update(DeGiay dg) throws Exception;

    public void delete(UUID id) throws Exception;
}
