/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Scanner;
interface Input{
    public void input();
    public String toString();
}

public abstract class ConNguoi implements Input{
    Scanner sc = new Scanner(System.in);
    protected String Hoten;
    protected String Ngaysinh;
    protected String Diachi;
    protected String Sodt;
    protected String cccd;

    public ConNguoi() {
    }

    public ConNguoi(String Hoten, String Ngaysinh, String Diachi, String Sodt, String cccd) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Sodt = Sodt;
        this.cccd = cccd;
    }
    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getSodt() {
        return Sodt;
    }

    public void setSodt(String Sodt) {
        this.Sodt = Sodt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    public void input() {
        System.out.println("Nhập Họ và Tên :"); 
        Hoten = sc.nextLine();
        System.out.println("Nhập Ngày Sinh :");
        Ngaysinh = sc.nextLine();
        System.out.println("Nhập Địa Chỉ :");
        Diachi = sc.nextLine();
        System.out.println("Nhập Số Điện Thoại :");
        Sodt = sc.nextLine();
        System.out.println("Nhập CCCD/CMND : ");
        cccd = sc.nextLine();
    }
    
    public String toString(){
        return Hoten + "-" + Ngaysinh + "-" + Diachi + "-" + Sodt + "-" + cccd ; 
    }
} 
