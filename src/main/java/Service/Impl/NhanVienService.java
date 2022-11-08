/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import Model.NhanVien;
import Repository.NhanVienRepository;
import Service.INhanVienService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienService implements INhanVienService {

    private static NhanVienRepository NhanVienRepository;

    public NhanVienService() {
        NhanVienRepository = new NhanVienRepository();
    }

    @Override
    public List<NhanVien> getList() {
        return NhanVienRepository.getList();
    }

    @Override
    public NhanVien getNhanVien(String maNv) {
        return NhanVienRepository.getNhanVien(maNv);
    }

}
