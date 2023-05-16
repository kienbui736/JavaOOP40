/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom11;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author kiên bùi
 */
public class LichTap {
    private KhachHang kh;
    private String montap;
    private int thoigiantap;
    private LocalDate ngaydangky;
    private LocalDate ngayketthuc;
    private double giamontap;
    private int giahantap;

    public LichTap(KhachHang kh, String montap, int thoigiantap, LocalDate ngaydangky, LocalDate ngayketthuc, double giamontap, int giahantap) {
        this.kh = kh;
        this.montap = montap;
        this.thoigiantap = thoigiantap;
        this.ngaydangky = ngaydangky;
        this.ngayketthuc = ngayketthuc;
        this.giamontap = giamontap;
        this.giahantap = giahantap;
    }

   

    public LichTap(){
        super();
    }
    

    public int getThoigiantap() {
        return thoigiantap;
    }

    public void setThoigiantap(int thoigiantap) {
        this.thoigiantap = thoigiantap;
    }

    public String getMontap() {
        return montap;
    }

    public void setMontap(String montap) {
        this.montap = montap;
    }

    public LocalDate getNgaydangky() {
        return ngaydangky;
    }

    public void setNgaydangky(LocalDate ngaydangky) {
        this.ngaydangky = ngaydangky;
    }

    public LocalDate getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(LocalDate ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public double getGiamontap() {
        if (montap.equals("gym")) {
            giamontap += 200;
        } else if (montap.equals("yoga")) {
            giamontap += 250;
        } else {
            System.out.println("Nhap mon hoc");
        }
        return giamontap;
    }

    public LichTap(KhachHang kh) {
        this.kh = kh;
    }

    public void setGiamontap(double giamontap) {
        this.giamontap = giamontap;
    }

    public double getThanhtien() {
        return giahantap == 0 ? giamontap * thoigiantap : giamontap * thoigiantap * giahantap  ;
    }

    public void setGiahantap(int giahantap) {
        this.giahantap = giahantap;
    }

    public int getGiahantap() {
        return giahantap;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mon hoc: Gym, Yoga,vv..");
        this.setMontap(sc.nextLine());
        System.out.println("Nhap thoi gian tap");
        this.setThoigiantap(sc.nextInt());
        this.setNgaydangky(LocalDate.now());
        this.setNgayketthuc(this.ngaydangky.plusMonths(this.getThoigiantap()));
        this.setGiamontap(this.getGiamontap());
     
        this.setGiahantap(0);
    }

    public void xuat(){
        kh.xuat();
        System.out.println("Mon tap " + montap);
        System.out.println("Thoi gian tap " + thoigiantap + " thang");
        System.out.println("Ngay dang ky " + ngaydangky);
        System.out.println("Ngay ket thuc " + ngayketthuc);
        System.out.println("Gia mon tap " + giamontap);
        System.out.println("Gia han tap " + giahantap);
        System.out.println("Thanh Toan " + getThanhtien());
    }

    @Override
    public String toString() {
        return "LichTap{" + "kh=" + kh + ", montap=" + montap + ", thoigiantap=" + thoigiantap + ", ngaydangky=" + ngaydangky + ", ngayketthuc=" + ngayketthuc + ", giamontap=" + giamontap + ", giahantap=" + giahantap + '}';
    }
}
