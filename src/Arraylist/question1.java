package Arraylist;
import java .util.Scanner;
public class question1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first array :- ");
        int n = sc.nextInt();
        System.out.print("Enter length of second array :- ");
        int m = sc.nextInt();
        int [] arrA = new int[n];
        int [] arrB = new int[m];
        System.out.print("Enter elements of first array :- ");
        for(int i = 0 ; i < arrA.length ; i++){
            arrA[i] = sc.nextInt();
        }
        System.out.print("Enter elements of second array :- ");
        for(int i = 0 ; i < arrB.length ; i++) {
            arrB[i] = sc.nextInt();
        }
        int [] result = new int[arrA.length + arrB.length];
        merge(result ,arrA , arrB);
       for(int ele : result) System.out.print(ele +" ");
    }
    public static void merge(int result[] , int arrA[] , int arrB[]){
        int i = 0 , j = 0 , k = 0;
                while(i < arrA.length && j < arrB.length){
                    if(arrA[i] < arrB[j]){
                        result[k] = arrA[i];
                        i++;
                        k++;
                    }
                    else{
                        result[k] = arrB[j];
                        j++;
                        k++;
                    }
                }
                while(i < arrA.length){
                    result[k] = arrA[i];
                    i++;
                    k++;
                }
                while(j < arrB.length){
                    result[k] = arrB[j];
                    j++;
                    k++;
                }

    }
}
