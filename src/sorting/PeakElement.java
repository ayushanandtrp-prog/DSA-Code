package sorting;

public class PeakElement {
    public static void main(String[]args){
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 5 , 1};
//        int n = arr.length;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr.length == 0) {
//                System.out.println(arr[i]);
//            }
//            else{
//                if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }
        int lo = 0;
        int hi = arr.length-1;
        while(lo < hi){
            int mid = lo +(hi -lo )/2;
            if(arr[mid] < arr[mid+1]){
                lo = mid +1;
            }
            else hi = mid;
        }
        System.out.println(arr[lo]);
    }
}
