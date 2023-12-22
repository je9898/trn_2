package Package03;

public class Main {
    public static void main(String[] args){
        //plusClass pl = new plusClass(); //인스턴스 생성
        //pl.plus();      //static이 아니기때문에 인스턴스 생성
        //booleClass.boole(); //static 메소드기때문에 바로 클래스 참조.
        //bufferClass bf = new bufferClass(); //StringBuffer
        //bf.buffer();

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


