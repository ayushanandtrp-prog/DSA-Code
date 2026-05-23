package array;
import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter length od array :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elemnts of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        System.out.print("Sum of array is " + sum + "  ");
    }

}
/*import java.util.Scanner;
public class question13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter elements of Array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int min = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Maximum element of array :- " +max + " Min element of Array is " +min);

    }
}

 */