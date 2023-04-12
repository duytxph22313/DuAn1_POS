package Repositories.Implement;

import DomainModels.ChatLieu;
import DomainModels.SanPham;
import Repositories.Interface.ChatLieuRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class ChatLieuRepositoryImpl implements ChatLieuRepositoryInterface {

    private ArrayList<ChatLieu> list;
    private Session hSession;

    public ChatLieuRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<ChatLieu> all() {
        String hql = "SELECT clObj FROM ChatLieu clObj";
        TypedQuery<ChatLieu> query = this.hSession.createQuery(hql, ChatLieu.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(ChatLieu cl) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(cl);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(ChatLieu cl) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(cl);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public void delete(UUID id) throws Exception {
        try {
            ChatLieu cl = null;
            this.hSession.getTransaction().begin();
            cl = this.hSession.get(ChatLieu.class, id);
            this.hSession.delete(cl);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

     public static void main(String[] args) {
        List<ChatLieu> lst = new ChatLieuRepositoryImpl().all();
        for (ChatLieu sp : lst) {
            System.out.println(sp.toString());
        }
}
}
