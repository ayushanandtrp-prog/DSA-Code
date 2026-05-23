package array;
import java.sql.SQLOutput;
import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number that you want to find in array :-  ");
        int a = sc.nextInt();
        int  c = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == a ){
                c = i;
                break;
            }
        }
         if (c != -1){
             System.out.print( a + " number is present in array at index "+c);
        }
         else{
             System.out.print("Number id not found ");
         }

    }
}
