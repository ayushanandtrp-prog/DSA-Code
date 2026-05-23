package Recursion;

import java.util.Scanner;

public class SerchInArray {
    public static void main(string[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter elements of Array :- ");
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element :- ");
        int m = sc.nextInt();
        System.out.println(exists(arr ,m,0));
    }
    public static boolean exists(int[]arr , int target , int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return exists(arr ,target ,idx+1);
    }
}
