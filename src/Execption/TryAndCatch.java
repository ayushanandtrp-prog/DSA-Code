package Execption;
class AyushException extends Exception{
    public AyushException(String str){
        super(str);
    }
}
public class TryAndCatch {
    public static void main(String[]args){
//        int i = 2;
//        int j = 0;
//        int[]arr = new int[5];
//        try{
//            j = 18/i;
//            System.out.println(j);
//            System.out.println(arr[5]);
//        }
//        catch (ArithmeticException E){
//            System.out.println("Can not divided by 0 ");
//        }
//        catch (ArrayIndexOutOfBoundsException E){
//            System.out.println("it is out of length ");
//        }
        int i = 20 ;
        int j = 0;
        int[]arr = new int[5];
        try{
            j =18/i;
            if(j == 0) throw new AyushException("I dont want to print 0 ");
        } catch (AyushException e) {
            j = 18/1;
            System.out.println("The default value is print "+j +e);
        }
    }
}
