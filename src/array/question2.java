package array;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers on array :- ");
        int n = sc.nextInt();
        int [] arry = new int[n];
        for(int i = 0 ; i < n ; i++){
            arry[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(2 * arry[i] + " ");
        }
    }
}
