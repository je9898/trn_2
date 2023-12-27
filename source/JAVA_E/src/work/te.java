package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class te {
    public static void main(String[] args) {
        final int STU_COUNT = 5;
        final int SUB_COUNT = 5;
        String[] Name = new String[STU_COUNT];
        int[][] scores = new int[STU_COUNT][SUB_COUNT];
        int[] totalScores = new int[STU_COUNT];  // 각 학생의 총점을 저장할 배열
        String filePath = "C:/work/te.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Scanner sc = new Scanner(fileInputStream);
            sc.useDelimiter(",\\s*|\\s*,\\s*");

            // 파일의 내용을 읽어와서 출력
            System.out.println("번호 이름 국어 영어 수학 과학 사회 총점 평균");

            int result = 0;

            for (int i = 0; i < STU_COUNT; i++) {
                // 번호 출력
                if (sc.hasNextInt()) {
                    System.out.print(sc.nextInt() + " ");
                } else {
                    System.out.println("\n입력 형식이 올바르지 않습니다. 숫자를 입력하세요.");
                    sc.close();  // 스캐너를 닫고 종료
                    return;
                }

                // 이름 출력
                if (sc.hasNext()) {
                    Name[i] = sc.next();
                    System.out.print(sc.next() + " ");
                } else {
                    System.out.println("\n입력 형식이 올바르지 않습니다. 이름을 입력하세요.");
                    sc.close();  // 스캐너를 닫고 종료
                    return;
                }

                int total = 0;
                for (int j = 0; j < SUB_COUNT; j++) {
                    // 다음 토큰이 정수인지 확인
                    if (sc.hasNextInt()) {
                        scores[i][j] = sc.nextInt();
                        System.out.print(scores[i][j] + " ");
                        total += scores[i][j];
                    } else {
                        System.out.println("\n입력 형식이 올바르지 않습니다. 숫자를 입력하세요.");
                        sc.close();  // 스캐너를 닫고 종료
                        return;
                    }
                }

                int rank = 1;
                for(int k=0; k<STU_COUNT; k++){
                    if(totalScores[k] > total){
                        rank ++;
                    }
                }

                // 총점 배열에 저장
                totalScores[i] = total;

                // 총점과 평균 출력
                double avg = (double) total / SUB_COUNT;
                System.out.printf("%-4d %.2f ", total, avg);
                System.out.println(" "  + rank);
            }
            System.out.println(Arrays.toString(scores[0]));
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (InputMismatchException e) {
            System.out.println("\n입력 형식이 올바르지 않습니다. 숫자를 입력하세요.");
        }
    }
}

