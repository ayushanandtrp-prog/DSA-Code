package strings;
import  java.util.Scanner;

import static jdk.internal.icu.text.UTF16.charAt;

public class togglecase {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for(int i = 0 ; i < n ;i++ ) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                String result = s.toUpperCase();
                System.out.println(result);
            }
        }
    }
}
