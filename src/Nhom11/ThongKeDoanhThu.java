/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom11;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author kiên bùi
 */
public class ThongKeDoanhThu {
     private ArrayList<LichTap> danhsachkhoatap;
        public ThongKeDoanhThu(quanlylichtap qllt) {
            danhsachkhoatap = qllt.getDanhsachlichtap();
        }
        public void insert(LichTap lt){
            this.danhsachkhoatap.add(lt);
        }
        public double tinhDoanhThuTheoThang(int thang, int nam) {
            double doanhThu = 0;
            for (LichTap lichTap : danhsachkhoatap) {
                LocalDate ngaydangky = lichTap.getNgaydangky();
                if (ngaydangky.getMonthValue() == thang && ngaydangky.getYear() == nam) {
                    doanhThu += lichTap.getThanhtien();
                }
            }
            return doanhThu;
        }

        public double tinhDoanhThuTheoNam(int nam) {
            double doanhThu = 0;
            for (LichTap lichTap: danhsachkhoatap) {
                LocalDate ngaydangky = lichTap.getNgaydangky();
                if (ngaydangky.getYear() == nam) {
                    doanhThu += lichTap.getThanhtien();
                }
            }
            return doanhThu;
        }
}
