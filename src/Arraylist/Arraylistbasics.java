package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistbasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);// used for insert value in array here arr[0] = 1
        arr.add(54);
        arr.add(76);
        arr.add(98);
        //arr.get() :- used for printing array elements

        //System.out.println(arr.get(2));
        //for(int ele : arr) System.out.print(ele + " ");
        //arr.set(1 , 65); it is used for set element to different digit in index 1 = 54 when we set 65 then it convert to 65
        //System.out.println(arr);
        //int n = arr.size(); // jus like arr.length
        //for(int i = 0 ; i < n ; i ++){
          //  System.out.print(arr.get(i) + " ");
        //}

        //arr.add(1 , 100);// it is used for element insert in array where you want to insert
        //for(int ele : arr) System.out.print(ele + " "); // it is used for printing an array
        //arr.remove(2);// it is used for removing an element from an array
        //for(int ele : arr) System.out.print(ele + " ");
        Collections.reverse(arr);
        for(int ele : arr) System.out.print(ele + " ");
    }
}
