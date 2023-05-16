/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom11;
import java.util.Scanner;
/**
 *
 * @author kiên bùi
 */
public class LoginAdmin  {
    private String tendn, matkhau;

    public LoginAdmin() {
        this.tendn = "nhom11";
        this.matkhau = "12345@";
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public boolean kiemtra(String tendn, String matkhau){
        if(this.getTendn().equals(tendn) && this.getMatkhau().equals(matkhau)){
            return false;
        }
        System.out.println("Nhap Ten ADMIN hoac pass khong hop le !: ");
        return true;

    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        String ten;
        String pass;
        do {
            System.out.println("Nhap ten ADMIN: ");
            ten = sc.nextLine();
            System.out.println("Nhap mat khau: ");
            pass = sc.nextLine();
        }while (this.kiemtra(ten,pass));
    }
}
