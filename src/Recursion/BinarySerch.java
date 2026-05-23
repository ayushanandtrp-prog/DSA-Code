package Recursion;
import java.util.Scanner;
public class BinarySerch {
    public static void main(string[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :- ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element :- ");
        int m = sc.nextInt();
        int lo = 0;
        int hi = arr.length-1;
        System.out.println(find(arr,m,lo,hi));
    }
    public static int find(int []arr,int target , int lo , int hi){
        if(lo > hi) return -1;
        int mid = lo+(hi-lo)/2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] > target) return find(arr,target , lo , mid-1);
        else return find(arr,target , mid+1 , hi);
    }
}
