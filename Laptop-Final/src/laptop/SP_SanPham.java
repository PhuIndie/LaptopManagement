/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Scanner;
public class SP_SanPham extends SP_CauHinh {
    Scanner sc = new Scanner(System.in);
    protected String masp;
    protected String tensp;
    protected String hang;
    protected String nhucau;
    protected double gia;
    protected String danhgia;
    protected SP_CauHinh cauhinh;

    public SP_SanPham() {
    }

    public SP_SanPham(String masp, String tensp, String hang, String nhucau, double gia, String danhgia, SP_CauHinh cauhinh, String ram, String cpu, String ocung, String manhinh, String ketnoi, String hedieuhanh, String kichthuoc) {
        super(ram, cpu, ocung, manhinh, ketnoi, hedieuhanh, kichthuoc);
        this.masp = masp;
        this.tensp = tensp;
        this.hang = hang;
        this.nhucau = nhucau;
        this.gia = gia;
        this.danhgia = danhgia;
        this.cauhinh = cauhinh;
    }
    
    
    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNhucau() {
        return nhucau;
    }

    public void setNhucau(String nhucau) {
        this.nhucau = nhucau;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    public SP_CauHinh getCauhinh() {
        return cauhinh;
    }

    public void setCauhinh(SP_CauHinh cauhinh) {
        this.cauhinh = cauhinh;
    }
    public void input() {
        System.out.println("Nhập mã sản phẩm :");
        masp = sc.nextLine(); setMasp(masp);
        System.out.println("Nhập tên sản phẩm :");
        tensp = sc.nextLine(); setTensp(tensp);
        System.out.println("Nhập hãng : ");
        hang = sc.nextLine(); setHang(hang);
        System.out.println("Nhập nhu cầu :");
        nhucau = sc.nextLine(); setNhucau(nhucau);
        System.out.println("Nhập giá tiền : ");
        gia = sc.nextDouble(); setGia(gia);
        super.input();
        System.out.println("Nhập đánh giá : ");
        danhgia = sc.nextLine(); setDanhgia(danhgia);
        
    }
    public void output() {
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-15s %-15s %-10s %-20s %-17s %-5s %-15s %-10s %-25s %-15s %-15s %-10s \n",this.getMasp(),this.getTensp(),this.getHang(),this.getNhucau(),this.getGia()/1000000,this.getRam(),this.getCpu(),this.getOcung(),this.getManhinh(),this.getHedieuhanh(),this.getKichthuoc(),this.getDanhgia());
    }   
    public String toString() {
        return masp+"-"+tensp+"-"+hang+"-"+nhucau+"-"+gia+"-"+super.toString()+"-"+danhgia;
    }
//    public static void main(String[] args) {
//        SP_SanPham a = new SP_SanPham();
//        a.input();
//        a.output();
//    }
}
