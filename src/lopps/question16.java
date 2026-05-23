package lopps;
import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        while (n > 0){
            int a = n % 10 ;
            rev = rev * 10 +a;
            n = n /10;
        }
        System.out.println(rev);
    }
}
