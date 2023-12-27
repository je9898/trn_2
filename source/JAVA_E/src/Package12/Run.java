package Package12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Run {
    public static String[] MemberName;
    public static void main(String[] args) {
        //Map<String, Arrays> m = new LinkedHashMap<>();
        // MakeCnt() -> 명수입력
        // MakeName() -> 이름입력
        // MakeAvg() -> 국영수사과 점수입력 및 평균점수 도출
        // MakeRank() -> 평균도출
        // ShowRank() -> 등수출력
        // 기존방법 -> scanner 입력 -> fileRead

//        System.out.println("2개 이상의 정보를 입력할 시 띄어쓰기(' ')를 사용하여 한번에 입력해 주세요.");
//        MakeClass make = new MakeClass();
//        int MemberCnt = make.MakeCnt();  // 몇명인지 입력받기
//        MemberName = make.MakeName(MemberCnt); // 학생 이름 입력받기
//        int[] MemberAvg = make.MakeAvg(MemberCnt,MemberName);  // 과목별 평균점수 도출
//        int[] MemberRank = make.MakeRank(MemberAvg,MemberName);    // 평균점수 등수 도출
//        MemberName = MakeClass.name;
//        //System.out.println(Arrays.toString(MemberName));
//        make.ShowRank(MemberRank,MemberName);  // 등수 출력

        ReadClass read = new ReadClass();

        read.ReadFile();


    }
}

