package array;
import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of Array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.print("Enter number you want to find :- ");
        /*int target = sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print("pair is present " + arr[i] + " + " + arr[j]);
                    found = true;
                    break;
                }

            }
            if (found) break;
        }


            if (!found) System.out.print("pair is not present ");
        }
    }



        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                found = true;
            }
        }
        if(found) System.out.print("Target is present in array ");
        else if (!found) System.out.print("Target is not found &#x20B9;");
    }
    }
    }

       }

         */

        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax &&  arr[i] != max) {
                smax = arr[i];

            }
        }
        if (smax == Integer.MIN_VALUE){
            System.out.println("No second largest number in array ");
        }
        else{
            System.out.print("Second largest number is present " +smax);
        }

    }
}