package oops;
class laptop{
    String brand;
    public laptop(String brand){
        this.brand = "Apple";
    }
    class processor{
        int corers;
        public processor(int corers){
            this.corers = 8;
        }
        public void display(){
            System.out.println("brand is "+brand);
            System.out.println("Core is "+corers);
        }
    }
}
public class IneerClass {
    public static void main(String[] args){
        laptop obj = new laptop("Apple");
        laptop.processor obj1 = obj.new processor(8);
        obj1.display();
    }
}
