package Package13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        final int STU_COUNT = 5;
        final int SUB_COUNT = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("성적 입력해라");
        Map<String, int[]> stuSco = new HashMap<>();

        for (int i = 0; i < STU_COUNT; i++) {
            System.out.println("학생 " + (i + 1) + "의 정보");

            System.out.print("이름: ");
            String stuName = sc.next();

            int[] scores = new int[SUB_COUNT];

            String[] sub = {"국어 : ", "영어 : ", "수학 : ", "과학 : ", "사회 : "};

            for (int j = 0; j < SUB_COUNT; j++) {
                System.out.println( sub[j]);
                scores[j] = sc.nextInt();
            }
            stuSco.put(stuName, scores);
        }

        System.out.println("\n이름 국어 영어 수학 과학 사회 총점 평균");

        for (Map.Entry<String, int[]> entry : stuSco.entrySet()) {
            String stuName = entry.getKey();
            int[] scores = entry.getValue();

            int total = 0;
            for (int score : scores) {
                total += score;
            }
            double avg = (double) total / SUB_COUNT;

            System.out.printf("%-4s %-4d %-4d %-4d %-4d %-4d %-4d %.2f\n",
                    stuName, scores[0], scores[1], scores[2], scores[3], scores[4], total, avg);
        }
        sc.close();
    }
}