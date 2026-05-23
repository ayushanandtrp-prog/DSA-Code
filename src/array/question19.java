package array;

import java.util.Scanner;
public class question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                System.out.println(arr[i] +" " + count + " Time ");
                break;
            }
        }
    }