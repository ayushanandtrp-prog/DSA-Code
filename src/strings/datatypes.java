package strings;
import java.util.Scanner;
public class datatypes {
    public static void main(String[]args){
        int count =0;
        Scanner sc = new Scanner(System.in);
       String  n = sc.nextLine();
       for(int i = 0 ; i < n.length() ; i++){
           char ch = n.charAt(i);
           if(ch == 'A' || ch == 'e' ||ch == 'u' ||ch == 'o' ||ch == 'i') {
               count++;
           }
       }
        System.out.println(count);
    }
}
