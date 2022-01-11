///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package laptop;
//
//import java.util.Scanner;
//import static laptop.KH_QLKhachHang.sc;
//
///**
// *
// * @author Dell
// */
//public class NV_QuanLiNVTest {
//     private int n;
//     final int max=1000;
//    Scanner sc = new Scanner(System.in);
//    private NV_NhanVien []nhanvien;
//
//    public int getN() {
//        return n;
//    }
//
//    public void setN(int n) {
//        this.n = n;
//    }
//    public NV_NhanVien[] getNhanvien() {
//        return nhanvien;
//    }
//
//    public void setNhanvien(NV_NhanVien[] nhanvien) {
//        this.nhanvien = nhanvien;
//    }
//
//    public void ThemNV() {
//        System.out.println("Nhập số nhân viên");
//        this.setN(sc.nextInt());
//        NV_NhanVien[] nhanvien = new NV_NhanVien[1000];
//        for(int i = 0;i<this.getN();i++) {
//        System.out.println("Nhập Thông Tin Nhân Viên Thứ " + (i+1)+" :") ;
//        System.out.println("Chọn loại nhân viên :");
//        System.out.println("1. Quản Lí");
//        System.out.println("2. Bán Hàng");
//        System.out.println("3. Sửa chữa");                        
//        int choose = sc.nextInt();
//        if(choose == 1) {
//            nhanvien[i]= new NV_QuanLi();
//            nhanvien[i].chucvu();
//        } else if (choose ==2) {
//            nhanvien[i]= new NV_BanHang();
//            nhanvien[i].chucvu();
//        } else if (choose ==3) {
//            nhanvien[i]= new NV_SuaChua();
//            nhanvien[i].chucvu();
//        }
//            nhanvien[i].input();
//        }
//        this.setNhanvien(nhanvien);
//    }
//    public void addNV(){
//        NV_QuanLiNVTest a = new NV_QuanLiNVTest();
//        System.out.println("Nhập số lượng nhân viên muốn thêm :");
//        int x = sc.nextInt();
//        NV_NhanVien[] nhanvien1 = new NV_NhanVien[max];
//        for(int i = n; i < n + x; i++){
//            System.out.println("Nhập vào nhân viên thứ " + "00" +(i+ 1) + " : ");
//            System.out.println("Chọn loại nhân viên :");
//            System.out.println("1. Quản Lí");
//            System.out.println("2. Bán Hàng");
//            System.out.println("3. Sửa chữa");                        
//            int choose = sc.nextInt();
//            if(choose == 1) {
//                nhanvien1[i]= new NV_QuanLi();
//                nhanvien1[i].chucvu();
//            } else if (choose ==2) {
//                nhanvien1[i]= new NV_BanHang();
//                nhanvien1[i].chucvu();
//            } else if (choose ==3) {
//                nhanvien1[i]= new NV_SuaChua();
//                nhanvien1[i].chucvu();
//            }
//                nhanvien1[i].input();
//                nhanvien[i]=nhanvien1[i];
//  
//    }
//            n+= x;
//   }
//    public void SuaNV(){
//        System.out.println("Nhập mã số nhân viên muốn sửa :" + sc.nextLine());
//        String manv = sc.nextLine();
//        int x = 0;
//        for(int i = 0; i < n; i++)
//        if(nhanvien[i].getManv().equalsIgnoreCase(manv))  x = i; 
//        boolean dk = true;
//        while(dk == true){
//            System.out.println("----------------------------------");
//            System.out.println("1. Sửa mã nhân viên :");
//            System.out.println("2. Sửa thông tin cá nhân của nhân viên :");
//            System.out.println("3. Thoát !");
//            int k = sc.nextInt();  
//            switch (k) {
//                case 1:
//                    System.out.println("Nhập mã nhân viên mới :" + sc.nextLine());
//                    this.nhanvien[x].setManv(sc.nextLine());
//                    System.out.println("Da sua thanh cong !");
//                    break;
//                case 2:
//                    Boolean dk1 = true;
//                    while(dk1 == true) {
//                        System.out.println("1. Sửa họ tên : ");
//                        System.out.println("2. sửa ngày sinh : ");
//                        System.out.println("3. Sửa địa chỉ : ");
//                        System.out.println("4. Sửa số điện thoại : ");
//                        System.out.println("5. Sửa chứng minh thư :");
//                        System.out.println("6. Thoát!");
//                        System.out.print("Nhập lựa chọn : ");
//                        int k1 = sc.nextInt();
//                        switch(k1){
//                            case 1 :
//                                System.out.println("Nhập họ tên mới:" + sc.nextLine());
//                                this.nhanvien[x].setHoten(sc.nextLine());
//                                System.out.println("Upgrade successfull !");
//                                break;
//                            case 2 :
//                                System.out.println("Nhập ngày sinh mới :" + sc.nextLine());
//                                this.nhanvien[x].setNgaysinh(sc.nextLine());
//                                System.out.println("Upgrade successfull !");
//                                break;
//                            case 3 :
//                                System.out.println("Nhập địa chỉ mới :" + sc.nextLine());
//                                this.nhanvien[x].setDiachi(sc.nextLine());
//                                System.out.println("Upgrade successfull !");
//                                break;
//                            case 4 :
//                                System.out.println("Nhập số điện thoại mới :" + sc.nextLine());
//                                this.nhanvien[x].setSodt(sc.nextLine());
//                                System.out.println("Upgrade successfull !");
//                                break;
//                            case 5 :
//                                System.out.println("Nhập số chứng minh mới : " + sc.nextLine());
//                                this.nhanvien[x].setCccd(sc.nextLine());
//                                System.out.println("Upgrade successfull !");
//                                break;
//                            case 6 :
//                                System.out.println("Đã thoát!");
//                                dk1 = false;
//                                break;
//                            default:
//                                System.out.println("Mời nhập lại !");
//                                break;
//                        }
//                    }
//                case 3:
//                    System.out.println("Đã thoát !");
//                    dk = false;
//                    break;
//                default:
//                    System.out.println("Mời nhập lại !");
//                    break;
//            }
//
//
//        }
//    }
//    public void XoaNV(){ 
//        System.out.println("Nhập mã nhân viên :"+ sc.nextLine());
//        String manv = sc.nextLine();
//        for(int i = 0; i < n; i++)
//            if(nhanvien[i].getManv().equalsIgnoreCase(manv)){
//               for(int j = i ; j < n; j++)
//                    nhanvien[j] = nhanvien[j+1];
//                    n--;     
//            }
//    }    
//    public static void main(String[] args) {
//        NV_QuanLiNVTest a = new NV_QuanLiNVTest();
//        a.ThemNV();
//        //a.addNV();
//        for(int i=0; i<a.getN();i++) {
//        System.out.println(a.nhanvien[i].toString());
//        } 
//        //a.SuaNV();
//        a.XoaNV();
//        for(int i=0; i<a.getN();i++) {
//        System.out.println(a.nhanvien[i].toString());
//        } 
//    }
//}
