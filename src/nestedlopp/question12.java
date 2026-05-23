package nestedlopp;
import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of raws :- ");
            int raw = sc.nextInt();
            int a = raw ;
            for(int i = 1 ; i <= raw ; i++){
                for(int j = 1 ; j <= a ; j++){
                    System.out.print("* ");
                }
                a--;
                System.out.println();
            }
    }
}
