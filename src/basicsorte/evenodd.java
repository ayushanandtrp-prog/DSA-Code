package basicsorte;
import java.util.Scanner;
public class evenodd {
    public static void print(int n ){
        if(n % 2 == 0) {
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int k = sc.nextInt();
       print(k);
    }
}
