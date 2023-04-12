package Repositories.Interface;

import DomainModels.Mau;
import java.util.List;
import java.util.UUID;

public interface MauRepositoryInterface {

    public List<Mau> all();

    public Boolean create(Mau mau) throws Exception;

    public Boolean update(Mau mau) throws Exception;

    public void delete(UUID id) throws Exception;
}
