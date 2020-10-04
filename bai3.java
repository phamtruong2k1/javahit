import java.util.Scanner;

public class baitapbuoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[1000];
        for (int i=1;i<=n;i++)
            a[i]=sc.nextInt();
        System.out.println("1.Hien thi mang vua tao");
        System.out.println("2.Chen 1 so vao vi tri k");
        System.out.println("3.Xoa so o vi tri k");
        System.out.println("4.Dao nguoc mang ");
        System.out.println("5.Hien thi a[1] va cac so chia het cho no ");
        System.out.println("6.Thoat");
        System.out.print("Chon:");
        int z= sc.nextInt();
        switch(z){
            case 1:{
                System.out.print("Mang vua nhap: ");
                for (int i=1;i<=n;i++)
                    System.out.print(a[i]+" ");
                break;
            }
            case 2:{
                System.out.print("Nhap k:");
                int k= sc.nextInt();
                System.out.print("Nhap so can chen:");
                int x= sc.nextInt();
                System.out.println("Mang vua chen:");
                for (int i=1;i<=n;i++)
                    if (i==k)
                        System.out.print(x + " " +a[i]+" ");
                    else
                        System.out.print(a[i]+" ");
                break;
            }
            case 3:{
                System.out.print("Nhap k:");
                int k= sc.nextInt();
                System.out.println("Mang vua xoa:");
                for (int i=1;i<=n;i++)
                    if (i!=k)
                        System.out.print(a[i]+" ");
                break;
            }
            case 4:{
                System.out.println("Mang dao nguoc:");
                for (int i=n;i>=1;i--)
                    System.out.print(a[i]+" ");
                break;
            }
            case 5:{
                System.out.println(a[1]+" ");
                System.out.print("Cac so chia het cho "+ a[1] +" la: ");
                if (a[1]==1) System.out.print(1);
                else
                for (int i=1;i<=a[1];i++)
                    if (a[i]%i==0)
                        System.out.print(i+" ");
                break;
            }
            case 6:{
                break;
            }
        }
    }
}
