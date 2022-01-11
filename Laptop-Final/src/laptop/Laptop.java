/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laptop;

import java.io.IOException;
import java.util.Scanner;

public class Laptop {
    Scanner sc = new Scanner(System.in);
    public void menu() throws IOException{
        boolean dk = true;
        while(dk == true) {
            System.out.println("+----------------------------+");
            System.out.println("|            MENU            |");
            System.out.println("+----------------------------+");
            System.out.println("| 1. Nhân Viên               |");
            System.out.println("| 2. Khách Hàng              |");
            System.out.println("| 0. Thoát                   |");
            System.out.println("+----------------------------+");
            System.out.print("Nhập lựa chọn của bạn");
            int select = sc.nextInt();
            switch(select) {
                case 1 :
                    NV_QuanLiNV a = new NV_QuanLiNV();
                    a.readFromFile();
                    a.menu();
                    break;
                case 2 :
                    SP_QLSanPham b = new SP_QLSanPham();
                    b.readFromFile();
                    b.xuatdssp();
                    boolean dk2 = true;
                    while(dk2 == true) {
                        System.out.println();
                        System.out.println("+-------------------------+");
                        System.out.println("|Mời lựa chọn!            |");
                        System.out.println("|1. Tìm kiếm sản phẩm     |");
                        System.out.println("|2. Mua Sản Phẩm          |");
                        System.out.println("|3. Bảo hành,sửa chửa     |");
                        System.out.println("|0. Thoát                 |");
                        System.out.println("+-------------------------+");
                        int select2 = sc.nextInt();
                        switch(select2) {
                            case 1 :
                                b.timkiemsp();
                                break;
                            case 2 :
                                System.out.print("Nhập mã sản phẩm muốn mua : " + sc.nextLine());
                                String mua = sc.nextLine();
                                double tien = 0;
                                int index = 0;
                                for(int i = 0; i < b.getSosp(); i++)
                                    if(b.sanpham[i].getMasp().equalsIgnoreCase(mua)){
                                        b.sanpham[i].output();
                                        tien = b.sanpham[i].getGia();
                                        index = i;
                                    }
                                boolean dk3 = true;
                                KH_QLKhachHang c = new KH_QLKhachHang();
                                c.readFromFile();
                                while(dk3){
                                    System.out.println();
                                    System.out.println("+------------+");
                                    System.out.println("| 1. Mua     |");
                                    System.out.println("| 0. Thoát   |");
                                    System.out.println("+------------+");
                                    System.out.print("Nhập lựa chọn :");
                                    int key3 = sc.nextInt();
                                    switch(key3){
                                        case 1 :
                                            
                                            KH_PhieuXuat e = new KH_PhieuXuat();
                                            KH_KhachHang kh = new KH_KhachHang();
                                            e.setKh(c.themkh1id());
                                            e.Ouput_PX(b.sanpham[index]);
                                            ThanhToan d = new ThanhToan();
                                            d.setSp(b.sanpham[index]);
                                            d.menu();
                                            break;
                                        case 0 :
                                            System.out.println("Đã thoát");
                                            dk3 = false;
                                            break;
                                    }
                                }
                                break;
                            case 3 :
                                NV_SuaChua suachua = new NV_SuaChua();
                                System.out.println("Sản phẩm đang được bảo hành,vui lòng nhận lại sản phẩm sau " +  suachua.timesuachua() + "ngày");
                                break;
                            case 0 :
                                dk2 = false;
                                break;
                            default :
                                System.out.println("Xin mời nhập lại");
                                break;
                        }
                    }
                    break;
                case 0 :
                    dk = false;
                    break;
                default :
                    System.out.println("Mời Nhập Lại!");
                    break;
                  
            }
    }}
    public static void main(String[] args) throws IOException{
    Laptop a = new Laptop();
    a.menu();
}}
