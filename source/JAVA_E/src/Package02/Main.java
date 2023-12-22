package Package02;
import Package01.Packge01Main;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Packge01Main.JavaExm01_4("손윤제");
        ArrayList<String> JavaExm02_1_L = new ArrayList<>();
        JavaExm02_1_L.add("S");
        JavaExm02_1_L.add("O");
        JavaExm02_1_L.add("N");
        JavaExm02_1(JavaExm02_1_L);
    }

    private static void JavaExm02_1(ArrayList<String> JavaExm02_1_L){
        System.out.println(JavaExm02_1_L.get(0));
        System.out.println(JavaExm02_1_L.get(1));
        System.out.println(JavaExm02_1_L.get(2));
        System.out.println("-----------");
        String[] JavaExm02_1_A = makeArr(JavaExm02_1_L);
        for(int i=0; i<JavaExm02_1_A.length; i++){
            System.out.println(JavaExm02_1_A[i]);
        }
    }

    private static String[] makeArr(ArrayList<String> List){
        String[] Arr = new String[List.size()];
        for(int i=0; i<List.size(); i++){
            Arr[i] = (List.get(i));
        }
        return Arr;
    }
}
