package array;
import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Secound maximum element is "+smax);

    }
}