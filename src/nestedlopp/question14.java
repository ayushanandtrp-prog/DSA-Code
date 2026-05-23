package nestedlopp;
import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :- ");
        System.out.println("Enter col :- ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 1 ; i <= r ; i++){
            for(int j = 1 ; j <= c ; j++){
                if(i == (r+1)/2 || j == (c+1)/2 ) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
