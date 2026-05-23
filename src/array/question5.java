package array;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        int pro = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter ellemnts of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            pro *= arr[i];
        }
        System.out.print("product of array element " + pro);
    }
}
