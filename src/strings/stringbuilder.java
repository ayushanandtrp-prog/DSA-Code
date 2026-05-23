package strings;

public class stringbuilder {
    public static void main(String[]args){
        String s = "Ayush";
        StringBuilder sb = new StringBuilder(s);
//        sb.append("Anand");
//        System.out.println(sb);
        int i = 0, j = sb.length() -1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i , temp2);
            sb.setCharAt(j , temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
