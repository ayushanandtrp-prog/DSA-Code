package oops;
enum Status{
    Running,Success , Error , pending;
}
public class Enum {
    public static void main(String[]args){
        Status s = Status.Running;
        switch (s){
            case Running:
                System.out.println("All good");
                break;
            case Success:
                System.out.println("Done");
                break;
            case Error:
                System.out.println("Try Again");
            case pending:
                System.out.println("Wait");
        }
//        if(s == Status.Running) {
//            System.out.println("All good");
//        }
//        else if(s == Status.Sucess){
//            System.out.println("Done");
//        }
//        else if(s == Status.Error){
//            System.out.println("Try Again");
//        }
//        else{
//            System.out.println("Please wait...");
//        }
//        Status[] s = Status.values();
//        for(Status k : s){
//           System.out.println(k);
//        }
    }
}
