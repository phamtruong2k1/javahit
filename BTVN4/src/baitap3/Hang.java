package baitap3;
import java.util.Scanner;
public class Hang {
    private String maHang;
    private String tenHang;
    private int donGia;

    public Hang(){
    }
    public void Input(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma hang:");
        maHang=sc.nextLine();
        System.out.println("Nhap ten hang:");
        tenHang=sc.nextLine();
        System.out.println("Nhap don gia:");
        donGia=sc.nextInt();
    }
    public void Output(){
        System.out.println("Ma hang:"+maHang);
        System.out.println("Ten hang:"+tenHang);
        System.out.println("Don gia:"+donGia);
    }
    public Hang(String maHang, String tenHang, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
