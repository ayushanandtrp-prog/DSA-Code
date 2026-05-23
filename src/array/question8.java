package array;
import java.util.Arrays;
public class question8 {
    public static void print(int []x){
        for(int i = 0 ; i < x.length;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] x = {34 , 45 , 21 , 32 };
        print(x);
        Arrays.sort(x);
        print(x);

    }
}
