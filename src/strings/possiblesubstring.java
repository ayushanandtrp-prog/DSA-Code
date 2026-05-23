package strings;

public class possiblesubstring {
    public static void substring(String s){
        String str = "";
        for(int i = 0 ; i < s.length() ; i++) {
            for (int j = i; j <= s.length(); j++) {
                System.out.print(s.substring(i , j) +"  " );
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        String s = "Ayush";
        substring(s);
    }
}
