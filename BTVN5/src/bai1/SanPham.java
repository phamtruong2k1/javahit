package bai1;
import java.util.Scanner;

public class SanPham {
    private String ma;
    private String tenSp;
    private String tenHang;
    Date ngayNhap=new Date();

    public SanPham(){
    }

    public SanPham(String ma, String tenSp, String tenHang, Date ngayNhap) {
        this.ma = ma;
        this.tenSp = tenSp;
        this.tenHang = tenHang;
        this.ngayNhap = ngayNhap;
    }

    public void Input(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma san pham:");
        ma=sc.nextLine();
        System.out.println("Nhap ten san pham:");
        tenSp=sc.nextLine();
        System.out.println("Nhap tên hãng sản xuất:");
        tenHang=sc.nextLine();
        System.out.println("Nhap ngay lay hang:");
        ngayNhap.Innput();
    }

    public void Output(){
        System.out.println("Ma sản phẩm:"+ma);
        System.out.println("Ten sản phảm:"+tenSp);
        System.out.println("Tên hãng sản xuất"+tenHang);
        ngayNhap.Outtput();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
