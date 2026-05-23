package array;
import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < min) {
              min = arr[i];
            }
        }
        System.out.print("Min element of array is " +min);
    }
}
