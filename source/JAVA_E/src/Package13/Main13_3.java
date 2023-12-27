package Package13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main13_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AgeType : (Korea, Year)");

        int num = sc.next().equals("Korea") ? 2031 : 2030;
        System.out.println("Year : ");
        System.out.println(num-sc.nextInt());
    }
}

/*int num = 2030;
if(sc.next().equals("Korea")){
    num = 2031;
}*/