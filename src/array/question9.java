package array;
import java.util.Arrays;
import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0 ){
                System.out.print(arr[i] + 10 + " ");
            }
            else {
                System.out.print(arr[i] * 2 + " ");
            }
        }
    }
}
