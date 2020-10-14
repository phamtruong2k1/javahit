package baitap4;

import java.util.Scanner;

public class PhongMay {
    private String maphong;
    private String tenPhong;
    private int dientich;
    private QuanLy x=new QuanLy();
    private May[] y=new May[100];
    private int n;

    public PhongMay(){
    }

    public void Input(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma phong:");
        maphong=sc.nextLine();
        System.out.println("Nhap ten phong:");
        tenPhong=sc.nextLine();
        System.out.println("Nhap dien tich:");
        dientich=sc.nextInt();
        x.Input();
        System.out.println("Nhap so luong may:");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Nhap may " +i+" :");
            y[i]=new May();
            y[i].Input();
        }
    }

    public void Output(){
        System.out.println("Ma phong:"+maphong);
        System.out.println("Ten phong:"+tenPhong);
        System.out.println("Dien tich:"+dientich);
        x.Output();
        for (int i=1;i<=n;i++){
            System.out.println("+May " +i+" :");
            y[i].Output();
        }
    }
}
