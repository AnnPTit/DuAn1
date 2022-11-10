/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ConfigHibernate.HibernateConfig;
import Model.SanPham;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN
 */
public class SanPhamChiTietRepository {

    private Session session = HibernateConfig.getFACTORY().openSession();

    public List<SanPham> getList() {
        EntityManager em = session.getEntityManagerFactory().createEntityManager();
        em.getEntityManagerFactory().getCache().evictAll();
        EntityTransaction entityTransaction = em.getTransaction();
       
        Query q = (Query) em.createQuery("From SanPham");
        q.setHint("javax.persistence.cache.retrieveMode", "BYPASS");

        List<SanPham> list = q.getResultList();
        return list; 
    }

    public Boolean add(SanPham sanPham) {
        Transaction transaction = null;
        // Integer check = 0;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            //   check = (Integer) 
            session.save(sanPham);
            transaction.commit();
            //  System.out.println("ma hoa don" + check);
            //return check > 0;
            return true;
        } catch (Exception e) {
            System.out.println("Loi them san pham");
            e.printStackTrace();
        }
        return false;
    }

    public Integer update(SanPham sanPham) {
        Transaction transaction = null;
        try ( Session sesion = HibernateConfig.getFACTORY().openSession()) {
            Integer rowEfect = 0;
            transaction = sesion.beginTransaction();
            Query query = sesion.createQuery("Update SanPham set TenSp = :tenSp , Size = : size , TrangThai = : trangThai where MaSP =:maSp");
            query.setParameter("tenSp", sanPham.getTenSp());
            query.setParameter("size", sanPham.getSize());
            query.setParameter("trangThai", sanPham.getTrangThai());
            query.setParameter("maSp", sanPham.getMaSp());
            rowEfect = query.executeUpdate();
            //  sesion.saveOrUpdate(sanPham);
            transaction.commit();
            return rowEfect;
        } catch (Exception e) {
            System.out.println("Lỗi cập nhật sản phẩm ");
            e.printStackTrace();
        }
        return 0;
    }

    public Integer delete(SanPham sanPham) {
        Transaction transaction = null;
        try ( Session session = HibernateConfig.getFACTORY().openSession()) {
            Integer rowEffect = 0;
           transaction =  session.beginTransaction();
           // session.delete(sanPham);
            Query query = session.createQuery("Delete SanPham where MaSP = :masp ");
            query.setParameter("masp", sanPham.getMaSp());
            rowEffect = query.executeUpdate();
            transaction.commit();
            return rowEffect ;
        } catch (Exception e) {
            System.out.println("Lỗi xóa");
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        List<SanPham> list = new SanPhamChiTietRepository().getList();
        System.out.println(list);
    }
}
