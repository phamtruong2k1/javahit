import java.util.Scanner;

public class baitapbuoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int ans;
        ans=a;
        if (ans<b) ans=b;
        if (ans<c) ans=c;
        System.out.print("Ket qua:" + ans);
    }
}
