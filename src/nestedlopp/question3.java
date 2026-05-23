package nestedlopp;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter raw :- ");
        int raw = sc.nextInt();
        for(int i = 1 ; i <= raw ; i ++){
            for(int j = 1 ; j <= raw ; j++){
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
}
