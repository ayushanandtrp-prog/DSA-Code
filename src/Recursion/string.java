package Recursion;

import java.util.ArrayList;

public class string {
    public static void main(String[]args){
        String s = "Ayush";
        change(s);
        System.out.println(s);
//        String[]arr = {"Ayush" , "Anand" , "Piyush" , "Divyansh"};
//        for(int i = 0 ; i < arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        ArrayList<String>str = new ArrayList<>();
        str.add("Ayush");
        str.add("Anand");
        str.add("Divyansh");
        str.add("Kumar");
        System.out.println(str);
        change2(str);
        System.out.println(str);
    }

    private static void change2(ArrayList<String> str) {
        str.add("Piyus");
        str.add("Patel");
    }

    public static void change(String s){
        s = "Anand";
    }
}
