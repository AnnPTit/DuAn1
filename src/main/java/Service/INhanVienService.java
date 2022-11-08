/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface INhanVienService {
    
    public List<NhanVien> getList();
    
    public NhanVien getNhanVien(String maNv);
    
}
