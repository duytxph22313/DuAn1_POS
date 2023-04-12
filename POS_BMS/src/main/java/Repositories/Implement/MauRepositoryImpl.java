package Repositories.Implement;

import DomainModels.Mau;
import Repositories.Interface.MauRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public class MauRepositoryImpl implements MauRepositoryInterface {

    private ArrayList<Mau> list;
    private Session hSession;

    public MauRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<Mau> all() {
        String hql = "SELECT mauObj FROM Mau mauObj";
        TypedQuery<Mau> query = this.hSession.createQuery(hql, Mau.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(Mau mau) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(mau);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(Mau mau) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(mau);
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
            Mau mau = null;
            this.hSession.getTransaction().begin();
            mau = this.hSession.get(Mau.class, id);
            this.hSession.delete(mau);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

}
