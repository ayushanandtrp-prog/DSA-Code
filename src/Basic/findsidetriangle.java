package Basic;
import java.util.Scanner;
public class findsidetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle ");
        int a = sc.nextInt();
        System.out.println("Enter secound side of triangle ");
        int b = sc.nextInt();
        System.out.println("Enter thired side of triangle ");
        int c = sc.nextInt();
        if(a + b > c && b + c > a && c + a > b){
            System.out.println("side of traingle is prefect ");
        }
        else{
            System.out.println("it not a side of traingle ");
        }
    }
}
