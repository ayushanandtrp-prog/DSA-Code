package Basic;
import java.util.Scanner;
public class VolOfSphare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = sc.nextInt();
        System.out.println(4.0/3.0 * Math.PI * r * r * r);
    }

}