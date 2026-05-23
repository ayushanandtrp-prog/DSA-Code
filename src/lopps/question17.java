package lopps;
import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        int fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        while(n>0){
            fac = fac * n;
            n--;
        }
        System.out.println("factorial of number is " +fac);
    }
}
