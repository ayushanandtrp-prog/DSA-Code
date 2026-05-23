package basicsorte;
import java.util.Scanner;
public class bubbelsort {
    public static void print(int [] arry){
        for(int ele : arry){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array :- ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]= sc.nextInt();
        }
        print(arr);
        int k = arr.length-1;
        //FOR ACCENDING ODER
        for(int i = 0 ; i < k ; i++){
            for(int j = 0 ; j < k - i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        print(arr);
// for decending oder
      /*  for(int i = 0 ; i <= k ; i++){
            int swap = 0;
            for(int j = 0 ; j < k-i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
            }
            if(swap == 0 ) break;
        }
        print(arr);

       */
        /*for(int i = 0 ; i < k ; i++){
            for(int j = 0 ; j < k - i  ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);

         */
        /*for(int i = 0 ; i < k ; i++){
            int swap = 0;
            for(int j = 0 ; j < k - i  ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println("Number of swap = "+ swap);
            if(swap == 0) {
                System.out.println("No swap");
                break;
            }

        }
        print(arr);

         */
    }
}