package laptop;

import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;



public  class ThanhToan {
    private double tragop;
    private String trangay;
    SP_SanPham sp;

    static Scanner sc = new Scanner(System.in);
    public ThanhToan() {
        tragop = 0;
        trangay = null;

    }

    public ThanhToan(double tragop, String trangay) {
        this.tragop = tragop;
        this.trangay = trangay;
    }


    public double getTragop() {
        return this.tragop/1000000;
    }

    public void setTragop(double tragop) {
        this.tragop = tragop;
    }

    public String getTrangay() {
        return this.trangay;
    }

    public void setTrangay(String trangay) {
        this.trangay = trangay;
    }

    public SP_SanPham getSp() {
        return this.sp;
    }

    public void setSp(SP_SanPham sp) {
        this.sp = sp;
    }

    public double laisuat(double lai){
        if(lai == 1) return 1;
        if(lai == 2) return 2;
        if(lai == 3) return 3;
        return 0;
    }
    public double Tien(double time,double laisuat,double tratruoc){
        return (this.getSp().getGia() - tratruoc)*laisuat/100 + (this.getSp().getGia() - tratruoc)/time;
    }


    public void menu(){
        boolean dk = true;
        while(dk){
            System.out.println();
            System.out.println("1. Thanh toán ngay");
            System.out.println("2. Trả góp ");
            System.out.println("0 . Thoat!");
            System.out.print("Nhập sự lựa chọn : ");
            int key = sc.nextInt();
            switch(key){
                case 1 :
                    System.out.print("Moi nhap so tien thanh toan tai day : " );
                    Double a = sc.nextDouble();
                    if(this.getSp().getGia() > a)  System.out.println("So tien nhap khong du ,moi nhap lai !");
                        else if(this.getSp().getGia() == a) System.out.println("Thanh toan thanh cong !");
                                else System.out.println("Số tiền trả lại cho bạn : " +(a - this.getSp().getGia()));
                    break;
                case 2 :
                    boolean dk1 = true;
                    while(dk1){
                        System.out.println("1. Lai suat : 1 %/thang");
                        System.out.println("2. Lai suat : 2 %/thang");
                        System.out.println("3. Lai suat : 3 %/thang");
                        System.out.println("0. Thoat!");
                        System.out.print("Nhap lua chon :");
                        int key1 = sc.nextInt();
                        switch(key1){
                            case 1 :
                                System.out.print("Nhap so tien tra truoc : ");
                                double tratruoc1 = sc.nextDouble();
                                System.out.print("Nhap so thang tra gop : ");
                                double time1 = sc.nextDouble();
                                System.out.println("So tien ban phai tra hang thang : " + (double) Math.round( Tien(time1, 1, tratruoc1)* 10) / 10);
                                break;
                            case 2 :
                                System.out.print("Nhap so tien tra truoc : ");
                                double tratruoc2 = sc.nextDouble();
                                System.out.print("Nhap so thang tra gop : ");
                                double time2 = sc.nextDouble();
                                System.out.println("So tien ban phai tra hang thang : " + (double) Math.round( Tien(time2, 1, tratruoc2)* 10) / 10);
                                break;
                            case 3 :
                                System.out.print("Nhap so tien tra truoc : ");
                                double tratruoc3 = sc.nextDouble();
                                System.out.print("Nhap so thang tra gop : ");
                                double time3 = sc.nextDouble();
                                System.out.println("So tien ban phai tra hang thang : " + (double) Math.round( Tien(time3, 1, tratruoc3)* 10) / 10);
                                break;
                            case 0 : 
                                System.out.println("Ban chon thoat !");
                                dk1 = false;
                                break;
                                        
                        }

                    }
                    case 0 :
                        System.out.println("Ban chon thoat !");
                        dk = false;
                        break;
                        
            
            }
        }
    }

//    public static void main(String[] args) {
//        SP_SanPham a = new SP_SanPham();
//        a.input();
//        ThanhToan b = new ThanhToan();
//        b.setSp(a);
//        b.menu();
//    }

}
