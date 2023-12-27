package Package12;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadClass {
    public void ReadFile() {
        try {
            // 파일에서 받자
            byte[] b = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream("c:/work/data.txt");
            fileInputStream.read(b);
            String coverted = new String(b, StandardCharsets.UTF_8);
            String[] ReadArr = coverted.split(",");
            fileInputStream.close();
            // 파일에서 받자

            String[] ReadName = ReadName(ReadArr); //이름만 뽑아

            for(int i=0; i<ReadName.length; i++){   // 줄바꿈 제거 안해주면 모양 안이뻐
                ReadName[i] = ReadName[i].replaceAll("\r\n","");
            }
            int[] ReadAvg = ReadAvg(ReadName.length, ReadName, ReadArr);    //평균 도출
            MakeClass m = new MakeClass();
            int[] MemberRank = m.MakeRank(ReadAvg,ReadName);    // 평균점수 등수 도출
            m.ShowRank2(MemberRank,MakeClass.name);  // 등수 출력

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String[] ReadName(String[] ArrData) {
        int cnt = ArrData.length / 6; //인원수
        //System.out.println(Arrays.toString(ArrData));
        ArrayList<String> NameList = new ArrayList<>();
        for (int i = 0; i < ArrData.length; i++) {  // 어레이 리스트에 이름만 (0번쨰, 6번쨰 ) 넣기.
            if (i!=ArrData.length-1 && i % 6 == 0) {    //if문 앞에서부터 검증 띠발 제일뒤 공백 제거 로직
                NameList.add(ArrData[i]);
            }
        }
        
        String[] NameArr = new String[NameList.size()]; //배열 새로 만들고
        for(int i=0; i<NameList.size(); i++){       // 어레이 리스트 배열에 넣어주고
            NameArr[i] = NameList.get(i);
        }

        return NameArr;   // 받은 이름 배열로 반환
    }

    public int[] ReadAvg(int cnt, String[] MemberName, String[] ArrData){
        //int[] MemberCnt =       new int[cnt];   // 해당 반 인원 번호
        int[] classMemberAvg =  new int[cnt];   // 해당 반 인원 평균 점수 (입력한 명수 크기의 배열)
        int[] Korean =          new int[cnt];   // 해당 반 인원 국어 점수 (입력한 명수 크기의 배열)
        int[] English =         new int[cnt];   // 해당 반 인원 영어 점수 (입력한 명수 크기의 배열)
        int[] Math =            new int[cnt];   // 해당 반 인원 수학 점수 (입력한 명수 크기의 배열)
        int[] Society =         new int[cnt];   // 해당 반 인원 사회 점수 (입력한 명수 크기의 배열)
        int[] Science =         new int[cnt];   // 해당 반 인원 과학 점수 (입력한 명수 크기의 배열)
        String InputScore;  // 인원별 국영수사과 점수 입력
        String[] scores;    // 입력받은 국영수사과 점수 배열로 만들기.

        ArrayList<String> ScoreList = new ArrayList<>();

        for (int i = 0; i < ArrData.length; i++) {  // 어레이 리스트에 점수만 ( 6번쨰 제외 ) 넣기.
            if (i % 6 != 0) {
                ScoreList.add(ArrData[i]);
            }
        }
        String[] ScoreArr = new String[ScoreList.size()]; //배열 새로 만들고
        for(int i=0; i<ScoreList.size(); i++){       // 어레이 리스트 배열에 넣어주고
            ScoreArr[i] = ScoreList.get(i);
        }
        int i=0;
        for(int j=0; j<cnt; j++){
            Korean[j] =     Integer.parseInt(ScoreArr[i]);    // 국어점수 i 번째 저장
            English[j] =    Integer.parseInt(ScoreArr[i+1]);   // 영어점수 i 번째 저장
            Math[j] =       Integer.parseInt(ScoreArr[i+2]);  // 수학점수 i 번째 저장
            Society[j] =    Integer.parseInt(ScoreArr[i+3]);   // 사회점수 i 번째 저장
            Science[j] =    Integer.parseInt(ScoreArr[i+4]);   // 과학점수 i 번째  저장
            classMemberAvg[j] = (Korean[j] + English[j] + Math[j] + Society[j] + Science[j])/5; // 평균점수 i 번째 저장
            i = i + 5;
        }
        //System.out.println("classMemberAvg : " + Arrays.toString(classMemberAvg));
        return classMemberAvg;  // 평균점수 return
    }
}
