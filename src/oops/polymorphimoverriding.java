package oops;
class Animal1{
    public  void sound(){
        System.out.println("Animal making sound ");
    }
}
class dog extends Animal1{
    public void sound(){
        System.out.println("dog make sound");
    }
}
public class polymorphimoverriding {
    public static void main(String[]args) {
        Animal1 a = new dog();
        a.sound();
    }
}
