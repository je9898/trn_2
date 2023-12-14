package JavaExm03;

import java.util.Arrays;

public class JavaExm03 {
    public static void main(String[] args){
        //plusClass pl = new plusClass(); //인스턴스 생성
        //pl.plus();      //static이 아니기때문에 인스턴스 생성
        //booleClass.boole(); //static 메소드기때문에 바로 클래스 참조.
        //bufferClass bf = new bufferClass(); //StringBuffer
        //bf.buffer();
        mapClass m = new mapClass();
        m.map();
    }
}

class plusClass{
    /*
     * ++num 과
     * num++ 의 차이
     * */
    int num = 0;
    public void plus(){
        plusClass p = new plusClass();
        System.out.println(p.num++);
        System.out.println(++p.num);
    }
}

class booleClass{
    /*
     * true
     * false
     * boolean
     * */
    int base = 180;
    int high = 185;
    boolean isTall = high > base;

    public static void boole(){
        booleClass b = new booleClass();
        System.out.println(b.isTall);  //true
    }
}

class bufferClass{
    public void buffer(){
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);  // "hello jump to java" 출력
        System.out.println(sb.getClass().getName());  // "hello jump to java" 출력
    }
}

class mapClass{
    public void map(){
        int[] odds = {1, 3, 5, 7, 9};   //int형 배열 만들겠다.
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}; //String형 배열 만들겠다.
        /*
        String[] week = new String[7];  //7칸 배열 지정하겠다.
        week[0] = "월";
        week[1] = "화";
        week[2] = "수";
        week[3] = "목";
        week[4] = "금";
        week[5] = "토";
        week[6] = "일";
        */
        String[] week = new String[weeks.length];
        for(int i=0; i<weeks.length; i++){
            week[i] = weeks[i];
        }
        System.out.println(Arrays.toString(week));
        System.out.println(Arrays.toString(weeks));
    }
}
