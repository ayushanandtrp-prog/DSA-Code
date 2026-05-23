package Methods;
import java.util.Scanner;
public class question3 {
    public static int fact(int x ){
        int f = 1 ;
        for(int i = 1 ; i <= x ; i++){
            f *= i ;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r :- ");
        int n = sc.nextInt();
        System.out.println("Enter n :- ");
        int a = sc.nextInt();
        int npr = fact(n) / (fact(n-a));
        System.out.println("nPr is = " +npr);
    }
}
