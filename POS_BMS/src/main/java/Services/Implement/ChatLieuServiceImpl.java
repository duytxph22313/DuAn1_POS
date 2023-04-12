package Services.Implement;

import DomainModels.ChatLieu;
import Repositories.Implement.ChatLieuRepositoryImpl;
import Services.Interface.ChatLieuServiceInterface;
import java.util.List;
import java.util.UUID;

public class ChatLieuServiceImpl implements ChatLieuServiceInterface {

    private ChatLieuRepositoryImpl clRepo;

    public ChatLieuServiceImpl() {
        clRepo = new ChatLieuRepositoryImpl();
    }

    @Override
    public List<ChatLieu> getAll() {
        return new ChatLieuRepositoryImpl().all();
    }

    @Override
    public String create(ChatLieu cl) throws Exception {
        List<ChatLieu> list = clRepo.all();
        if (cl.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (cl.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        for (ChatLieu cltest : list) {
            if (cl.getMa().equals(cltest.getMa())) {
                return "Không nhập trùng mã";
            }
        }
        if (cl.getTen().equals("")) {
            return "Không để trống tên";
        }
        if (cl.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (clRepo.create(cl) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(ChatLieu cl) throws Exception {
        List<ChatLieu> list = clRepo.all();
        if (cl.getMa().equals("")) {
            return "Không để trống mã";
        }
        if (cl.getMa().trim().isEmpty()) {
            return "Mã không nhập kí tự trắng";
        }
        if (cl.getTen().equals("")) {
            return "Không để trống tên";
        }
        if (cl.getTen().trim().isEmpty()) {
            return "Tên không nhập kí tự trắng";
        }

        if (clRepo.update(cl) == true) {
            return "Update thành công ^^";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        clRepo.delete(id);
    }

}
