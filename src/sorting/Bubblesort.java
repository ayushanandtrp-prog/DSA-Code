package sorting;

public class Bubblesort {
    public static void main(String[]args){
        int[]arr = {12 , 34 , 76 , 98 , 89};
        Bubble(arr);
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void Bubble(int []arr){
        int n = arr.length -1 ;
        for(int i = 0 ; i < arr.length ;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
