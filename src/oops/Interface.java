package oops;
interface Animal3{
    void sound();
}
class Dog1 implements Animal3{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat implements Animal3{
    public void sound(){
        System.out.println("Cat Mewos");
    }
}
public class Interface {
    public static void main(String[]args){
        Dog1 d = new Dog1();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}
