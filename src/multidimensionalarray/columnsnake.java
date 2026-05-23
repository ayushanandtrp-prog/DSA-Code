package multidimensionalarray;

public class columnsnake {
    public static void main(String[]args){
        int [][] arr = {{6 , 7 , 9 , 10 } , {2 , 6 , 4 , 1} , {4,9,6,1}};
        for(int j = 0 ; j < arr[0].length ;j++){
            if(j%2 == 0){
                for(int i = 0 ; i < arr.length ;i++){
                    System.out.print(arr[i][j] +" ");
                }
            }
            else{
                for(int i = arr.length-1;i >= 0 ;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
