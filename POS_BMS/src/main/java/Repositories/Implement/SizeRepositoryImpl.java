package Repositories.Implement;

import DomainModels.Size;
import Repositories.Interface.SizeRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class SizeRepositoryImpl implements SizeRepositoryInterface {

    private ArrayList<Size> list;
    private Session hSession;

    public SizeRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<Size> all() {
        String hql = "SELECT szObj FROM Size szObj";
        TypedQuery<Size> query = this.hSession.createQuery(hql, Size.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(Size size) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(size);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(Size size) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(size);
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
            Size size = null;
            this.hSession.getTransaction().begin();
            size = this.hSession.get(Size.class, id);
            this.hSession.delete(size);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

}
