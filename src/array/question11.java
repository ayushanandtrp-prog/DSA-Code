/*Count how many times a number appears in array
Input:
        5
        1 2 3 2 2
        2
Output: 3 */
package array;
import java.util.Scanner;
public class question11 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of array :- ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number you want to find how many times it repet :- ");
        int a = sc.nextInt();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == a ){
                count += 1;
            }
        }
        System.out.print(count);
    }
}
