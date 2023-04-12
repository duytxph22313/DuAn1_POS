package Services.Interface;

import DomainModels.Mau;
import java.util.List;
import java.util.UUID;

public interface MauServiceInterface {

    public List<Mau> getAll();

    public String create(Mau mau) throws Exception;

    public String update(Mau mau) throws Exception;

    public void delete(UUID id) throws Exception;
}
