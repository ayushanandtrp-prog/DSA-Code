package array;
import java.util.Scanner;
public class question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("start = ");
        int start = sc.nextInt();
        System.out.print("end = ");
        int end = sc.nextInt();
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
}
