/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Scanner;
public class SP_CauHinh {
    Scanner sc = new Scanner(System.in);
    protected String ram;
    protected String cpu;
    protected String ocung;
    protected String manhinh;
    protected String ketnoi;
    protected String hedieuhanh;
    protected String kichthuoc;
    
    public SP_CauHinh(){
        ram=null;
        cpu=null;
        ocung=null;
        manhinh=null;
        ketnoi=null;
        hedieuhanh=null;
        kichthuoc=null;
    }
    
    public SP_CauHinh(String ram, String cpu, String ocung, String manhinh, String ketnoi, String hedieuhanh, String kichthuoc) {
        this.ram = ram;
        this.cpu = cpu;
        this.ocung = ocung;
        this.manhinh = manhinh;
        this.ketnoi = ketnoi;
        this.hedieuhanh = hedieuhanh;
        this.kichthuoc = kichthuoc;
    }
    
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOcung() {
        return ocung;
    }

    public void setOcung(String ocung) {
        this.ocung = ocung;
    }

    public String getManhinh() {
        return manhinh;
    }

    public void setManhinh(String manhinh) {
        this.manhinh = manhinh;
    }

    public String getKetnoi() {
        return ketnoi;
    }

    public void setKetnoi(String ketnoi) {
        this.ketnoi = ketnoi;
    }

    public String getHedieuhanh() {
        return hedieuhanh;
    }

    public void setHedieuhanh(String hedieuhanh) {
        this.hedieuhanh = hedieuhanh;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
    public void input() {
        System.out.println("Nhập RAM :");
        ram = sc.nextLine(); setRam(ram);
        System.out.println("Nhập CPU : ");
        cpu = sc.nextLine(); setCpu(cpu);
        System.out.println("Nhập ổ cứng :");
        ocung = sc.nextLine(); setOcung(ocung);
        System.out.println("Nhập màn hình : ");
        manhinh = sc.nextLine();setManhinh(manhinh);
        System.out.println("Nhập hệ điều hành :");
        hedieuhanh = sc.nextLine();setHedieuhanh(hedieuhanh);
        System.out.println("Nhập kích thước : ");
        kichthuoc = sc.nextLine(); setKichthuoc(kichthuoc);
    }
    public String toString() {
        return ram +"-"+cpu+"-"+ocung+"-"+manhinh+"-"+hedieuhanh+"-"+kichthuoc;
    }
}
    