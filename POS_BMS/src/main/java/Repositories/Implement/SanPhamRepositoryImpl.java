package Repositories.Implement;

import DomainModels.SanPham;
import Repositories.Interface.SanPhamRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;

public class SanPhamRepositoryImpl implements SanPhamRepositoryInterface {

    private ArrayList<SanPham> list;
    private Session hSession;

    public SanPhamRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<SanPham> all() {
        String hql = "SELECT spObj FROM SanPham spObj";
        TypedQuery<SanPham> query = this.hSession.createQuery(hql, SanPham.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(SanPham sp) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(sp);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(SanPham sp) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(sp);
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
            SanPham sp = null;
            this.hSession.getTransaction().begin();
            sp= hSession.get(SanPham.class, id);
            this.hSession.delete(sp);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

    public static void main(String[] args) {
        List<SanPham> lst = new SanPhamRepositoryImpl().all();
        for (SanPham sp : lst) {
            System.out.println(sp.toString());
        }
    }

}
