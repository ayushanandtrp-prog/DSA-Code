package oops;
class calculator{
    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a , int b , int c){
        return a+b+c;
    }
}
public class polymorphimoverloading {
    public static void main(String[]args){
        calculator c = new calculator();
        System.out.println(c.add(54 , 67));
        System.out.println(c.add(23 , 65 , 87));
    }
}
