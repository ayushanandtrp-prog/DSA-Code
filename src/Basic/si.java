package Basic;
import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle ");
       double p = sc.nextDouble();
        System.out.println("Enter rate of inerest ");
        double r = sc.nextDouble();
        System.out.println("Enter Time : ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest is : " + (p*r*t)/100);
    }
}
