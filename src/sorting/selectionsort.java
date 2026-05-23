package sorting;
import java.util.Scanner;
public class selectionsort {
    public void selection(int arr[] ,int pass){
        for(int i = 0 ; i < pass;i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j = i ; j < arr.length ;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        selectionsort s = new selectionsort();
        System.out.print("Enter length of Array:- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter element of Array :- ");
        for(int i = 0 ; i < arr.length ;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of passes :- ");
        int pass = sc.nextInt();
        s.selection(arr , pass);
        for(int ele : arr){
            System.out.print(ele +" ");
        }

    }
}
