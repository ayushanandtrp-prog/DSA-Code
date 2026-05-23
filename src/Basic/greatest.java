package Basic;
import java .util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter secound number ");
        int b = sc.nextInt();
        System.out.println("Enter third number ");
        int c = sc.nextInt();
        if (a > b && a>c ){
            System.out.println("Greatest number is "+a);
        }
        else if (b > a && b >c){
            System.out.println("Greatest number is " +b);
        }
        else{
            System.out.println("Greates number is " +c);
        }
    }
}