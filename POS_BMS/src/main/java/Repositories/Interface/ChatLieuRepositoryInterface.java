package Repositories.Interface;

import DomainModels.ChatLieu;
import java.util.List;
import java.util.UUID;

public interface ChatLieuRepositoryInterface {

    public List<ChatLieu> all();

    public Boolean create(ChatLieu cl) throws Exception;

    public Boolean update(ChatLieu cl) throws Exception;

    public void delete(UUID id) throws Exception;
}
