package Packge01;
public class JavaExm01 {
    public static void main(String[] args) {
        System.out.println("main_1 입니다.");

        main_2();
        System.out.println(main_3("main_3"));
    }

    public static void main_2(){
        System.out.println("main_2 입니다.");
    }

    public static String main_3(String name){
        return name + " 입니다.";
    }

    public static void main_4(){
        System.out.println("main_4 입니다.");
    }
}
