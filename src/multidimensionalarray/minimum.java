package multidimensionalarray;
import java.util.Scanner;
public class minimum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :- ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns :- ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("Enter elements of rows :- ");
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0 ; j < arr[0].length ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ;i++){
            int max = arr[i][0];
            for(int j = 0 ; j < arr[0].length ;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max < min){
                min = max;
            }
        }
        System.out.println("Minimum element of array :"+min);
    }
}
