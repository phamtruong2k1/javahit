package baitap4;

import java.util.Scanner;

public class QuanLy {
    private String mapl;
    private String hoTen;

    public QuanLy(){
    }

    public void Input(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma quan ly:");
        mapl=sc.nextLine();
        System.out.println("Nhap ho ten ql:");
        hoTen=sc.nextLine();
    }

    public void Output(){
        System.out.println("Ma quan ly:"+mapl);
        System.out.println("Ho ten:"+hoTen);
    }
}
