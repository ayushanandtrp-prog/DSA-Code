package multidimensionalarray;

public class maximum {
    public static void main(String[]args){
        int [][] arr = {{6 , 7 , 9 , 10 } , {2 , 6 , 4 , 1} , {4,9,6,1}};
        int max =arr[0][0];
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr[0].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element of array is "+max);
    }
}
