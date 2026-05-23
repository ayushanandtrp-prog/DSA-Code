package oops;
abstract class shape{
    abstract void area();
}
class circle extends shape{
    public void area(){
        int r = 2;
        System.out.println("Area of circle "+Math.PI*r*r);
    }
}
class rectangle extends shape{
    public void area() {
        int l = 2;
        int b = 7;
        System.out.println("Area of rectangle is "+l*b);
    }
}
public class AbstractKeyword {
    public static void main(String[]args){
        circle c1 = new circle();
        c1.area();
        rectangle r1 = new rectangle();
        r1.area();
    }
}
