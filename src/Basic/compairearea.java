package Basic;
import java.util.Scanner;
public class compairearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int n = sc.nextInt();
        System.out.println("Enter breadth ");
        int a = sc.nextInt();
        int area = n * a;
        int perm = 2 *(a +n);
        if (area < perm){
            System.out.println("perimeter is greater than its area ");
        }
        else{
            System.out.println("perimeter is not greater than area ");
        }
    }
}
