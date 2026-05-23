package array;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array :- ");
        int[] arry = new int[n];
        for(int i = 0 ; i < n ; i++){
            arry[i]= sc.nextInt();
        }
        /*for(int i = 0 ; i < n ; i++){
            System.out.println(arry[i]);
        }

         */
        /*int even = 0 ;
        int odd = 0;
        for(int i = 0 ; i < arry.length;i++){
            if(arry[i] % 2 == 0 ){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even = "+even);
        System.out.println("odd = "+odd);

         */
        /*int zero =0;
        int positive = 0 ;
        int negative = 0;
        for(int i = 0 ; i < arry.length ; i++) {
            if (arry[i] < 0) {
                negative++;
            } else if (arry[i] == 0) {
                zero++;
            } else {
                positive++;
            }
        }
            System.out.println("Negative = "+negative);
            System.out.println("Positive = "+positive);
            System.out.println("Zero = "+zero);

         */
        /*int max = arry[0];
        int smax = Integer.MIN_VALUE;
        for(int i = 1 ; i < arry.length ; i++){
            if(arry[i] > max ) {
                smax = max;
                max = arry[i];
            }
            else if(arry[i] > smax && arry[i] != max){
                smax = arry[i];
            }
        }
        System.out.println(smax);

         */
       /* int i = 0;
        int j = arry.length - 1;
        while(i < j){
            int temp = arry[i];
            arry[i] = arry[j];
            arry[j] = temp;
            i++;
            j--;
        }
        for(int ele : arry) System.out.print(ele + " ");

        */
        /*System.out.print("Enter start point :- ");
        int start = sc.nextInt();
        System.out.print("Enter end point :- ");
        int end = sc.nextInt();
        while (start < end){
                int temp = arry[start];
                arry[start] = arry[end];
                arry[end] = temp;
                start++;
                end--;
            }

        for(int ele : arry) System.out.print(ele+ " ");

         */
       /* int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <arry.length; i++){
            if(arry[i] > max ) max = arry[i];
        }
        for(int i = 0 ; i <arry.length; i++) {
            if (arry[i] > smax && arry[i] != max) smax = arry[i];
        }
        for(int i = 0 ; i < arry.length; i++){
            if(arry[i] < min) min = arry[i];
        }
        System.out.println("Maximum element of Array is " +max);
        System.out.println("Second Maximum element of Array is " +smax);
        System.out.println("minimum element of Array is " +min);

        */
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arry.length ; i++){
            if(arry[i] > max ){
                smax = max;
                max = arry[i];
            }
            else if(arry[i] > smax && arry[i] != max){
                smax = arry[i];
            }
            if(arry[i] < min ) min = arry[i];

        }
        System.out.println("Maximum element is "+ max);
        System.out.println("Second maximum element is "+smax);
        System.out.println("Minimum element is "+min);

    }
}

