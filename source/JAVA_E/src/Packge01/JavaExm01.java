package Packge01;
public class JavaExm01 {
    public static void main(String[] args) {
        System.out.println("JavaExm01_1 입니다.");
        JavaExm01_2();
        System.out.println(JavaExm01_3("JavaExm01_3"));
    }

    public static void JavaExm01_2(){
        System.out.println("JavaExm01_2 입니다.");
    }

    public static String JavaExm01_3(String name){
        return name + " 입니다.";
    }

    public static void JavaExm01_4(){
        System.out.println("JavaExm01_4 입니다.");
    }
}
