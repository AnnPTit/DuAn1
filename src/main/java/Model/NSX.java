/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "NSX")
public class NSX implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    private String id ;
    
    @Column(name = "MaNSX")
    private String maNSX ; 
    
    @Column(name = "TenNSX")
    private String tenNSX ; 
    
    @Column(name = "TrangThai")
    private Integer trangThai ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NSX{" + "id=" + id + ", maNSX=" + maNSX + ", tenNSX=" + tenNSX + ", trangThai=" + trangThai + '}';
    }

    public NSX() {
    }

    public NSX(String id, String maNSX, String tenNSX, Integer trangThai) {
        this.id = id;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.trangThai = trangThai;
    }
    
    
    

}
