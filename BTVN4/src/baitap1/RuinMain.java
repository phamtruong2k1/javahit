package baitap1;

import java.util.Scanner;

public class RuinMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        int n;
        n=sc.nextInt();
        Sach[] arr = new Sach[100];
        for (int i=1;i<=n;i++){
            System.out.println("Nhap sach thu "+i+" :");
            arr[i]=new Sach();
            arr[i].Input();
        }
        for (int i=1;i<=n;i++){
            System.out.println("+Sach so "+ i +" :");
            arr[i].Onput();
        }
    }
}
