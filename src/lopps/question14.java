package lopps;
import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        while(n>0){
            int a = n % 10;
            count += 1;
            n = n / 10;
        }
        System.out.println("count of digit is " +count);
    }
}
