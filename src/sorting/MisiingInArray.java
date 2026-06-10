package sorting;

public class MisiingInArray {
    public static void main(String[]args){
        int arr[] = {6 , 4 , 1 , 2 , 8 , 9};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]){
        int n = 1+ arr.length;
        int i =0;
        while(i < arr.length){
            if(arr[i] == i+1 || arr[i] == n) i++;
            else{
                int idx = arr[i] - 1;
                swap(arr , i ,idx);
            }
        }
        for(int j = 0; j < arr.length ; j++){
            if(arr[j] != j+1) return j+1;
        }
        return n;
    }
    public static void swap(int [] arr ,int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
