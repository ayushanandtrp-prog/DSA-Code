package Recursion;

public class Sum1ton {
    public static  void main(String[]args){
        System.out.println( sumform(5));
    }
    public static int sumform(int n){
        int sum = 0;
        if(n == 1) return sum;
        sum += sumform(n-1);
        return sum;
    }
}
