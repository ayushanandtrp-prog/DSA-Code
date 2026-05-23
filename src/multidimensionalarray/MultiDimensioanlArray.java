package multidimensionalarray;

import java.util.ArrayList;

public class MultiDimensioanlArray {
    public static void main(String[]args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(32);a.add(7);a.add(9);a.add(5);
        ArrayList<Integer>b = new ArrayList<>();
        b.add(56);b.add(76);b.add(67);b.add(98);
        ArrayList<Integer>c = new ArrayList<>();
        c.add(45);c.add(54);c.add(34);c.add(76);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);
//        for(int i = 0 ; i < arr.size();i++){
//            for(int j = 0 ; j< arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        for(ArrayList<Integer>list:arr){
            for(int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
