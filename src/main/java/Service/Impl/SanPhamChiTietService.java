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
}


