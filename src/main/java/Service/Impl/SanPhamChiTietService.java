/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import Model.SanPham;
import Repository.SanPhamChiTietRepository;
import Service.ISanPhamChiTietService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPhamChiTietService implements ISanPhamChiTietService {

    private static SanPhamChiTietRepository SanPhamChiTietRepository;

    public SanPhamChiTietService() {
        SanPhamChiTietRepository = new SanPhamChiTietRepository();
    }

    @Override
    public List<SanPham> getList() {
        return SanPhamChiTietRepository.getList();
    }

    @Override
    public String add(SanPham sanPham) {
        if (SanPhamChiTietRepository.add(sanPham)) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    @Override
    public String update(SanPham sanPham) {
        if (SanPhamChiTietRepository.update(sanPham)!=0) {
            return "Cập nhật thành công";
        }else{
            return "Cập nhật thất bại";
        }
    }

    @Override
    public String delete(SanPham sanPham) {
   if (SanPhamChiTietRepository.delete(sanPham)!=0) {
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }
}
