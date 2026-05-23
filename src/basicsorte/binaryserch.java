package basicsorte;

public class binaryserch {
    public static void main(String[]args){
        int target = 83;
        int arr[] = {87 , 86 , 85 , 84 , 83};
        int lo = 0;
        int hi = arr.length-1;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] < target){
                hi = mid -1;
            }
            else{
                lo=mid+1;
            }
        }
        if(flag == true) System.out.print("Target heated");
        else System.out.println("Target is not heated ");
    }
}
