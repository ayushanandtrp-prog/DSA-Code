package array;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int n = sc.nextInt();
        int[] arry = new int[n];
        System.out.print("Enter elements of array :- ");
        for (int i = 0; i < n; i++) {
            arry[i] = sc.nextInt();
        }
        /*for(int i = 0 ; i < n ; i++){
            if(arry[i] < 0){
                System.out.print(arry[i]);
            }
            }
            }
        }

         */
        int i = 0;
        int j = arry.length-1;
        while(i < j ){
            arry[i] = arry[j];
            arry[j] = arry[i];
            i++;
            j--;
        }
        for(int ele : arry) System.out.print(ele + " ");
    }
}


