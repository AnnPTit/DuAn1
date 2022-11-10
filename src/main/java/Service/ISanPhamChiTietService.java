/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ISanPhamChiTietService {

    List<SanPham> getList();

    String add(SanPham sanPham);

    String update(SanPham sanPham);

    String delete(SanPham sanPham);
}
