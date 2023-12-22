/*
package son;

import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<String>[] test = new ArrayList[3];
        for(int i=0; i<test.length; i++){
            test[i] = new ArrayList<String>();
        }
        test[0].add("1");
        test[0].add("2");
        test[1].add("3");
        test[1].add("4");
        test[2].add("5");
        test[2].add("6");

        System.out.println(Arrays.toString(test));  // [[1, 2], [3, 4], [5, 6]]
        System.out.println(test.getClass().getName()); //ArrayList

        ArrayListToArrays d = new ArrayListToArrays();
        String[][] Arr = d.LTA2(test);
    }
}

class ArrayListToArrays{
    public String[] LTA1(ArrayList<String> ArrayListParameter){
        // 1차원 ArrayListToArrays
        String[] Arr = new String[ArrayListParameter.size()];

        for(int i=0; i<ArrayListParameter.size(); i++){
            Arr[i] = ArrayListParameter.get(i);
        }

        return Arr;
    }

    public String[][] LTA2(ArrayList<String>[] ArrayListParameter){
        // 2차원 ArrayListToArrays
        String[][] Arr = new String[ArrayListParameter.length][2];

        for(int i=0; i<ArrayListParameter.length; i++){
            for(int j=0; j<ArrayListParameter[i].size(); j++){
                System.out.println(Arrays.toString(Arr));
            }
        }
        System.out.println(Arr[0][1]);
        return Arr;
    }


}*/
