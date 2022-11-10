/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ConfigHibernate.HibernateConfig;
import Model.NhanVien;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.query.Query;
import org.hibernate.Session;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public List<NhanVien> getList() {
        Query q = session.createQuery("From NhanVien");
        List<NhanVien> list = q.getResultList();
        return list;
    }

    public NhanVien getNhanVien(String maNv) {
        try {
            String sql = "SELECT * FROM NhanVien WHERE maNV = :ma";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(NhanVien.class);
            query.setParameter("ma", maNv);
            NhanVien results = (NhanVien) query.getSingleResult();
            return results;
        } catch (Exception e) {
            System.out.println("lỗi lấy nhân viên");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        //List<NhanVien> list = new NhanVienRepository().getList();
        NhanVien list = new NhanVienRepository().getNhanVien("NV01");
        System.out.println(list);
    }

}
