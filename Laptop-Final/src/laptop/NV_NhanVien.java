
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;


import java.util.Scanner;

public class NV_NhanVien extends ConNguoi {
    Scanner sc = new Scanner(System.in);
    protected String Manv;
    protected String Chucvu;
    protected static long Hsluong;

    public NV_NhanVien() {
    }
    
    public NV_NhanVien(String Manv, String Tennv, String Chucvu, long Hsluong) {
        this.Manv = Manv;
        this.Chucvu = Chucvu;
        this.Hsluong = Hsluong;
    }
    public NV_NhanVien(String Manv, String Hoten, String Ngaysinh, String Chucvu, String Diachi, String Sodt, String cccd, long Hsluong) {
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Chucvu = Chucvu;
        this.Diachi = Diachi;
        this.Sodt = Sodt;
        this.cccd = cccd;
        this.Hsluong = Hsluong;

    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public long getHsluong() {
        return Hsluong;
    }

    public void setHsluong(Long Hsluong) {
        this.Hsluong = Hsluong;
    }
    public void input() {
        System.out.println("Nhập mã nhân viên :");
        Manv = sc.nextLine();
        super.input();
    }
    public void output() {
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
         System.out.printf("%-15s %-20s %-15s %-10s %-20s %-15s %-25s %-12s \n",this.getManv(),this.getHoten(),this.getNgaysinh(),this.getChucvu(),this.getDiachi(),this.getSodt(),this.getCccd(),this.hesoluong());
    }   
    public void chucvu() {   
        System.out.println("Chua biet chuic vu gi!!");     
    }
    public static long hesoluong(){
        return 0;
    }
    public static double tinhluong(double n){
        return Hsluong * n;
    }
    public String toString() {
       return Manv + "-" + Hoten + "-" + Ngaysinh +"-"+ Chucvu + "-" + Diachi + "-" + Sodt + "-" + cccd + "-" + Hsluong ;
    }   
}
