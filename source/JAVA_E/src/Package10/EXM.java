package Package10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EXM {
    public static void main(String[] args) throws IOException { //입력을위한 메소드
        //InputStream : byte
        //InputStreamReader : char
        //BufferedReader : 3string
        /*InputStream in = System.in; //문자열 입력받기위한 객체
        InputStreamReader reader = new InputStreamReader(in);//길이 정해놓고 받는다
        BufferedReader br = new BufferedReader(reader); //길이 상관없이 받는다.
        char[] arr = new char[3];
        reader.read(arr);
        System.out.println(arr);
        */

        //next : 문자열(토큰)
        //nextLine : 줄 단위
        //nextInt : 정수 입력
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
}
