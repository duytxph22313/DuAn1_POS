package Repositories.Implement;

import DomainModels.DeGiay;
import Repositories.Interface.DeGiayRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class DeGiayRepositoryImpl implements DeGiayRepositoryInterface {

    private ArrayList<DeGiay> list;
    private Session hSession;

    public DeGiayRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<DeGiay> all() {
        String hql = "SELECT dgObj FROM DeGiay dgObj";
        TypedQuery<DeGiay> query = this.hSession.createQuery(hql, DeGiay.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(DeGiay dg) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(dg);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(DeGiay dg) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(dg);
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
            DeGiay dg = null;
            this.hSession.getTransaction().begin();
            dg = this.hSession.get(DeGiay.class, id);
            this.hSession.delete(dg);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

}
