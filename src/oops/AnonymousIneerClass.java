package oops;
class Animal2{
    void sound(){
        System.out.println("Animal creat sound");
    }
}
public class AnonymousIneerClass {
    public static void main(String[]args){
        Animal2 an = new Animal2(){
            void sound(){
                System.out.println("Dog make sound");
            }
        };
        an.sound();
    }
}
