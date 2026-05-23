package Basic;
import java.util.Scanner;
public class magnetiudefind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int n = sc.nextInt();
        int a  = Math.abs(n);
        if(a < 69){
            System.out.println("Number is smaller than 69 ");
        }
        else if(a == 69){
            System.out.println("number is equal to 69");
        }
        else{
            System.out.println("number is greater than 69 ");
        }
    }
}