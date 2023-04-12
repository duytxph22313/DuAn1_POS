package Repositories.Implement;

import DomainModels.ThuongHieu;
import Repositories.Interface.ThuongHieuRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class ThuongHieuRepositoryImpl implements ThuongHieuRepositoryInterface {

    private ArrayList<ThuongHieu> list;
    private Session hSession;

    public ThuongHieuRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<ThuongHieu> all() {
        String hql = "SELECT thObj FROM ThuongHieu thObj";
        TypedQuery<ThuongHieu> query = this.hSession.createQuery(hql, ThuongHieu.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(ThuongHieu th) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(th);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(ThuongHieu th) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(th);
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
            ThuongHieu th = null;
            this.hSession.getTransaction().begin();
            th = this.hSession.get(ThuongHieu.class, id);
            this.hSession.delete(th);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

}
