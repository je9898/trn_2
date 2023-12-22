package Package05;
import Package01.*;
public class Package05Main {
    public static void main(String[] args) {

        Calculator ca1 = new Calculator(12);
        System.out.println(ca1.aaa(3));

        /*Calculator2 ca2 =new Calculator2();
        System.out.println(ca2.aaa(3));*/

    }
}

class Calculator {  //부모
    int result = 0;
    Calculator(int number){
        int result;
        this.result = number;
        System.out.println("생성자니?");
    }
    int aaa(int num) {
        result = result + num;
        return result;
    }

    int bbb(int num) {
        result = result - num;
        return result;
    }

    void result(){
        System.out.println(result);
    }
}



