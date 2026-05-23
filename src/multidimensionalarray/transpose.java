package multidimensionalarray;

public class transpose {
    public static void main(String[]args){
        int [][] arr = {{6 , 7 , 9 , 10 } , {2 , 6 , 4 , 1} , {4,9,6,1}};
        for(int i = 0 ; i < arr.length ;i++){
            for(int j =1 ; j < i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static void print(int arr[][]){
        for(int []a : arr){
            for(int ele : a){
                System.out.print(ele +" ");
            }
            System.out.println();
        }
    }
}
