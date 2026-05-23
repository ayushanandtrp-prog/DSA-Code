package array;
import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
    int secoundmax = Integer.MIN_VALUE;


        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                secoundmax = max;
                max = arr[i];
            }
            else if(arr [i] > secoundmax && arr[i] != max){
                secoundmax = arr[i];
            }
        }
        System.out.print("secound Maximum element of array is : "+secoundmax);
    }
}
