/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom11;
import java.util.ArrayList;
/**
 *
 * @author kiên bùi
 */
public class quanlyKhachHang{
   
    private ArrayList<KhachHang> danhSachKhachHang;

    public ArrayList<KhachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }

    public quanlyKhachHang() {
        danhSachKhachHang = new ArrayList<>();
    }

    public void themKhachHang(KhachHang khachHang) {
        danhSachKhachHang.add(khachHang);
    }

    public void suaKhachHang(KhachHang khachHang) {
        int index = timViTriKhachHang(khachHang.getMaKh());
        if (index >= 0) {
            danhSachKhachHang.set(index, khachHang);
        }
    }
    public void xoaKhachHang(String maKhachHang) {
        int index = timViTriKhachHang(maKhachHang);
        if (index >= 0) {
            danhSachKhachHang.remove(index);
        }
    }

    public KhachHang timKhachHangTheoMa(String maKhachHang) {
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang.getMaKh().equals(maKhachHang)) {
                return khachHang;
            }
        }
        return null;
    }
    public void xuatDanhSachKhachHang() {
        for (KhachHang khachHang : danhSachKhachHang) {
            System.out.println(khachHang);
        }
    }
    public int timViTriKhachHang(String maKhachHang) {
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (danhSachKhachHang.get(i).getMaKh().equals(maKhachHang)) {
                return i;
            }
        }
        return -1;
    }
    
}