/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom11;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author kiên bùi
 */
public class quanlylichtap {

    private ArrayList<LichTap> danhsachlichtap;
    Scanner sc = new Scanner(System.in);
    public ArrayList<LichTap> getDanhSachKhachHang() {
        return danhsachlichtap;
    }

    public quanlylichtap() {
        danhsachlichtap = new ArrayList<>();
    }

    public void themLichTap(LichTap khachHang) {
        danhsachlichtap.add(khachHang);
    }

    public void xuatDanhSachKhachHang() {
        for (LichTap khachHang : danhsachlichtap) {
            System.out.println(khachHang);
        }
    }

    private int timViTriKhachHang(String maKhachHang) {
        for (int i = 0; i < danhsachlichtap.size(); i++) {
            if (danhsachlichtap.get(i).getKh().getMaKh().equals(maKhachHang)) {
                return i;
            }
        }
        return -1;
    }

    public LichTap layLichTap(String maKhachHang) {
        for (int i = 0; i < danhsachlichtap.size(); i++) {
            if (danhsachlichtap.get(i).getKh().getMaKh().equals(maKhachHang)) {
                return danhsachlichtap.get(i);
            }
        }
        return null;
    }

    public ArrayList<LichTap> getDanhsachlichtap() {
        return danhsachlichtap;
    }

    public void giaHan(String maKhachHang) {
        for (LichTap lichtap : danhsachlichtap) {
            if (lichtap.getKh().getMaKh().equals(maKhachHang)) {
                if (LocalDate.now().isBefore(lichtap.getNgayketthuc())) {
                    System.out.println("Nhap so thang can gia han ");
                    lichtap.setGiahantap(sc.nextInt());
                    lichtap.setNgayketthuc(lichtap.getNgaydangky().plusMonths(lichtap.getThoigiantap() + lichtap.getGiahantap()));
                }
            }

        }

    }

    public void danhsachcangiahan() {
        for (LichTap lichtap : danhsachlichtap) {
            if (LocalDate.now().isAfter(lichtap.getNgayketthuc())) {
                System.out.println(lichtap);
            }
        }

    }

}
