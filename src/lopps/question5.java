package lopps;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to find arathmatic number :- ");
        int n = sc.nextInt();
        for(int i = 2 ; i <= n ; i+=3){
            System.out.println(i);
        }
    }
}
