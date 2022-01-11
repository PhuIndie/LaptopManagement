/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NV_BanHang extends NV_NhanVien {
    Scanner sc = new Scanner(System.in);
    public static double sogiolam;

    public NV_BanHang(double sogiolam) {
        this.sogiolam = sogiolam;
    }
    public NV_BanHang() {
    }

    public double getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam() {
        System.out.println("Nhập số giờ làm :");
        sogiolam = sc.nextDouble();
    }
    
    public void chucvu() {
        Chucvu = "Bán Hàng";
    }
    public void input() {
        super.input();
        setSogiolam();
        System.out.println("Lương là : " + tinhluong());
        
    }
    public static long hesoluong(){
        return Hsluong = 37500;
    }
    public static double tinhluong() {
        return hesoluong() * sogiolam;
    }
    
}
