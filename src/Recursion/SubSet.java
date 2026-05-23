package Recursion;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.icu.text.UTF16.charAt;

public class SubSet {
    public static void main(String[]args){
        String s = "abc";
        List<String>list = new ArrayList<>();
        sub("",s,0 , list);
        System.out.println(list);
    }
    public static void sub(String ans , String s,int idx , List<String>list){
        if(idx == s.length()){
            if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        sub(ans+ch,s , idx+1 , list);
        sub(ans,s,idx+1 , list);
    }
}
