package lopps;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check odd number and divisible by 3 :- ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
