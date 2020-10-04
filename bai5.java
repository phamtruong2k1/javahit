import java.util.Scanner;

public class baitapbuoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int ans=0;
        int d=0;
        char x;
        for (int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))) {
                d++;
                ans += s.charAt(i) - '0';
            }
        }
        System.out.print((double)ans/d);
    }
}
