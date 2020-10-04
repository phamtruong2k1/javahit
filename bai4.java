import java.util.Scanner;
public class baitapbuoi2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[1000];
        int[] prime = new int[1000];
        int ans=0,max=0;
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            if (a[i]>max) max=a[i];
        }
        int d=0,stt=0;
        while (d<=max){
            stt++;
            if (Kiemtra(stt)) {
                d++;
                prime[d] = stt;
            }
        }
        for (int i=1;i<=d;i++)
            System.out.print(prime[i] + " ");
        for (int i = 0; i < n; i++) {
            if(Kiemtra(a[i])) {
                ans += a[i] + prime[i] - i;
            } else {
                ans += a[i];
            }
        }
        System.out.println("KQ:" +ans);
    }
    public static boolean Kiemtra(int a){
        int d=0;
        for (int i=2;i<a;i++)
            if (a%i==0) return false;
        return a>1;
    }
}
