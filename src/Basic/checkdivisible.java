package Basic;
import java.util.Scanner;
public class checkdivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number only : ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("numbner is divisible by 5 ");
        }
        else if (n < 0){
            System.out.println("ivlid input please give positive number only ");
        }
        else{
            System.out.println("Number is not divisible by 5 ");
        }
    }
}