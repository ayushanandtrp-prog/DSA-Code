package Recursion;

public class LookAndSay {
    public static void main(String[]args){
        System.out.println(Pattern(3));
    }
    public static  String Pattern(int n){
        if(n == 1) return "1";
        String s = Pattern(n-1);
        String ans ="";
        int i = 0 ;
        int j = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            else{
                int freq = j-i;
                ans += freq;
                ans +=s.charAt(i);
                i = j;
            }
        }
        int freq = j-i;
        ans += freq;
        ans +=s.charAt(i);
        return ans;
    }
}
