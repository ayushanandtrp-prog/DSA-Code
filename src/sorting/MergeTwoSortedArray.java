package sorting;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[]args){
//        int[] A = {10 , 40 , 50 , 80 , 90};
//        int[] B = {20 , 30 , 60 , 70};
//        int [] result =new int[A.length+B.length];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array length :- ");
        int n = sc.nextInt();
        System.out.print("Enter second array length :- ");
        int m = sc.nextInt();
        int []A = new int[n];
        System.out.print("Enter Elements of First Array :- ");
        for(int i = 0 ; i < A.length ;i++){
            A[i] = sc.nextInt();
        }
        int[]B = new int[m];
        System.out.print("Enter Elements of Second Array :- ");
        for(int i = 0 ; i < B.length ;i++){
            B[i] = sc.nextInt();
        }
        int[] result = new int[A.length+B.length];
        Merge(result , A , B);
        for(int ele : result){
            System.out.print(ele +" ");
        }
    }
     public static void Merge(int [] result , int[]A , int[]B){
        int i = 0;
        int j = 0;
        int k =0;
        while(i < A.length && j < B.length){
            if(A[i] < B[j]){
                result[k] = A[i];
                i++;
                k++;
            }
            else{
                result[k] = B[j];
                j++;
                k++;
            }
        }
        while(i < A.length) {
            result[k] = A[i];
            i++;
            k++;
        }
        while(j < B.length){
            result[k] = B[j];
            j++;
            k++;
        }
     }
}
