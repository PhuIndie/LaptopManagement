/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class NV_QuanLiNV {
    private int n;
    final int max = 1000;
    Scanner sc = new Scanner(System.in);
    private NV_NhanVien[] nhanvien = new NV_NhanVien[n];

    public NV_QuanLiNV() {
        n = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public NV_NhanVien[] getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NV_NhanVien[] nhanvien) {
        this.nhanvien = nhanvien;
    }
    
    public void addNV() throws IOException{
        // NV_QuanLiNV a = new NV_QuanLiNV();
        System.out.println("Nhập số lượng nhân viên muốn thêm :");
        int y = sc.nextInt();
        NV_NhanVien[] nhanvien1 = new NV_NhanVien[max];
        for(int i = n; i < n + y; i++){
            System.out.println("+----------Nhập vào nhân viên thứ " + "00" +(i+ 1) + " -------------------+");
            System.out.println("| Chọn loại nhân viên :                                   |");
            System.out.println("| 1. Bán Hàng                                             |");
            System.out.println("| 2. Sửa Chữa                                             |");        
            System.out.println("+---------------------------------------------------------+");              
            int choose = sc.nextInt();
            if(choose == 1) {
                nhanvien1[i]= new NV_BanHang();
                nhanvien1[i].chucvu();
            } else if (choose ==2) {
                nhanvien1[i]= new NV_SuaChua();
                nhanvien1[i].chucvu();
            } 
                nhanvien1[i].input();
                nhanvien[i]=nhanvien1[i];
        }
            
        n += y;
   }
    public void SuaNV(){
        System.out.println("Nhập mã số nhân viên muốn sửa :" + sc.nextLine());
        String manv = sc.nextLine();
        int x = 0;
        for(int i = 0; i < n; i++)
        if(nhanvien[i].getManv().equalsIgnoreCase(manv))  x = i; 
        boolean dk = true;
        while(dk == true){
            System.out.println();
            System.out.println("+-----------------------------------------+");
            System.out.println("| 1. Sửa mã nhân viên                     |");
            System.out.println("| 2. Sửa thông tin cá nhân của nhân viên  |");
            System.out.println("|3. Thoát !                               |");
            System.out.println("+-----------------------------------------+");
            int k = sc.nextInt();  
            switch (k) {
                case 1:
                    System.out.println("Nhập mã nhân viên mới :" + sc.nextLine());
                    this.nhanvien[x].setManv(sc.nextLine());
                    System.out.println("Đã sửa thành công");
                    break;
                case 2:
                    Boolean dk1 = true;
                    while(dk1 == true) {
                        System.out.println();
                        System.out.println("+--------------------------+");
                        System.out.println("| 1. Sửa họ tên :          |");
                        System.out.println("| 2. sửa ngày sinh :       |");
                        System.out.println("| 3. Sửa địa chỉ :         |");
                        System.out.println("| 4. Sửa số điện thoại :   |");
                        System.out.println("| 5. Sửa chứng minh thư :  |");
                        System.out.println("| 0. Thoát!                |");
                        System.out.println("+--------------------------+");
                        System.out.print("Nhập lựa chọn : ");
                        int k1 = sc.nextInt();
                        switch(k1){
                            case 1 :
                                System.out.println("Nhập họ tên mới:" + sc.nextLine());
                                this.nhanvien[x].setHoten(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 2 :
                                System.out.println("Nhập ngày sinh mới :" + sc.nextLine());
                                this.nhanvien[x].setNgaysinh(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 3 :
                                System.out.println("Nhập địa chỉ mới :" + sc.nextLine());
                                this.nhanvien[x].setDiachi(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 4 :
                                System.out.println("Nhập số điện thoại mới :" + sc.nextLine());
                                this.nhanvien[x].setSodt(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 5 :
                                System.out.println("Nhập số chứng minh mới : " + sc.nextLine());
                                this.nhanvien[x].setCccd(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 0 :
                                System.out.println("Đã thoát!");
                                dk1 = false;
                                break;
                            default:
                                System.out.println("Mời nhập lại !");
                                break;
                        }
                    }
                case 3:
                    System.out.println("Đã thoát !");
                    dk = false;
                    break;
                default:
                    System.out.println("Mời nhập lại !");
                    break;
            }


        }
    }

    public void writeToFile() throws IOException{
        File file = new File("test.txt");
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);  
        for(int i = 0; i < this.getN(); i++){
            outputStreamWriter.write(nhanvien[i].toString());
            // Dùng để xuống hàng
            outputStreamWriter.write("\n");
        }          
        outputStreamWriter.flush();
    }
    public void readFromFile() throws IOException{
        File file = new File("test.txt");
        nhanvien = new NV_NhanVien[1000];
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
 
        String line = "";
        int x = 0;
        while((line = reader.readLine()) != null){
            String[] s = line.split("-");
            nhanvien[x] = new NV_NhanVien();
            nhanvien[x].setManv(s[0]) ;
            nhanvien[x].setHoten(s[1]);
            nhanvien[x].setNgaysinh(s[2]);
            nhanvien[x].setChucvu(s[3]);
            nhanvien[x].setDiachi(s[4]);
            nhanvien[x].setSodt(s[5]);
            nhanvien[x].setCccd(s[6]);
            long Hs = Long.parseLong(s[7]);
            nhanvien[x].setHsluong(Hs);
            x++;
        }
        this.setN(x);
      
    }  
    public void OutputNV(){
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-15s %-20s %-15s %-10s %-20s %-15s %-25s %-12s \n","|Mã Nhân Viên","Họ và Tên","Ngày sinh","Chức vụ","Địa chỉ", "Số điện thoại","CCCD/CMND","Hệ số lương |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i = 0; i < this.getN(); i ++){
        System.out.printf("%-15s %-20s %-15s %-10s %-20s %-15s %-25s %-12s \n",nhanvien[i].getManv(),nhanvien[i].getHoten(),nhanvien[i].getNgaysinh(),nhanvien[i].getChucvu(),nhanvien[i].getDiachi(),
                nhanvien[i].getSodt(),nhanvien[i].getCccd(),nhanvien[i].getHsluong());

    }    
    }
   public static void main(String[] args) throws IOException{
           NV_QuanLiNV a = new NV_QuanLiNV();
           a.menu();
       }
    public void XoaNV(){ 
        System.out.println("Nhập mã nhân viên :"+ sc.nextLine());
        String manv = sc.nextLine();
        for(int i = 0; i < n; i++)
            if(nhanvien[i].getManv().equalsIgnoreCase(manv)){
               for(int j = i ; j < n; j++)
                    nhanvien[j] = nhanvien[j+1];
                    n--;     
            }
    }    
    public void menu() throws IOException{
        NV_QuanLiNV a = new NV_QuanLiNV();
        a.readFromFile();
        boolean dk = true;
        while(dk==true) {
            System.out.println();
            System.out.println("+-------------------------------+");
            System.out.println("|        Nhập Nhân Viên :       |");
            System.out.println("+-------------------------------+");
            System.out.println("| 1. Nhân viên Quản Lí          |");
            System.out.println("| 2. Nhân viên Bán Hàng         |");
            System.out.println("| 3. Nhân viên Sửa Chữa         |");
            System.out.println("| 0. Thoát                      |");
            System.out.println("+-------------------------------+");
            System.out.println("Nhập lựa chọn");
            int key = sc.nextInt();
            switch(key) {
                case 1 : 
                    boolean dk1 = true;
                    while(dk1 == true) {
                        System.out.println();
                        System.out.println("+-------------------------------+");
                        System.out.println("| 1. Tính lương                 |");
                        System.out.println("| 2. Thêm Nhân Viên             |");
                        System.out.println("| 3. Xuất Nhân Viên             |");
                        System.out.println("| 4. Sửa Nhân Viên              |");
                        System.out.println("| 5. Xóa Nhân Viên              |");
                        System.out.println("| 0. Thoát                      |");
                        System.out.println("+-------------------------------+");
                        System.out.println("Nhập lựa chọn");
                        int key2 = sc.nextInt();
                        switch(key2) {
                            case 1 :
                                System.out.println("Nhập mã nhân viên :"+ sc.nextLine());
                                String manv1 = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < a.getN(); i++){
                                    if(a.nhanvien[i].getManv().equalsIgnoreCase(manv1) && a.nhanvien[i].getChucvu().equalsIgnoreCase("Quản Lí") ){
                                        System.out.println("Nhập số giờ làm");
                                        Double giolam = sc.nextDouble();
                                        System.out.println("Lương của " + a.nhanvien[i].getHoten() + " là : " + a.nhanvien[i].tinhluong(giolam));
                                    }}
                                break;
                            case 2 :
                                a.addNV();
                                a.writeToFile();
                            break; 
                            case 3 :
                                a.OutputNV();
                                break; 
                            case 4 :
                                a.SuaNV();
                                break;
                            case 5 :
                                a.XoaNV();
                                a.writeToFile();
                                break;
                            case 0 :
                                System.out.println("Đã thoát !");
                                dk1 =false;
                                break;
                            default :
                                System.out.println("Mời nhập lại !");
                                break;
    
                        }}
                    break;
                case 2 :
                    System.out.println("Bán Hàng :");
                    boolean dk2 = true;
                    while(dk2 == true) {
                        System.out.println();
                        System.out.println("+-------------------------------+");
                        System.out.println("| 1. Tính Lương                 |");
                        System.out.println("| 2. Sản Phẩm                   |");
                        System.out.println("| 3. Quản Lí Khách Hàng         |");
                        System.out.println("| 0. Thoát                      |");
                        System.out.println("+-------------------------------+");
                        System.out.println("Nhập lựa chọn :");
                        int key3= sc.nextInt();
                        switch(key3) {
                            case 1 :
                                System.out.println("Nhập mã nhân viên :"+ sc.nextLine());
                                String manv2 = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < a.getN(); i++){
                                    if(a.nhanvien[i].getManv().equalsIgnoreCase(manv2) && a.nhanvien[i].getChucvu().equalsIgnoreCase("Bán Hàng") ){
                                        System.out.println("Nhập số giờ làm");
                                        Double giolam = sc.nextDouble();
                                        System.out.println("Lương của " + a.nhanvien[i].getHoten() + " là : " + a.nhanvien[i].tinhluong(giolam));
                                    }}
                                break;
                            case 2 :
                                SP_QLSanPham a1 = new SP_QLSanPham();
                                a1.menu();
                                break;
                            case 3 : 
                                KH_QLKhachHang a2 = new KH_QLKhachHang();
                                a2.menu();
                                break;
                            case 0 :
                                dk2 = false;
                                break;
                            default :
                                System.out.println("Mời nhập lại");
                                break;
                                
                        }
                    }
                    break;                  
                case 3 : 
                    System.out.println("Nhập mã nhân viên :"+ sc.nextLine());
                                String manv3 = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < a.getN(); i++){
                                    if(a.nhanvien[i].getManv().equalsIgnoreCase(manv3) && a.nhanvien[i].getChucvu().equalsIgnoreCase("Sửa Chữa") ){
                                        System.out.println("Nhập số giờ làm");
                                        Double giolam = sc.nextDouble();
                                        System.out.println("Lương của " + a.nhanvien[i].getHoten() + " là : " + a.nhanvien[i].tinhluong(giolam));
                                    }}
                    break;
                case 0 :
                    System.out.println("Đã thoát");
                    dk = false;
                    break;
                default:
                    System.out.println("Mời nhập lại !");
                    break;
        
    
            }
}
}
}
