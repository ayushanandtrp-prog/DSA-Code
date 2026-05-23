package multidimensionalarray;

    public class rowreverse {
        public static void main(String[] args) {
            int[][] arr = {{6, 7, 9, 10}, {2, 6, 4, 1}, {4, 9, 6, 1}};
            for (int i = arr.length -1; i >= 0; i--) {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
