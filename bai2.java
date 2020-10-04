import java.util.Scanner;

public class baitapbuoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[1000];
        for (int i=1;i<=n;i++)
            a[i]=sc.nextInt();
        for (int i=1;i<n;i++)
            for (int j=i+1;j<=n;j++)
                if (a[i]>a[j]){
                    int tg;
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
        System.out.println("Phan tu be nhat:" + a[1]);
        System.out.println("Phan tu lon nhat:" + a[n]);
        System.out.println("Mang xep tang:");
        for (int i=1;i<=n;i++)
            System.out.print(a[i]+" ");
    }
}

