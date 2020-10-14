package baitap3;
import java.util.Scanner;
public class Phieu {
    private String maPhieu;
    private int n;
    private Hang[] x=new Hang[100];

    public void Input1(){
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap ma phieu:");
        maPhieu=sc.nextLine();
        System.out.println("Nhap so luong hang:");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            x[i]=new Hang();
            System.out.println("Nhap  hang thu :"+i);
            x[i].Input();
        }
    }
    public void Output1(){
        System.out.println("Ma phieu:"+maPhieu);
        System.out.println("So luong hang:"+n);
        for (int i=1;i<=n;i++){
            System.out.println("Hang thu "+i);
            x[i].Output();
        }
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum+=x[i].getDonGia();
        }
        System.out.println("Tong tien:"+sum);
    }
    public Phieu(){
    }
}
