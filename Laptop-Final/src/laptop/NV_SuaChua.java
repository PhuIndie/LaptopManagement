/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Random;
import java.util.Scanner;
public class NV_SuaChua extends NV_NhanVien {
    Scanner sc = new Scanner(System.in);
    public static double sogiolam;

    public NV_SuaChua(double sogiolam) {
        this.sogiolam = sogiolam;
    }
    public NV_SuaChua() {
    }

    public double getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam() {
        System.out.println("Nhập số giờ làm :");
        sogiolam = sc.nextDouble();
    }
    
    public void chucvu() {
        Chucvu = "Sửa Chữa";
    }
    public void input() {
        super.input();
        setSogiolam();
        
    }
    public static long hesoluong(){
        return Hsluong = 43750;
    }
    public int timesuachua(){
        Random ran = new Random();
        return ran.nextInt(10) + 2;
    }
    public static double tinhluong() {
        return hesoluong() * sogiolam;
    }
    
}
