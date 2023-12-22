package Package11;

import java.util.Scanner;

public class ExmExm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Scanner 객체 생성
        System.out.println("시작");
        int a = in.nextInt();
        System.out.println("과끝");
        int b = in.nextInt();
        int res = 0;
        for(int i=a; i<=b; i++) {
            res = res + i;
        }
        System.out.println(res);
    }
}
