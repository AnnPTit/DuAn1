/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ConfigHibernate.ConfigHibernate;
import Model.SanPham;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN
 */
public class SanPhamChiTietRepository {

    private Session session = ConfigHibernate.getFACTORY().openSession();

    public List<SanPham> getList() {
        Query q = session.createQuery("From SanPham");
        List<SanPham> list = q.getResultList();
        return list;
    }

    public Boolean add(SanPham sanPham) {
        Transaction transaction = null;
        // Integer check = 0;
        try ( Session session = ConfigHibernate.getFACTORY().openSession()) {
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

    public static void main(String[] args) {
        List<SanPham> list = new SanPhamChiTietRepository().getList();
        System.out.println(list);
    }
}
