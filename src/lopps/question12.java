package lopps;
import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        for(int i = 2 ; i <= n - 1 ; i++){
            if (n % i == 0){
                System.out.println("Number is composite ");
                break;
            }
            else{
                System.out.println("Number is prime ");
                break;
            }
        }
    }
}