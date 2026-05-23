package Basic;
import java.util.Scanner;
public class profitloss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price :- ");
        int n = sc.nextInt();
        System.out.println("Enter selling price :- ");
        int a = sc.nextInt();
        int profit = a - n ;
        int loss = n - a;
        if (n < a ){
            System.out.println("Seller made profit ");
            System.out.println("seller make profit of " +profit);
        }
        else if (n>a){
            System.out.println("Seller made loss ");
            System.out.println("Seller made loss of "+loss);
        }
        else{
            System.out.println("no profit no loss ");
        }
    }
}