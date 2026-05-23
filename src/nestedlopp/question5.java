package nestedlopp;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter raw :- ");
        int raw = sc.nextInt();
        for(int i = 1 ; i <= raw ; i++){
            for(int j = 1 ; j <= raw ; j++){
                System.out.print((char)(j +96 ) + " ");
            }
            System.out.println();
        }
    }
}
