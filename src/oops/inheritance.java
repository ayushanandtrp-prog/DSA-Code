package oops;
class Animal {
    public void sound() {
        System.out.println("Animals make sound ");
    }

    public void leg() {
        System.out.println("Animals have four legs");
    }
}
    class Dog extends Animal{
        public void Break(){
            System.out.println("Dog is breaking");
        }
        public void walk(){
            System.out.println("Dog is walking ");
        }
    }
public class inheritance {
    public static void main(String[]args){
       Dog d = new Dog();
       d.sound();
       d.leg();
       d.Break();
       d.walk();
    }
}
