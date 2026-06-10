package oops;
class complex{
    int x;
    int y;
    complex(int x , int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y >= 0) System.out.println(x + " + i" + y);
        else System.out.println(x + " - i" + (-y));
    }
}
public class ComplexNumber {
    public static void main(String[]args){
        complex c1 = new complex(2 , 5);
        complex c2 = new complex(2 , -7);
        c1.print();
        c2.print();
    }
}
