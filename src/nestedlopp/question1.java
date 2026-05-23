package nestedlopp;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter raw :- ");
        int raw = sc.nextInt();
        System.out.println("Enter col :- ");
        int col = sc.nextInt();
        for(int i = 1 ; i <= raw ; i++){
            for(int j = 1 ; j <= col ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
