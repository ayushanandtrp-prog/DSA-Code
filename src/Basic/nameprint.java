package Basic;
import java.util.Scanner;
public class nameprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer :- ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 != 0){
            System.out.println("Riya");
        }
        else if (n % 3 == 0 && n % 5 != 0){
            System.out.println("Banu");
        }
        else if (n % 5 == 0 && n % 3 == 0){
            System.out.println("Apurva");
        }
        else if (n % 5 != 0 && n % 3 != 0){
            System.out.println("Isha");
        }
        else{
            System.out.println("Invalid input please enter only positive integers ");
        }

    }
}
