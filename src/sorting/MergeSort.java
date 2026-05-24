package sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
//        int []arr ={23 , 12 , 65 , 87 , 54 , 32 , 98};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        merge(arr);
        for(int ele:arr) System.out.print(ele+" ");
    }
    public static void merge(int []arr){
        int n = arr.length;
        if(n == 1)  return;
        int [] A = new int[n/2];
        int [] B = new int[n-n/2];
        int idx =0;
        for (int i = 0 ; i < A.length ;i++){
            A[i] = arr[idx++];
        }
        for(int i = 0 ; i < B.length ;i++){
            B[i] = arr[idx++];
        }
        merge(A);
        merge(B);
        Merge(arr,A,B);
    }
    public static void Merge(int []arr ,int []A , int []B){
       int i =0 ;
       int j = 0;
       int k =0;
       while (i < A.length && j < B.length){
           if(A[i] < B[j]){
               arr[k] = A[i];
               i++;
               k++;
           }
           else{
               arr[k] = B[j];
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
