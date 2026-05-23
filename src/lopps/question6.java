package lopps;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from where you want to print reverse :- ");
        int n = sc.nextInt();
        for(int i = n ; i > 0 ; i -= 4){
            System.out.println(i);
        }
        if(n <0 ){
            System.out.println("invlid input please enter positive number only ");
        }
    }
}
