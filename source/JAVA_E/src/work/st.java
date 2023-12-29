package work;

import java.util.Scanner;

public class st {
    public static void main(String[] args) {
        // 목표 : 100마넌
        // 시작 : start 0~99마넌
        // start~70마넌 : before 1~25마넌
        // 70~100마넌 : after 1~25마넌
        Scanner sc = new Scanner(System.in);

        System.out.println("Start : ");
        int start = sc.nextInt();

        System.out.println("Before : ");
        int before = sc.nextInt();

        System.out.println("After : ");
        int after = sc.nextInt();

        int month = 1;

        //whiel 문
//        int end = start;
//        while(end<=100){
//            System.out.println("end : " + end);
//            System.out.println("month : " + month);
//            if(end<70){
//                end = end + before;
//            }else{
//                end = end + after;
//            }
//            month ++;
//        }
        //whiel 문끝
        
        //for문
//        for(int end=start; end<=100;){
//            System.out.println("end : " + end);
//            System.out.println("month : " + month);
//            if(end<70){
//                end = end + before;
//            }else{
//                end = end + after;
//            }
//            month ++;
//        }
        //for문끝

        System.out.println(month + "개월 걸렸따");
    }
}
