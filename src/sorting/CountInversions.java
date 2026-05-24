package sorting;
import java.util.Scanner;
public class CountInversions {
    static  int count;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        MergeSort(arr);
        System.out.println("Count of Inversions "+count);
    }
    public static void MergeSort(int []arr){
        int n = arr.length;
        if(n == 1) return;
        int [] A = new int[n/2];
        int[]B = new int[n-n/2];
        int idx =0;
        for(int i = 0 ; i < A.length ;i++){
            A[i] = arr[idx++];
        }
        for(int i = 0 ; i < B.length ;i++){
            B[i] = arr[idx++];
        }
        MergeSort(A);
        MergeSort(B);
        Merge(arr , A , B);
    }
    public static void Merge(int[]arr , int[]A , int[]B){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < A.length && j < B.length){
            if(A[i] <= B[j]){
                arr[k] = A[i];
                i++;
                k++;
            }
            else{//    if(A[i] > B[j])
                arr[k] = B[j];
                count += A.length - i;
                j++;
                k++;
            }
        }
        while(i < A.length){
            arr[k] = A[i];
            i++;
            k++;
        }
        while(j < B.length){
            arr[k] = B[j];
            j++;
            k++;
        }
    }
}

