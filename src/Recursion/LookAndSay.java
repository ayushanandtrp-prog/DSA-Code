package Recursion;

public class LookAndSay {
    public static void main(String[]args){

    }
    public static void Pattern(int n){
        if(n == 1) return "1";
        String s = Pattern(n-1);
        String ans ="";
        int i = 0 ;
        int j = 0;
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            else{
                int freq = i -j;
                ans += freq;
                ans +=i;

            }
        }

    }
}
