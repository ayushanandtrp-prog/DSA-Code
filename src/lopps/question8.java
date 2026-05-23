package lopps;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            for(int j = n ; j > 0 ; j--  ){
                System.out.println( i );
                System.out.println( j );
            }
        }

    }
}
