package oops;
@java.lang.FunctionalInterface
//interface A12{
//   void show();
//void show(int i , int n);
//}
interface A1{
    int add(int i , int j);
}

public class FunctionalInterface {
    public static void main(String[]args){
//        A12 obj = new A12(){
//            public void show(){
//                System.out.println("In A show");
//            }
//        };
//        A12 obj = () -> System.out.println("In a Show");
//        obj.show();
//        A12 obj = (int i , int n) -> System.out.println("Adding of this numbers is : "+ (i + n));
//        obj.show(2 , 5);
        A1 obj = (i , j) -> i+j;
        int result = obj.add(7 , 9);
        System.out.println("Add of this two number is :" + result);
    }
}
