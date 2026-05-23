package array;
import java.util.Scanner;
public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i <arr.length ; i++) {
            sum += arr[i];
        }
            int avg = sum /n;
            int count = 0;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] > avg){
                    count++;
                }
            }
        System.out.println("Average = "+avg);
        System.out.println("Count = " +count);

    }
}