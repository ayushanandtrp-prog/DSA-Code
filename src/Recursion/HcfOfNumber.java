package Recursion;

import java.util.Scanner;

public class HcfOfNumber {
    public static void main(string[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int n = sc.nextInt();
        System.out.print("Enter second number :-");
        int m = sc.nextInt();
        System.out.println("Hcf of number is : "+hcf(n,m));
//        int hcf =0;
//        for(int i = 1 ; i < Math.min(n , m);i++){
//            if(n % i == 0 && m % i == 0){
//                hcf = i;
//            }
//        }
//        System.out.print("HCF is = "+hcf);
    }
    public static int hcf(int x , int y){
        if(x==0) return y;
        int ans = hcf(y%x , x);
        return ans;
    }
}
