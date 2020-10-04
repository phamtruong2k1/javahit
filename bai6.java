import java.util.Scanner;

public class baitapbuoi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        String S="";
        char ch = ' ';
        char x = str.charAt(0);
        int i = 0;
        while (x ==' '){
            i++;
            x = str.charAt(i);
        }
        x = str.charAt(n - 1);
        while (x == ' '){
            n--;
            x = str.charAt(n - 1);
        }
        for (; i < n; i++){
            x = str.charAt(i);
            if (x == ' ') ch = str.charAt(i + 1);
            while (x == ' ' && ch == ' ') {
                i++;
                x = str.charAt(i);
                ch = str.charAt(i + 1);
            }
            if(x <= 'z' && x >= 'a' && (i == 0 || str.charAt(i - 1) == ' '))
                S += (char) (x - 'a' + 'A');
            else
                S += x;
        }
        System.out.println(S);
    }
}
