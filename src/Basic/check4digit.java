package Basic;
import java.util.Scanner;
public class check4digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you want to check number is four digit or not ");
        int n = sc.nextInt();
        if (n > 999 && n < 10000){
            System.out.println("number is 4 digit number ");
        }
        else{
            System.out.println("Number is not 4 digit number ");
        }
    }
}