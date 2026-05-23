package Recursion;
import java.util.Scanner;

public class PrintNto1 {
    public static void main(string[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n == 0) return;
        System.out.println(n);
        print(n-1);
    }
}
