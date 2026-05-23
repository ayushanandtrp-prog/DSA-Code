package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args){
        Hanoi(3 , 'A','B','C');
    }
    public static void Hanoi(int n , char A , char B , char C){
        if(n == 0) return;
        //from a to b via c
        Hanoi(n-1 , A , C , B);
        System.out.println(A + "->" +C);
        //from b to c
        Hanoi(n-1 , B , A , C);
    }
}
