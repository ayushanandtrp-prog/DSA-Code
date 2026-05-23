package lopps;
import java.util.Scanner;
public class question18 {
    public static void main(String[] args) {
        int p = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            p = p * a;
        }
        System.out.println(p);
    }
}
