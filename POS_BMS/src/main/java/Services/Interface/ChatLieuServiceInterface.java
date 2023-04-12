package Services.Interface;

import DomainModels.ChatLieu;
import java.util.List;
import java.util.UUID;

public interface ChatLieuServiceInterface {

    public List<ChatLieu> getAll();

    public String create(ChatLieu cl) throws Exception;

    public String update(ChatLieu cl) throws Exception;

    public void delete(UUID id) throws Exception;
}
