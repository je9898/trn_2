package Package07;

import java.util.*;

public class TEST01 {
    public static void main(String[] args) {
        /*int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result); // 5 출 력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        int result2 = cal.avg(data2);
        System.out.println(result2); // 6 출 력*/


        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));   //새로운 메모리 저장공간 할당. (1번)
        ArrayList<Integer> b = a;   // (1번) 저장공간 쓸래.
        ArrayList<Integer> c = new ArrayList<>(a);  // 새로운 메모리 저장공간 할당. (2번)

        /*a.add(10);
        System.out.println(a);   // true
        System.out.println(b);   // true*/

        //메모리 저장공간 위치 확인!
        System.out.println("a : " +  System.identityHashCode(a));   //(1번)공간 2074407503
        System.out.println("b : " +  System.identityHashCode(b));   //(1번)공간 2074407503
        System.out.println("c : " +  System.identityHashCode(c));   //(2번)공간 363771819
        System.out.println(a==b);   // true
        System.out.println(a==c);   // false

    }
}

class Calculator{
    int value;
    Calculator(){
        this.value = 0;
    }
    void add(int val){
        this.value += val;
    }
    int getValue(){
        return this.value;
    }

    int avg(int[] data){
        int re = 0;
        for(int s : data){
            re += s;
        }
        return re/data.length;
    }

    int avg(ArrayList<Integer> data){
        int re = 0;
        for(int s : data) {
            re += s;
        }
        return re/data.size();
    }


}

class MaxLimitCalculator extends Calculator{
    void add(int val){
        this.value += val;
        if(this.value >= 100){
            System.out.println("백 넘었어(" + this.value + ")");
        }else{
            System.out.println(getValue());
        }
    }

    boolean idOdd(int val){
        if(val%2==0){
            return false;
        }else{
            return true;
        }
        // return val % 2 != 0;
    }
}

class UpgradeCalculator extends MaxLimitCalculator{
    void minus(int val){
        this.value -= val;
        System.out.println(getValue());
    }
}