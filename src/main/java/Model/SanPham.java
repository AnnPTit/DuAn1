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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "SANPHAM")
public class SanPham implements Serializable{
    
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    private String id ; 
    
   @Column(name = "Masp")
   private String maSp ; 
   @Column(name = "TenSP")
   private String tenSp ; 
   @Column(name = "Size")
   private String size ; 
   @Column (name = "trangThai")
   private Integer trangThai ; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", maSp=" + maSp + ", tenSp=" + tenSp + ", size=" + size + ", trangThai=" + trangThai + '}';
    }

    public SanPham() {
    }

    public SanPham(String id, String maSp, String tenSp, String size, Integer trangThai) {
        this.id = id;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.size = size;
        this.trangThai = trangThai;
    }
   
  
    
}
