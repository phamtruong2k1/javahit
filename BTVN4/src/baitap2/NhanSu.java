package baitap2;

import java.util.Scanner;

public class NhanSu {
    private String ma;
    private String hoTen;
    private Date ngaySinh;

    public NhanSu() {
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sv: ");
        ma = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = new Date();
        ngaySinh.Input();
    }
    public void Output(){
        System.out.println("Ma ns: "+ma);
        System.out.println("Ho ten: "+hoTen);
        System.out.print("Ngay sinh: ");
        ngaySinh.Output();
    }

}
