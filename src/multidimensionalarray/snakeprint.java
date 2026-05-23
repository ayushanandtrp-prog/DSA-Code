package multidimensionalarray;

public class snakeprint {
    public static void main(String[]args){
        int [][] arr = {{1 , 3 , 5 , 7} , {4 , 9 , 10 , 12} , {21 , 4 , 9 , 0}};
        for(int i = 0 ; i < arr.length ;i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j = arr[0].length -1 ; j >= 0 ; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
