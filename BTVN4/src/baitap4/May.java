package baitap4;

import java.util.Scanner;

public class May {
    private String ma;
    private String kieumay;
    private String tinhtrang;

    public May(){
    }

    public void Input(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma may:");
        ma=sc.nextLine();
        System.out.println("Nhap kieu may:");
        kieumay=sc.nextLine();
        System.out.println("Nhap tinh trang:");
        tinhtrang=sc.nextLine();
    }

    public void Output(){
        System.out.println("Ma may:"+ma);
        System.out.println("Kieu may:"+kieumay);
        System.out.println("Tinh trang:"+tinhtrang);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getKieumay() {
        return kieumay;
    }

    public void setKieumay(String kieumay) {
        this.kieumay = kieumay;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
}
