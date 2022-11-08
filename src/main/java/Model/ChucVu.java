/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "ChucVu")
public class ChucVu implements Serializable{
    
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    private String id ; 
    
    @Column(name = "MaCV")
    private String maCv ; 
    @Column(name = "TenCV")
    private String tenCV ; 
    @Column(name ="TRANGTHAI")
    private Integer trangThai ; 
    
    @OneToMany(mappedBy = "ChucVu",fetch = FetchType.LAZY)
    List<NhanVien> listNhanViens;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public List<NhanVien> getListNhanViens() {
        return listNhanViens;
    }

    public void setListNhanViens(List<NhanVien> listNhanViens) {
        this.listNhanViens = listNhanViens;
    }

    public ChucVu() {
    }

    public ChucVu(String id, String maCv, String tenCV, Integer trangThai, List<NhanVien> listNhanViens) {
        this.id = id;
        this.maCv = maCv;
        this.tenCV = tenCV;
        this.trangThai = trangThai;
        this.listNhanViens = listNhanViens;
    }

    @Override
    public String toString() {
        return  maCv + " - " + tenCV ;
    }
    
    
    
    
}
