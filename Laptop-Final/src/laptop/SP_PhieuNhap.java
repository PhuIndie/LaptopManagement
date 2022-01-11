/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Scanner;

public class SP_PhieuNhap extends SP_SanPham {
    Scanner sc = new Scanner(System.in);
    private String ngaynhap;
    private String manhap;

    public SP_PhieuNhap() {
    }

    public SP_PhieuNhap(String ngaynhap, String manhap, String masp, String tensp, String hang, String nhucau, double gia, String danhgia, SP_CauHinh cauhinh, String ram, String cpu, String ocung, String manhinh, String ketnoi, String hedieuhanh, String kichthuoc) {
        super(masp, tensp, hang, nhucau, gia, danhgia, cauhinh, ram, cpu, ocung, manhinh, ketnoi, hedieuhanh, kichthuoc);
        this.ngaynhap = ngaynhap;
        this.manhap = manhap;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getManhap() {
        return manhap;
    }

    public void setManhap(String manhap) {
        this.manhap = manhap;
    }
    public void input() {
        System.out.println("Nhập ngày nhập hàng :");
        ngaynhap = sc.nextLine(); setNgaynhap(ngaynhap);
        System.out.println("Nhập mã nhập hàng :");
        manhap = sc.nextLine(); setManhap(manhap);
        super.input();
    }
    public String toString() {
        return ngaynhap + "\t" + manhap +"\t"+super.toString();
    }
//    public static void main(String[] args) {
//        SP_PhieuNhap a = new SP_PhieuNhap();
//        a.input();
//    }
}
