package Methods;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
       // System.out.println("Largest number is " + Math.max(Math.max(a , b ) , c ));
       // System.out.println("Smallest number is " +Math.min(Math.min(a , b ) , c ));
        System.out.println("Maximum number is " + Math.max(Math.max(a , b ) , Math.max(c , d )));
    }
}
