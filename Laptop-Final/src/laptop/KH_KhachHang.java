package laptop;

public class KH_KhachHang extends ConNguoi{
    private String makh;

    public KH_KhachHang() {
        super();
        makh = null;
    }

    public KH_KhachHang(String makh,String Hoten, String Ngaysinh, String Diachi, String Sodt, String cccd) {
        super(Hoten,Ngaysinh,Diachi,Sodt,cccd);
        this.makh = makh;
    }


    public String getMakh() {
        return this.makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }


    public void nhapkh(){
        System.out.print("Nhap mã khach hang : ");
        this.setMakh(sc.nextLine());
        super.input();
    }

    public String toString(){
        return makh + "-" + super.Hoten +"-" +super.Ngaysinh+"-"+super.Sodt+"-"+super.cccd;
    }

    public void xuatkh(){
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", this.makh,super.Hoten, super.Ngaysinh, super.Diachi, super.Sodt, super.cccd);
    }

//    public static void main(String[] args) {
//        KH_KhachHang a = new KH_KhachHang();
//        a.nhapkh();
//        a.xuatkh();
//    }
}
