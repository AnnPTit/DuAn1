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
@Table(name = "CHITIETSP")
public class ChiTietSanPham implements Serializable{

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    private String id ;
    
    @Column(name = "MaCTSP")
    private String maCTSP ;
    @Column(name = "idSp")
    private String idSp ;
    
    
    

}
