package oops;

import java.util.Scanner;

class find{
    public static void  checkevenodd(int n){
        if(n % 2 == 0){
            System.out.println("Number is Even");;
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
public class classjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        find f = new find();
        System.out.println("Enter number :- ");
        int s = sc.nextInt();
        f.checkevenodd(s);
    }
}
