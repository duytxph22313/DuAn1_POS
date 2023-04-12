package Repositories.Implement;

import DomainModels.KhachHang;
import Repositories.Interface.KhachHangRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class KhachHangRepositoryImpl implements KhachHangRepositoryInterface {

    private ArrayList<KhachHang> list;
    private Session hSession;

    public KhachHangRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<KhachHang> all() {
        String hql = "SELECT khObj FROM KhachHang khObj";
        TypedQuery<KhachHang> query = this.hSession.createQuery(hql, KhachHang.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(KhachHang kh) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(kh);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(KhachHang kh) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(kh);
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
            KhachHang kh = null;
            this.hSession.getTransaction().begin();
            kh = this.hSession.get(KhachHang.class, id);
            this.hSession.delete(kh);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }
    
    public static void main(String[] args) {
        List<KhachHang> lst = new KhachHangRepositoryImpl().all();
        for (KhachHang sp : lst) {
            System.out.println(sp.toString());
        }
    }

}
