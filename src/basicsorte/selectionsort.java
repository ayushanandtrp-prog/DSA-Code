package basicsorte;
import java.util.Scanner;
public class selectionsort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array :- ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]= sc.nextInt();
        }
        int m = arr.length;
       /*for(int i = 0 ; i < m -1 ; i++){
            int max = Integer.MIN_VALUE;
            int maxidx = -1;
            for(int j = i ; j < m ; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;
        }

        */
        for(int i = 0 ; i < m -1 ; i++) {
            int minidx = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
