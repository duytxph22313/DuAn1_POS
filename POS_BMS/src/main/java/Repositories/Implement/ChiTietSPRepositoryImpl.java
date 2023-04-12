package Repositories.Implement;

import DomainModels.ChiTietSP;
import DomainModels.SanPham;
import Repositories.Interface.ChiTietSPRepositoryInterface;
import Repositories.Interface.SanPhamRepositoryInterface;
import Ultilities.HibernateUtil;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;

public class ChiTietSPRepositoryImpl implements ChiTietSPRepositoryInterface {

    private ArrayList<ChiTietSP> list;
    private Session hSession;

    public ChiTietSPRepositoryImpl() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
        this.list = new ArrayList<>();
    }

    @Override
    public List<ChiTietSP> all() {
        String hql = "SELECT ctspObj FROM ChiTietSP ctspObj";
        TypedQuery<ChiTietSP> query = this.hSession.createQuery(hql, ChiTietSP.class);
        return query.getResultList();
    }

    @Override
    public Boolean create(ChiTietSP ctsp) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.persist(ctsp);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
        return true;
    }

    @Override
    public Boolean update(ChiTietSP ctsp) throws Exception {
        try {
            this.hSession.getTransaction().begin();
            this.hSession.merge(ctsp);
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
             ChiTietSP ctsp = null;
            this.hSession.getTransaction().begin();
            ctsp = hSession.get(ChiTietSP.class, id);
            this.hSession.delete(ctsp);
            this.hSession.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.hSession.getTransaction().rollback();
        }
    }

    public static void main(String[] args) {
        List<ChiTietSP> lst = new ChiTietSPRepositoryImpl().all();
        for (ChiTietSP sp : lst) {
            System.out.println(sp.toString());
        }
    }

}
