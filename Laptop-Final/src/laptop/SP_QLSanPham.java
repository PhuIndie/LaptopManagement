package laptop;
import java.io.*;
import java.util.Scanner;
public class SP_QLSanPham {
    private int sosp;
    protected SP_SanPham[] sanpham = new SP_SanPham[sosp];

    public SP_QLSanPham() {
    }

    public SP_QLSanPham(int sosp, SP_SanPham[] sanpham) {
        this.sosp = sosp;
        this.sanpham = sanpham;
    }

    public int getSosp() {
        return this.sosp;
    }

    public void setSosp(int sosp) {
        this.sosp = sosp;
    }

    public SP_SanPham[] getSanpham() {
        return this.sanpham;
    }

    public void setSanpham(SP_SanPham[] sanpham) {
        this.sanpham = sanpham;
    }

    public SP_QLSanPham sosp(int sosp) {
        setSosp(sosp);
        return this;
    }

    public SP_QLSanPham sanpham(SP_SanPham[] sanpham) {
        setSanpham(sanpham);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " sosp='" + getSosp() + "'" +
            ", sanpham='" + getSanpham() + "'" +
            "}";
    }

    static Scanner sc = new Scanner(System.in);
    final int max = 1000;
    public void nhapdssp(){
        System.out.print("Nhập số lượng sản phẩm :");
        this.setSosp(sc.nextInt());
        sanpham = new SP_SanPham[max];
        for(int i = 0; i < sosp; i++){
            System.out.println("Nhập sản phẩm thứ " + "00" +(i + 1) + " : ");
                sanpham[i] = new SP_SanPham();
                sanpham[i].input();
        }
        //this.setArrsv(sanpham);

    }

    public void xuatdssp(){
        System.out.printf("%-15s %-15s %-10s %-20s %-17s %-5s %-15s %-10s %-25s %-15s %-15s %-10s \n","Mã Sản phẩm","Tên Sản Phẩm","Hãng","Nhu cầu","Giá tiền(Triệu)","RAM","CPU","Ổ Cứng","Màn hình","Hệ điều hành","Kích thước","Đánh giá");
        for(int i = 0; i < sosp ; i ++)
            sanpham[i].output();
    }

    public void writeToFile() throws IOException{
        File file = new File("sanpham.txt");
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);  
        
        for(int i = 0; i < this.getSosp() ;i++){
            outputStreamWriter.write(sanpham[i].toString());
            // Dùng để xuống hàng
            outputStreamWriter.write("\n");
        }          
        
        
        // Đây là phương thức quan trọng!
        // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
        outputStreamWriter.flush();
    }
    public void readFromFile() throws IOException{
        File file = new File("sanpham.txt");
        sanpham = new SP_SanPham[1000];
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
 
        String line = "";
        int x = 0;
        while((line = reader.readLine()) != null){
            String[] s = line.split("-");
            sanpham[x] = new SP_SanPham();
            sanpham[x].setMasp(s[0]) ;
            sanpham[x].setTensp(s[1]);
            sanpham[x].setHang(s[2]);
            sanpham[x].setNhucau(s[3]);
            sanpham[x].setDanhgia(s[11]);
            long Hs = Long.parseLong(s[4]);
            sanpham[x].setGia(Hs);
            sanpham[x].setRam(s[5]);
            sanpham[x].setCpu(s[6]);
            sanpham[x].setOcung(s[7]);
            sanpham[x].setManhinh(s[8]);
            sanpham[x].setHedieuhanh(s[9]);
            sanpham[x].setKichthuoc(s[10]);
            x++;
        }
        this.setSosp(x);
      
    }  
    public void timkiemsp(){
        boolean x = true;
        while(x == true){
            System.out.println("+---------------------------------+");
            System.out.println("| 1. Tìm theo tên sản phẩm .      |");
            System.out.println("| 2. Tìm theo mã sản phẩm .       |");
            System.out.println("| 3. Tìm theo tên hãng .          |");
            System.out.println("| 4. Tìm theo giá tiền .          |");
            System.out.println("| 5. Tìm theo cấu hình .          |");
            System.out.println("| 0 Thoát .                      |");
            System.out.println("+---------------------------------+");

            System.out.print("Nhập sự lựa chọn : ");
            int k = sc.nextInt();
            switch(k){
                case 1 :
                    System.out.println("Nhập tên sản phẩm : " + sc.nextLine());
                    String tensp = sc.nextLine();
                    System.out.println("+---------------------------------------------+");
                    System.out.println("|                   KẾT QUẢ                   |");
                    System.out.println("+---------------------------------------------+");
                    for(int i = 0; i < sosp; i++)
                        if(sanpham[i].getTensp().equalsIgnoreCase(tensp)){
                                        sanpham[i].output();
                        }
                    break;
                case 2 :
                    System.out.println("Nhập mã sản phẩm : " + sc.nextLine());
                    String masp = sc.nextLine();
                    System.out.println("+---------------------------------------------+");
                    System.out.println("|                   KẾT QUẢ                   |");
                    System.out.println("+---------------------------------------------+");
                    for(int i = 0; i < sosp; i++)
                        if(sanpham[i].getMasp().equalsIgnoreCase(masp)){
                            sanpham[i].output();
                        }
                    break;
                case 3 :
                    System.out.println("Nhập tên hãng :" + sc.nextLine());
                    String hang = sc.nextLine();
                    System.out.println("+---------------------------------------------+");
                    System.out.println("|                   KẾT QUẢ                   |");
                    System.out.println("+---------------------------------------------+");
                    for(int i = 0; i < sosp; i++)
                        if(sanpham[i].getHang().equalsIgnoreCase(hang)){
                            sanpham[i].output();
                        }
                    break;
                case 4 :
                    boolean y = true;
                    while(y){
                        System.out.println("+-------------------------------------+");
                        System.out.println("| 1. từ 10.000.000 đến 15.000.000     |");
                        System.out.println("| 2. từ 15.000.000 đến 20.000.000     |");
                        System.out.println("| 3. từ 20.000.000 đến 30.000.000     |");
                        System.out.println("| 4. từ 30.000.000 trở lên            |");
                        System.out.println("| 0. Thoát                            |");
                        System.out.println("+-------------------------------------+");
                        System.out.print("Nhập tùy chọn : ");
                        int k1 = sc.nextInt();
                        switch(k1){
                            case 1 :
                                for(int i = 0; i < sosp; i++)
                                    if(sanpham[i].getGia() >= 10000000 && sanpham[i].getGia() <= 15000000 ){
                                        sanpham[i].output();
                                    }
                                break;
                            case 2 :
                                for(int i = 0; i < sosp; i++)
                                    if(sanpham[i].getGia() >= 15000000 && sanpham[i].getGia() <= 20000000){
                                        sanpham[i].output();
                                    }
                                break;
                            case 3 :
                                for(int i = 0; i < sosp; i++)
                                    if(sanpham[i].getGia() >= 20000000 && sanpham[i].getGia() <= 25000000){
                                        sanpham[i].output();
                                    }
                                break;
                            case 4 :
                                for(int i = 0; i < sosp; i++)
                                    if(sanpham[i].getGia() >= 30000000){
                                        sanpham[i].output();
                                    }
                                break;
                            case 0 :
                                System.out.println("Bạn chọn thoát !");
                                y = false;
                                break;
                            default :
                                System.out.println("Nhập lại tùy chọn !");
                                break;
                        }
                    }
                    break;
                case 5 :
                    Boolean z = true;
                    while(z == true) {
                        System.out.println();
                        System.out.println("+------------------+");
                        System.out.println("| 1. RAM .         |");
                        System.out.println("| 2. CPU .         |");
                        System.out.println("| 3. Ổ cứng .      |");
                        System.out.println("| 4. Màn hình.     |");
                        System.out.println("| 5. Hệ điều hành .|");
                        System.out.println("| 0. Thoát !       |");
                        System.out.println("+------------------+");
                        System.out.print("Nhập tùy chọn : ");
                        int k1 = sc.nextInt();
                        switch(k1){
                            case 1 :
                                System.out.println("Nhập thông tin RAM  :" + sc.nextLine());
                                String ram = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                System.out.println("|                   KẾT QUẢ                   |");
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < sanpham.length; i++)
                                    if(sanpham[i].getRam().equalsIgnoreCase(ram)){
                                        sanpham[i].output();
                                    }
                                break;
                            case 2 :
                                System.out.println("Nhập thông tin CPU  :" + sc.nextLine());
                                String cpu = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                System.out.println("|                   KẾT QUẢ                   |");
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < sanpham.length; i++)
                                    if(sanpham[i].getCpu().equalsIgnoreCase(cpu)){
                                        sanpham[i].output();
                                    }
                                break;
                            case 3 :
                                System.out.println("Nhập thông tin ổ cứng  :" + sc.nextLine());
                                String ocung = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                System.out.println("|                   KẾT QUẢ                   |");
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < sanpham.length; i++)
                                    if(sanpham[i].getOcung().equalsIgnoreCase(ocung)){
                                        sanpham[i].output();
                                    }
                                break;
                            case 4 :
                                System.out.println("Nhập độ lớn màn hình  :" + sc.nextLine());
                                String manhinh = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                System.out.println("|                   KẾT QUẢ                   |");
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < sanpham.length; i++)
                                    if(sanpham[i].getManhinh().equalsIgnoreCase(manhinh)){
                                        sanpham[i].output();
                                    }
                                break;
                            case 5 :
                                System.out.println("Nhập hệ điều hành  : " + sc.nextLine());
                                String hedieuhanh = sc.nextLine();
                                System.out.println("+---------------------------------------------+");
                                System.out.println("|                   KẾT QUẢ                   |");
                                System.out.println("+---------------------------------------------+");
                                for(int i = 0; i < sanpham.length; i++)
                                    if(sanpham[i].getHedieuhanh().equalsIgnoreCase(hedieuhanh)){
                                        sanpham[i].output();
                                    }
                                break;
                            case 0 :
                                System.out.println("Bạn chọn thoát !");
                                z = false;
                                break;
                            default:
                                System.out.println("Mời nhập lại !");
                                break;
                        }
                    }
                        break;
                case 0 :
                    System.out.println("Bạn chọn thoát");
                    x = false;
                    break;
                default :
                    System.out.println("Mời nhập lại !");
                    break;
            }


        }
        
        } 
    

    public void xoasp(){ 
        System.out.println("Nhập mã sản phẩm :"+ sc.nextLine());
        String makh = sc.nextLine();
        for(int i = 0; i < sosp; i++)
            if(sanpham[i].getMasp().equalsIgnoreCase(makh)){
               for(int j = i ; j < sosp; j++)
                    sanpham[j] = sanpham[j+1];
                    sosp--;     
            }
        
        
    }
    public void suasp(){
        System.out.println("Nhập mã sản phẩm muốn mua:" + sc.nextLine());
        String makh = sc.nextLine();
        int x = 0;
        for(int i = 0; i < sosp; i++)
            if(sanpham[i].getMasp().equalsIgnoreCase(makh))  x = i; 
        boolean dk = true;
        while(dk == true){
            System.out.println();
            System.out.println("+------------------------------------+");
            System.out.println("| 1. Sửa thông tin sản phẩm .        |");
            System.out.println("| 2. Sửa cấu hình sản phẩm .         |");
            System.out.println("| 0. Thoát !                         |");
            System.out.println("+------------------------------------+");
            System.out.print("Nhập sựu lựa chọn : ");
            int k = sc.nextInt();  
            switch (k) {
                case 1:
                    Boolean dk0 = true;
                    while(dk0 == true){
                    System.out.println();
                    System.out.println("+------------------------------------+");
                    System.out.println("| 1. Sửa mã sản phẩm .               |");
                    System.out.println("| 2. Sửa tên sản phẩm .              |");
                    System.out.println("| 3. sửa hãng .                      |");
                    System.out.println("| 4. Sửa nhu cầu .                   |");
                    System.out.println("| 5. sửa giá tiền .                  |");
                    System.out.println("| 0. Thoát .                         |");
                    System.out.println("+------------------------------------+");
                    System.out.print("Nhập sự lựa chọn tại đây : ");
                    int k0 = sc.nextInt();
                    switch(k0){
                        case 1 :
                            System.out.println("Nhập mã sản phẩm mới : " + sc.nextLine());
                            this.sanpham[x].setMasp(sc.nextLine());
                            System.out.println("Upgrade successfull !");
                            break;
                        case 2 :
                            System.out.println("Nhập tên sản phẩm mới : " + sc.nextLine());
                            this.sanpham[x].setTensp(sc.nextLine());
                            System.out.println("Upgrade successfull !");
                            break;
                        case 3 :
                            System.out.println("Nhập tên hãng mới : " + sc.nextLine());
                            this.sanpham[x].setHang(sc.nextLine());
                            System.out.println("Upgrade successfull !");
                            break;
                        case 4 :
                            System.out.println("Nhập nhu cầu mới : " + sc.nextLine());
                            this.sanpham[x].setNhucau(sc.nextLine());
                            System.out.println("Upgrade successfull !");
                            break;
                        case 5 :
                            System.out.println("Nhập giá tiền mới : " + sc.nextLine());
                            this.sanpham[x].setGia(sc.nextDouble());
                            System.out.println("Upgrade successfull !");
                            break;
                        case 0 :
                            System.out.println("Bạn chọn thoát !");
                            dk0 = false;
                            break;
                    }
                }
                    break;
                case 2:
                    Boolean dk1 = true;
                    while(dk1 == true) {
                        System.out.println("+----------------------------------+");
                        System.out.println("| 1. Sửa RAM .                     |");
                        System.out.println("| 2. Sửa CPU .                     |");
                        System.out.println("| 3. sửa ổ cứng .                  |");
                        System.out.println("| 4. Sửa màn hình.                 |");
                        System.out.println("| 5. Sửa hệ điều hành .            |");
                        System.out.println("| 6. Sửa kích thước sản phẩm .     |");
                        System.out.println("| 0. Thoát !                       |");
                        System.out.println("+----------------------------------+");
                        System.out.print("Nhập lựa chọn : ");
                        int k1 = sc.nextInt();
                        switch(k1){
                            case 1 :
                                System.out.println("Nhập thông tin RAM mới :" + sc.nextLine());
                                this.sanpham[x].setRam(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 2 :
                                System.out.println("Nhập thông tin CPU mới :" + sc.nextLine());
                                this.sanpham[x].setCpu(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 3 :
                                System.out.println("Nhập thông tin ổ cứng mới :" + sc.nextLine());
                                this.sanpham[x].setOcung(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 4 :
                                System.out.println("Nhập thông tin màn hình mới :" + sc.nextLine());
                                this.sanpham[x].setManhinh(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 5 :
                                System.out.println("Nhập hệ điều hành mới : " + sc.nextLine());
                                this.sanpham[x].setHedieuhanh(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 6 :
                                System.out.println("Nhập thông tin kích thước mới : " + sc.nextLine());
                                this.sanpham[x].setKichthuoc(sc.nextLine());
                                System.out.println("Upgrade successfull !");
                                break;
                            case 0 :
                                System.out.println("Bạn chọn thoát !");
                                dk1 = false;
                                break;
                            default:
                                System.out.println("Mời nhập lại !");
                                break;
                        }
                    }
                case 0:
                    System.out.println("Bạn chọn thoát !");
                    dk = false;
                    break;
                default:
                    System.out.println("Mời nhập lại!");
                    break;
            }


        }
    }

    public void themsp(){
        System.out.println("Nhập số lượng sản phẩm muốn thêm :");
        int x = sc.nextInt();
        SP_SanPham[] arr = new SP_SanPham[max];
        for(int i = sosp; i < sosp + x; i++){
            System.out.println("Nhập vào sản phẩm thứ " + "00" +(i+ 1) + " : ");
            arr[i] = new SP_SanPham();
            arr[i].input();
            sanpham[i] = arr[i];
        }
        sosp += x;
    }

        public void menu() throws IOException{
            boolean danhap = true;
            SP_QLSanPham a = new SP_QLSanPham();
            a.readFromFile();
            boolean d = true;
            while(d == true){
                System.out.println("+--------------------------------------+");
                System.out.println("|            MENU QL SẢN PHẨM          |");
                System.out.println("+--------------------------------------+");
                System.out.println("|1. Nhập danh sách sản phẩm            |");
                System.out.println("|2. Xuất danh sách sản phẩm .          |");
                System.out.println("|3. Thêm thông tin sản phẩm .          |");
                System.out.println("|4. Sửa thông tin sản phẩm .           |");
                System.out.println("|5. Xóa thông tin sản phẩm .           |");
                System.out.println("|6. Tìm kiếm sản phẩm .                |");
                System.out.println("|0. Thoát chương trình .               |");
                System.out.println("+--------------------------------------+");
                System.out.print("Nhập sự lựa chọn :");
                int key = sc.nextInt();
                switch (key) {
                    case 1:
                        a.nhapdssp();
                        danhap = true;
                        break;
                    case 2 :
                        if(danhap == true){
                            a.xuatdssp(); 
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 3 :
                        if(danhap == true){
                            a.themsp();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 4 :
                        if(danhap == true){
                            a.suasp();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 5 :
                        if(danhap == true){
                            a.xoasp();
                            a.writeToFile();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 6 :
                        if(danhap == true){
                            a.timkiemsp();
                        }else System.out.println("Mời nhập danh sách trước !");
                        break;
                    case 0 :
                        d = false;
                        break;
                    default:
                        System.out.println("Mời nhập lại !");
                        break;
                }
            }
        }
        

//    public static void main(String[] args) throws IOException{
//        SP_QLSanPham a = new SP_QLSanPham();
//        a.writeToFile();
//    }
}
