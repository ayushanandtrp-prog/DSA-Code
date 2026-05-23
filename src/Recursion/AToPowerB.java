package Recursion;

import java.util.Scanner;

public class AToPowerB {
    public static void main(string[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        System.out.print("Enter power ");
        int m = sc.nextInt();
        System.out.print("power is "+pow(n ,m));
    }
    public static int pow(int a , int b){
        if(b == 0) return 1;
        int ans = pow(a , b/2);
        if(b % 2 == 0) return ans * ans;
        else return a * ans *ans;
    }
//    public static int pow(int a , int b){
//        if(b == 0) return 1;
//        return a * pow(a , b-1);
//    }
}
