package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Runmain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong dieu hoa:");
        n=sc.nextInt();
        sc.nextLine();
        ArrayList<DieuHoa> list =new ArrayList<>(n);
        for (int i=0;i<n;i++)
        {
            System.out.println("Nhap Dieu Hoa thu "+(i+1)+" :");
            DieuHoa x = new DieuHoa();
            x.Nhap();
            list.add(x);
        }
        int nho=list.get(0).getGiaBan();
        for (int i=0;i<n;i++)
        {
            if (list.get(i).getGiaBan() < nho && list.get(i).getT().equals("Electrolux"))
                nho=list.get(i).getGiaBan();
        }
        for (int i=0;i<n;i++)
        {
            if (list.get(i).getGiaBan() == nho && list.get(i).getT().equals("Electrolux"))
                list.get(i).Xuat();
        }

    }
}
