package lopps;
import java.util.Scanner;
public class qustion15 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number that you want to sum :- ");
        int n = sc.nextInt();
        while (n > 0 ){
            int a = n % 10 ;
            sum += a;
            n = n / 10;
        }
        System.out.println("sum of digit of number is " +sum);
    }
}
