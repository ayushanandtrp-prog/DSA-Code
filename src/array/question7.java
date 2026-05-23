package array;
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(min < arr[0]) min = arr[0];
        }
        System.out.print("Min element of array is " +min);

    }
}
