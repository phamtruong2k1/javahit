package baitap1;
import java.util.Scanner;
public class Sach {
    private String ma;
    private String ten;
    private String nxb;
    private int sotrang;
    private int gia;

    public Sach() {
    }
    public void Input(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma sach:");
        ma=sc.nextLine();
        System.out.println("Nhap ten sach:");
        ten=sc.nextLine();
        System.out.println("Nhap NXB:");
        nxb=sc.nextLine();
        System.out.println("Nhap so trang:");
        sotrang=sc.nextInt();
        System.out.println("Nhap gia sach:");
        gia=sc.nextInt();
    }
    public void Onput(){
        System.out.println("Ma sach:"+ma);
        System.out.println("Ten sach:");
        System.out.println("NXB:"+nxb);
        System.out.println("So trang:"+sotrang);
        System.out.println("Gia sach:"+gia);
    }
    public Sach(String ma, String ten, String nxb, int sotrang , int gia ) {
        this.ma = ma;
        this.ten = ten;
        this.nxb = nxb;
        this.sotrang = sotrang;
        this.gia=gia;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getNxb(){
        return nxb;
    }
    public int getSotrang(){
        return sotrang;
    }
    public int getGia(){
        return gia;
    }
    public void setMa(String ma){
        this.ma = ma;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setNxb(String nxb){
        this.nxb = nxb;
    }
    public void setSotrang(int sotrang){
        this.ma = ma;
    }
    public void setGia(int gia){
        this.gia = gia;
    }
}
