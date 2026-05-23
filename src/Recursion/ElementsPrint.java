package Recursion;

import java.util.Scanner;

public class ElementsPrint {
    public static void main(string[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element :- ");
        int target = sc.nextInt();
        System.out.println(print(arr , 0 , target));
    }
//    public static void print(int[]arr,int idx){
//        if(idx == arr.length) return;
//        System.out.println(idx);
//        print(arr , idx+1);
//    }
//    public static void print(int []arr , int idx){
//        if(idx == arr.length) return;
//        print(arr,idx+1);
//        System.out.println(arr[idx]);
//    }
    public static boolean print(int []arr , int idx , int target){
       if(idx == arr.length) return false;
       if(arr[idx] == target) return true;
        return print(arr , idx+1 , target);
    }
}
