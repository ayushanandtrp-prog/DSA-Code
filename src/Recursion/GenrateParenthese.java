package Recursion;

import java.util.ArrayList;

public class GenrateParenthese {
    public static void main(String[]args){
        ArrayList<String> ans= new ArrayList<>();
        String s = "";
        brackets(s,3 ,0, ans);
        System.out.println(ans);
    }
    public static void brackets(String s ,int open , int close ,ArrayList<String> ans ){
        if(open == 0 &&close==0){
            ans.add(s);
            return;
        }
        if(open>0) {
            brackets(s+'(' ,open - 1, close + 1, ans);
        }
        if(close >0){
            brackets(s +')' ,open, close - 1, ans);
        }
    }
}
