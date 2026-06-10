package oops;
enum laptop1{
    Macbook(60000),Victor(82000),TufGaming(72000),Pavillion(48000) , asus;
    private int price;
    private laptop1(){
        price = 20000;
    }
    private laptop1(int price){
        this.price = price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
        }
public class Enum2 {
    public static void main(String[]args){
       laptop1 []lap = laptop1.values();
//        System.out.println(lap+" : "+lap.getPrice());
        for(laptop1 l : lap){
            System.out.print(l + " : " + l.getPrice());
        }
    }
}
