package Basic;
import java.util.Scanner;
public class ckeckinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real number :- ");
        double n = sc.nextDouble();
        if (n % 1 == 0 ){
            System.out.println("Number is integer ");
        }
        else{
            System.out.println("Number is not a integer ");
        }
    }
}
