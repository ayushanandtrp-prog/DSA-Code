package array;
import java.util.Scanner;
public class question18 {
    public static void main(String[] args) {
        int even = 0 ;
        int odd = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even is " +even);
        System.out.println("Odd is " +odd);
    }
}
