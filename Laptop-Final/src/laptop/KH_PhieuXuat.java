package laptop;
import java.util.Random;
import java.util.Scanner;
public class KH_PhieuXuat {
    private String ngayxuat;
    private SP_SanPham sp;
    private KH_KhachHang kh;
    static Scanner sc = new Scanner(System.in);
    public KH_PhieuXuat() {
    }

    public KH_PhieuXuat(String ngayxuat, SP_SanPham sp, KH_KhachHang kh) {
        this.ngayxuat = ngayxuat;
        this.sp = sp;
        this.kh = kh;
    }

    public String getNgayxuat() {
        return this.ngayxuat;
    }

    public void setNgayxuat(String ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public SP_SanPham getSp() {
        return this.sp;
    }

    public void setSp(SP_SanPham sp) {
        this.sp = sp;
    }

    public KH_KhachHang getKh() {
        return this.kh;
    }

    public void setKh(KH_KhachHang kh) {
        this.kh = kh;
    }


    @Override
    public String toString() {
        return "{" +
            " ngayxuat='" + getNgayxuat() + "'" +
            ", sp='" + getSp() + "'" +
            ", kh='" + getKh() + "'" +
            "}";
    }

    public String Input_PX(){
        Random ran = new Random();
        String s = String.valueOf(ran.nextInt(8) + 2);
        this.setNgayxuat(s);
        return this.getNgayxuat();
    }
    
    public void Ouput_PX(SP_SanPham sanpham){
        System.out.println("+----------------------------PHIẾU XUẤT---------------------------------+");
        System.out.printf(" %-15s %-10s %-20s %-10s %-15s\n","Tên sản phẩm","Giá(Triệu)","Tên khách hàng","Số đt","Giao hàng sau : ");
        System.out.printf(" %-15s %-10s %-20s %-10s %-15s",sanpham.getTensp(),sanpham.getGia()/1000000,this.getKh().getHoten(),this.getKh().getSodt(),this.Input_PX());
    }
//     public void display(){ 
//         KH_KhachHang kh = new KH_KhachHang();
//         KH_PhieuXuat a = new KH_PhieuXuat();
//         a.setKh(kh);
//         a.setSp(sp);
//         a.Ouput_PX(sp);
//     }
// //    public static void main(String[] args) {
//        SP_SanPham sp = new SP_SanPham();
//        KH_KhachHang kh = new KH_KhachHang();
//        KH_PhieuXuat a = new KH_PhieuXuat();
//        sp.input();
//        kh.input();
//        a.setKh(kh);
//        a.setSp(sp);
//        a.Ouput_PX(sp);
//    }
}