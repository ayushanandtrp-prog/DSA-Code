package Basic;
import java.util.Scanner;
public class divisible3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check number is divisible by only 3 :- ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 != 0){
            System.out.println("Divisible by 3 only");
        }
        else if (n %3 == 0 && n % 5 == 0){
            System.out.println("Divisible by both 3 and 5 ");
        }
        else{
            System.out.println("not divisible by 3");
        }
    }
}
