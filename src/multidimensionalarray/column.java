package multidimensionalarray;
import java.util.Scanner;
public class column {
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows :- ");
//        int n = sc.nextInt();
//        System.out.println("Enter columns :- ");
//        int m = sc.nextInt();
//        int [][] arr = new int[n][m];
            int [][] arr = {{6 , 7 , 9 , 10 } , {2 , 6 , 4 , 1} , {4,9,6,1}};
//        System.out.print("Enter elements of multidimensional array :- ");
//        for(int i = 0 ; i < arr.length ;i++){
//            for(int j = 0; j < arr[0].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
        for(int i = 0 ; i < arr[0].length ;i++){
            for(int j = 0 ; j <arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
