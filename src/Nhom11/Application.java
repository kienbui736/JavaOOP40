/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom11;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author kiên bùi
 */
public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new LoginAdmin().nhap();
        quanlyKhachHang qlks = new quanlyKhachHang();
        quanlylichtap qllt = new quanlylichtap();
        KhachHang kh1 = new KhachHang("ms1","Minh Kien","Bien Hoa","0943456789","nam",LocalDate.of(2023,02,02));
        KhachHang kh2 = new KhachHang("ms3","Minh Tuan ","Tan Phong ","0983888999","nam",LocalDate.of(2023,03,12));
        KhachHang kh3 = new KhachHang("ms2","Minh Quang ","Buu Long","09033344455","nam",LocalDate.of(2023,04,22));
        qlks.themKhachHang(kh1);
        qlks.themKhachHang(kh2);
        qlks.themKhachHang(kh3);
        int luachon = 0;
        do {
            System.out.println("1. Them khach hang ");
            System.out.println("2. Sua khach hang ");
            System.out.println("3. Xoa khach hang ");
            System.out.println("4. Tim kiem khach hang ");
            System.out.println("5. Xuat khach hang");
            System.out.println("6. Them lich tap ");
            System.out.println("7. Tim kiem lich tap");
            System.out.println("8. Thong ke doanh thu");
            System.out.println("9. Xuat dnah sach lich tap can gia han");
            System.out.println("10.Gia han lich tap");
            System.out.println("");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:
                    KhachHang kh = new KhachHang();
                    kh.nhap();
                    qlks.themKhachHang(kh);
                    break;
                case 2:
                    System.out.println("Nhap Ma khach hang");
                    String makh = sc.nextLine();
                    if (qlks.timKhachHangTheoMa(makh) != null) {
                        System.out.println("Nhap Ten");
                        qlks.timKhachHangTheoMa(makh).setTen(sc.nextLine());
                        System.out.println("Nhap Dia Chi");
                        qlks.timKhachHangTheoMa(makh).setDiachi(sc.nextLine());
                        System.out.println("Nhap SoDienThoai");
                        qlks.timKhachHangTheoMa(makh).setSodt(sc.nextLine());
                        System.out.println("Nhap gioi tinh (nam or nu)");
                        qlks.timKhachHangTheoMa(makh).setGioitinh(sc.nextLine());
                        System.out.println("Nhap Ngay Sinh");
                        String ngaysinh = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        LocalDate date = LocalDate.parse(ngaysinh, formatter);
                        qlks.timKhachHangTheoMa(makh).setNgaysinh(date);
                        qlks.suaKhachHang(qlks.timKhachHangTheoMa(makh));
                    }

                    break;
                case 3:

                    System.out.println("Nhap Ma khach hang");
                    String maKH = sc.nextLine();
                    qlks.xoaKhachHang(maKH);
                    break;
                case 4:
                    System.out.println("Nhap Ma khach hang");
                    String mak = sc.nextLine();
                    System.out.println(qlks.timKhachHangTheoMa(mak));
                    break;
                case 5:
                    qlks.xuatDanhSachKhachHang();
                    break;
                case 6:
                    System.out.println("Nhap Ma khach hang");
                    String khCanTim = sc.nextLine();
                    LichTap lh = new LichTap(qlks.timKhachHangTheoMa(khCanTim));
                    lh.nhap();
                    qllt.themLichTap(lh);
                    break;
                case 7:
                    System.out.println("Nhap Ma khach hang");
                    String khCanSua = sc.nextLine();
                    System.out.println(qllt.layLichTap(khCanSua));

                    break;

                case 8:
                    ThongKeDoanhThu tkdt = new ThongKeDoanhThu(qllt);
                    System.out.println("1. doanh thu theo thang");
                    System.out.println("2. doanh thu theo nam");
                    int chon = sc.nextInt();
                    if (chon == 1) {
                        System.out.println("Nhap thang ");
                        int thang = sc.nextInt();
                        System.out.println("Nhap nam ");
                        int nam = sc.nextInt();
                        System.out.println("Doanh thu theo thang " + thang + " nam " + nam + ": "+ tkdt.tinhDoanhThuTheoThang(thang, nam));
                        
                    } else {
                        System.out.println("Nhap nam ");
                        int nam = sc.nextInt();
                        System.out.println("Doanh thu theo nam " + nam + ": " + tkdt.tinhDoanhThuTheoNam(nam));
                    }
                    break;
                case 9:
                    System.out.println("Danh sach cac lich tap can gia han");
                    qllt.danhsachcangiahan();
                    break;
                case 10: 
                    System.out.println("Nhap Ma khach hang");
                    String khCanGiaHan = sc.nextLine();
                    qllt.giaHan(khCanGiaHan);
                    break;

            }

        } while (luachon != 0);
    }
}
