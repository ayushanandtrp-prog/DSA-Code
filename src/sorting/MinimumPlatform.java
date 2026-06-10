package sorting;

import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[]args){
        int[]arr = {900 , 940 , 950 , 1100 , 1500 , 1800};
        int[]dep = {910 , 1200 , 1120 , 1130 , 1900 , 2000};
        System.out.println(Minimum(arr , dep));
    }
    public static int Minimum(int [] arr , int[]arr1){
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i =0;
        int j = 0;
        int count = 0;
        int maxcount =0;
        while(i < arr.length && j < arr1.length){
            if(arr[i] <= arr1[j]){
                count ++;
                i++;
            }
            else{
                count--;
                j++;
            }
            if(count > maxcount){
                maxcount = count;
            }
        }
        int MinPlatform = Math.max(maxcount , count);
        return MinPlatform;
    }
}
