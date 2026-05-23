package Basic;
import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to find square :- ");
        int n = sc.nextInt();
        System.out.println("Square of your number is : " +n *n );
    }
}
