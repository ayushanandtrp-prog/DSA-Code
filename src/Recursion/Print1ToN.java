package Recursion;
import java.util.Scanner;

public class Print1ToN {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
    }
    public static int fact(int n){
        if(n == 0 || n == 1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
//    static int n;
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
//        print(n);
//    }
//    public static void print(int n){
//        if(n==0) return;
//        System.out.print(n+" ");
//        print(n-1);
//        if(n != 1) {
//            System.out.print(n + " ");
//        }
//    }
//        public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
//        print(1 ,n );
//    }
//    public static void print(int k , int n){
//        if(k > n) return;
//        System.out.println(k);
//        print(k+1,n);
//    }
//    public class Print1ToN {
//     static int n;
//        public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter number");
//            int n = sc.nextInt();
//            print(1);
//        }
//    public static void print(int k){
//        if(k>n) return;
//        System.out.println(k);
//        print(k+1);
//    }
//
}