/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nhom11;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author kiên bùi
 */
public class KhachHang implements Serializable {
    private String maKh,ten,diachi,sodt,gioitinh;
    private LocalDate ngaysinh;

    public KhachHang(String maKh, String ten, String diachi, String sodt, String gioitinh,LocalDate ngaysinh) {
        this.maKh = maKh;
        this.ten = ten;
        this.diachi = diachi;
        this.sodt = sodt;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma");
        this.setMaKh(sc.nextLine());
        System.out.println("Nhap Ten");
        this.setTen(sc.nextLine());
        System.out.println("Nhap Dia Chi");
        this.setDiachi(sc.nextLine());
        System.out.println("Nhap SoDienThoai");
        this.setSodt(sc.nextLine());
        System.out.println("Nhap gioi tinh (nam or nu)");
        this.setGioitinh(sc.nextLine());
        System.out.println("Nhap Ngay Sinh");
        String ngaysinh = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(ngaysinh, formatter);
        this.setNgaysinh(date);
    }

    public KhachHang() {
    }
    

    public void xuat(){
        System.out.println("Ma " + maKh);
        System.out.println("Ten " + ten);
        System.out.println("Dia chi " + diachi);
        System.out.println("so dien thoai " + sodt);
        System.out.println("gioi tinh " + gioitinh);
        System.out.println("Ngay Sinh " + ngaysinh);
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKh=" + maKh + ", ten=" + ten + ", diachi=" + diachi + ", sodt=" + sodt + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + '}';
    }
}