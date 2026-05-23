package Basic;
import java.util.Scanner;
public class IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number :- ");
        int n = sc.nextInt();
        if(n < 0 ) {
            System.out.println("invlid input please enter positive number ");
        }
        else if(n % 2 == 0){
                System.out.println("Number is even ");
            }
        else{
            System.out.println("Number is odd ");
        }

    }
}
