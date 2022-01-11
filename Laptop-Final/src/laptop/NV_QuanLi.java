/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;
import java.util.Scanner;
public class NV_QuanLi extends NV_NhanVien {
    Scanner sc = new Scanner(System.in);
    public static double sogiolam;

    public NV_QuanLi(double sogiolam) {
        this.sogiolam = sogiolam;
    }
    public NV_QuanLi() {
    }

    public double getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam() {
        System.out.println("Nhập số giờ làm :");
        sogiolam = sc.nextDouble();
    }
    public void setHsluong(long Hsluong) {
        this.Hsluong = Hsluong;
    }
    @Override
   public void chucvu() {
        Chucvu = "Quản Lí";
    }
    public void output() {
        setSogiolam();
        System.out.println("Lương là : " + tinhluong());
    }
    public static long hesoluong(){
        return Hsluong = 87500;
    }
    public static double tinhluong() {
        return hesoluong() * sogiolam;
    }
}
