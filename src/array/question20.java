package array;
import java.util.Scanner;
public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();

        }
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] < 0){
                count++;
            }
            else if (arr[i] == 0) {
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("positive = " +count2);
        System.out.println("Negative = " +count);
        System.out.println("Zero = " +count1);
    }
}
