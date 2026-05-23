package lopps;
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            sum = sum * 2 ;
            System.out.println(sum);
        }
    }
}
