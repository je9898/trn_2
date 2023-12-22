package Package01;
public class Packge01Main {
    public static void main(String[] args) {
        System.out.println("JavaExm01_1 입니다.");
        Packge01Main ma = new Packge01Main();
        ma.JavaExm01_2();
        System.out.println(JavaExm01_3("JavaExm01_3"));
    }

    public void JavaExm01_2(){
        System.out.println("JavaExm01_2 입니다.");
    }

    public static String JavaExm01_3(String name){
        return name + " 입니다.";
    }

    public static void JavaExm01_4(String name){
        System.out.println(name + " 입니다.");
    }
}
