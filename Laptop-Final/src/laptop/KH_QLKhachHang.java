package laptop;
import java.util.Scanner;
import java.io.*;
public class KH_QLKhachHang {
    private int soluong;
    private KH_KhachHang[] dskh = new KH_KhachHang[soluong];

    public KH_QLKhachHang() {
        soluong = 0;
        dskh = null;
    }

    public KH_QLKhachHang(int soluong, KH_KhachHang[] dskh) {
        this.soluong = soluong;
        this.dskh = dskh;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public ConNguoi[] getDskh() {
        return this.dskh;
    }

    public void setDskh(KH_KhachHang[] dskh) {
        this.dskh = dskh;
    }
    static Scanner sc = new Scanner(System.in);
    final int max = 1000;
    public void nhapdskh(){
        System.out.print("Nhap so luong khach hang :");
        this.setSoluong(sc.nextInt());
        dskh = new KH_KhachHang[max];
        for(int i = 0; i < soluong; i++){
            System.out.println("Nhap khach hang thu " + "00" +(i + 1) + " : ");
                dskh[i] = new KH_KhachHang();
                dskh[i].nhapkh();
        }
        //this.setArrsv(dskh);

    }

    public void xuatdskh(){
        System.out.println("Danh sach khach hang : ");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s \n","MAKH","HO TEN", "NGAY SINH","DIA CHI","SO DT", "CHUNG MINH THU");
        for(int i = 0; i < this.getSoluong() ; i ++)
            dskh[i].xuatkh();
    }

    public void timkiemkh(){
        System.out.println("Nhap ma khach hang :");
        String makh = sc.nextLine();
        for(int i = 0; i < dskh.length; i++)
            if(dskh[i].getMakh().equalsIgnoreCase(makh)){
                dskh[i].xuatkh();
                break;
            }
        } 
    

    public void xoakh(){ 
        System.out.println("Nhap ma khach hang :"+ sc.nextLine());
        String makh = sc.nextLine();
        for(int i = 0; i < soluong; i++)
            if(dskh[i].getMakh().equalsIgnoreCase(makh)){
               for(int j = i ; j < soluong; j++)
                    dskh[j] = dskh[j+1];
                    soluong--;     
            }
        
        
    }
    public void suakh(){
        System.out.println("Nhap ma so khach hang muon sua :" + sc.nextLine());
        String makh = sc.nextLine();
        int x = 0;
        for(int i = 0; i < soluong; i++)
        if(dskh[i].getMakh().equalsIgnoreCase(makh))  x = i; 
        boolean dk = true;
        while(dk == true){
            System.out.println("----------------------------------");
            System.out.println("1. Sua ma khach hang .");
            System.out.println("2. Sua thong tin ca nhan khach hang .");
            System.out.println("3. Thoát !");
            int k = sc.nextInt();  
            switch (k) {
                case 1:
                    System.out.println("Nhap ma so khach hang moi :" + sc.nextLine());
                    this.dskh[x].setMakh(sc.nextLine());
                    System.out.println("Da sua thanh cong !");
                    break;
                case 2:
                    Boolean dk1 = true;
                    while(dk1 == true) {
                        System.out.println("1. Sua ho ten .");
                        System.out.println("2. Sua ngay sinh .");
                        System.out.println("3. Sua đia chỉ .");
                        System.out.println("4. Sua so đien thoai .");
                        System.out.println("5. Sua chung minh thu .");
                        System.out.println("6. Thoat !");
                        System.out.print("Nhap su lua chon tai day : ");
                        int k1 = sc.nextInt();
                        switch(k1){
                            case 1 :
                                System.out.println("Nhap ho ten moi :" + sc.nextLine());
                                this.dskh[x].setHoten(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 2 :
                                System.out.println("Nhap vao ngay sinh moi :" + sc.nextLine());
                                this.dskh[x].setNgaysinh(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 3 :
                                System.out.println("Nhap vao dia chi moi :" + sc.nextLine());
                                this.dskh[x].setDiachi(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 4 :
                                System.out.println("Nhap so dien thoai moi :" + sc.nextLine());
                                this.dskh[x].setSodt(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 5 :
                                System.out.println("Nhap so chung minh thu moi : " + sc.nextLine());
                                this.dskh[x].setCccd(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 6 :
                                System.out.println("Ban chon thoat !");
                                dk1 = false;
                                break;
                            default:
                                System.out.println("Moi nhap lai !");
                                break;
                        }
                    }
                case 3:
                    System.out.println("Ban chon thoat !");
                    dk = false;
                    break;
                default:
                    System.out.println("Moi nhap lai!");
                    break;
            }


        }
    }
    public void writeToFile() throws IOException{
        File file = new File("khachhang.txt");
        OutputStream outputStream = new FileOutputStream(file,true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);  
        for(int i = 0; i < this.getSoluong(); i++){
            outputStreamWriter.write(dskh[i].toString());
            // Dùng để xuống hàng
            outputStreamWriter.write("\n");
        }          
        
        
        // Đây là phương thức quan trọng!
        // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
        outputStreamWriter.flush();
    }

    public void readFromFile() throws IOException{
        File file = new File("khachhang.txt");
        dskh = new KH_KhachHang[1000];
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
 
        String line = "";
        int x = 0;
        while((line = reader.readLine()) != null){
            String[] s = line.split("-");
            dskh[x] = new KH_KhachHang();
            dskh[x].setMakh(s[0]) ;
            dskh[x].setHoten(s[1]);
            dskh[x].setNgaysinh(s[2]);
            dskh[x].setDiachi(s[3]);
            dskh[x].setSodt(s[4]);
            dskh[x].setCccd(s[5]);
            x++;
        }
        this.setSoluong(x);
      
    }  
    public void themkh(){
        System.out.println("Nhap vao so luong khach hang muon them :");
        int x = sc.nextInt();
        KH_KhachHang[] arr = new KH_KhachHang[max];
        for(int i = soluong; i < soluong + x; i++){
            System.out.println("Nhap vao khach hang thu " + "00" +(i+ 1) + " : ");
            arr[i] = new KH_KhachHang();
            arr[i].nhapkh();
            dskh[i] = arr[i];
        }
        soluong += x;
    }
    public KH_KhachHang themkh1id(){
        KH_KhachHang arr = new KH_KhachHang();
        for(int i = soluong; i < soluong + 1; i++){
            System.out.println("Nhap vao khach hang thu " + "00" +(soluong+ 1) + " : ");
            arr.nhapkh();
            dskh[i] = arr;
        }
        soluong += 1;
        return arr;
    }

        public void menu() throws IOException{
            boolean danhap = true;
            KH_QLKhachHang a = new KH_QLKhachHang();
            a.readFromFile();
            boolean d = true;
            while(d == true){
                System.out.println("+------------------------------------------+");
                System.out.println("|             MENU QL KHÁCH HÀNG           |");
                System.out.println("+------------------------------------------+");
                System.out.println("|1. Nhập vào danh sách khách hàng          |");
                System.out.println("|2. Xuất danh sách khách hàng              |");
                System.out.println("|3. Thêm thông tin khách hàng              |");
                System.out.println("|4. Sửa thông tin khách hàng               |");
                System.out.println("|5. Xóa thông tin khách hàng               |");
                System.out.println("|0. Thoát chương trình                     |");
                System.out.println("+------------------------------------------+");
                System.out.print("Nhập lựa chọn :");
                int key = sc.nextInt();
                switch (key) {
                    case 1:
                        a.nhapdskh();
                        danhap = true;
                        break;
                    case 2 :
                        if(danhap == true){
                            a.xuatdskh(); 
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 3 :
                        if(danhap == true){
                            a.themkh();
                            a.writeToFile();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 4 :
                        if(danhap == true){
                            a.suakh();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 5 :
                        if(danhap == true){
                            a.xoakh();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 0 :
                        d = false;
                        break;
                    default:
                        System.out.println("Mời nhập danh sách trước !");
                        break;
                }
            }
        }
        
//        public static void main(String[] args) throws IOException{
//            KH_QLKhachHang a = new KH_QLKhachHang();
//            a.menu();
//        }
}
