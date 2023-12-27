package Package12;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
class MakeClass{
    static String[] name; // 요놈 전역으로... 더 좋은방법 있는지 찾아보자
    public int MakeCnt(){  // 해당 반의 명수, 점수 입력 및 평균점수, 등수 도출하는 함수
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        System.out.println("몇 명?");
        return sc.nextInt();    // 해당 반 총 인원 수 return
    }

    public String[] MakeName(int cnt){
        String[] MemberName =   new String[cnt];// 해당 반 인원 이름
        Scanner sc = new Scanner(System.in);    // Scanner 객체 생성
        System.out.println("입력한 " + cnt + "명의 이름을 순서대로 입력하여 주세요.");
        String InputName = sc.nextLine(); // 이름을 공백을 기준으로 받기
        String[] OutputName = InputName.split(" ");
        //System.out.println(OutputName.length + " : " + cnt);
        if(OutputName.length != cnt){
            System.out.println("입력한 인원 수에 맞게 입력하세요.");
            MakeName(cnt);  //다시해.
        }
        return OutputName;   // 받은 이름 배열로 반환
    }

    public int[] MakeAvg(int cnt, String[] MemberName){
        Scanner sc =            new Scanner(System.in);    // Scanner 객체 생성
        //int[] MemberCnt =       new int[cnt];   // 해당 반 인원 번호
        int[] classMemberAvg =  new int[cnt];   // 해당 반 인원 평균 점수 (입력한 명수 크기의 배열)
        int[] Korean =          new int[cnt];   // 해당 반 인원 국어 점수 (입력한 명수 크기의 배열)
        int[] English =         new int[cnt];   // 해당 반 인원 영어 점수 (입력한 명수 크기의 배열)
        int[] Math =            new int[cnt];   // 해당 반 인원 수학 점수 (입력한 명수 크기의 배열)
        int[] Society =         new int[cnt];   // 해당 반 인원 사회 점수 (입력한 명수 크기의 배열)
        int[] Science =         new int[cnt];   // 해당 반 인원 과학 점수 (입력한 명수 크기의 배열)
        String InputScore;  // 인원별 국영수사과 점수 입력
        String[] scores;    // 입력받은 국영수사과 점수 배열로 만들기.

        //loof :  // 오 신기 이런거도있음1
        for(int i=0; i<cnt; i++){
            boolean err = false;    // 예외처리 발생 시 true
            System.out.println("'" + MemberName[i] + "' 학생의 국, 영, 수, 사, 과 점수를 입력하세요. (" + (cnt-i) + "명 남음)" );
            InputScore = sc.nextLine(); // 공백을 기준으로 문자열(과목별 점수) 받기

            scores = InputScore.split(" "); // 받은 문자열 7개 " " 를 기준으로 배열에 넣기

            if(scores.length!=5){   // 과목 5개 + 이름 + 번호 입력이 아닐 경우 예외처리
                System.out.println("'" + MemberName[i] + "' 학생 다시 입력하세요. (5개과목 모두 입력하세요.)");
                // continue loof; //오 신기 이런거도있음2
                err = true;
            }
            for (String s : scores) { //입력한 점수가 0~100이 아닌경우 예외처리    : forEach 문

                if ((Integer.parseInt(s))<0 || (Integer.parseInt(s))>100) {
                    if(!err){   // 여러번 나오는 경우가 있어 한번만 출력위함
                        System.out.println("'" + MemberName[i] + "' 학생 다시 입력하세요. (0점~100점 만 입력하세요.)");
                    }
                    // continue loof; //오 신기 이런거도있음3 끝
                    err = true;
                }
            }
            if(err){    // 예외처리 걸렸다 !
                i--;    // 순번 하나 줄여주고
                continue;   // 다시해
            }else{  // 예외처리 안걸렸다 !
                //MemberCnt[i] =  Integer.parseInt(scores[0]); // 학생 번호
                Korean[i] =     Integer.parseInt(scores[0]);    // 국어점수 i 번째 저장
                English[i] =    Integer.parseInt(scores[1]);   // 영어점수 i 번째 저장
                Math[i] =       Integer.parseInt(scores[2]);  // 수학점수 i 번째 저장
                Society[i] =    Integer.parseInt(scores[3]);   // 사회점수 i 번째 저장
                Science[i] =    Integer.parseInt(scores[4]);   // 과학점수 i 번째  저장
                classMemberAvg[i] = (Korean[i] + English[i] + Math[i] + Society[i] + Science[i])/5; // 평균점수 i 번째 저장
//                System.out.println(Arrays.toString(classMemberAvg));    // 평균점수 출력
            }
        }
//        System.out.println("Korean : " + Arrays.toString(Korean));
//        System.out.println("English : " + Arrays.toString(Korean));
//        System.out.println("Math : " + Arrays.toString(Korean));
//        System.out.println("Society : " + Arrays.toString(Korean));
//        System.out.println("Science : " + Arrays.toString(Korean));
//        System.out.println("classMemberRank : " + Arrays.toString(classMemberAvg));
        return classMemberAvg;  // 평균점수 return
    }

    public int[] MakeRank(int[] MemberAvg, String[] MemberName){
        // 음.. 내장함수로 내림차순 정렬 가능한데 Integer 형변환 해야해서 그냥 로직 만듬.
        int[] MemberRankScore = MemberAvg;  //평균 점수
        String[] MemberRankName = MemberName;   //이름
        for(int i=0; i<MemberRankScore.length-1; i++){   // MemberRank.length-1 해준 이유 : length까지 해주면 아래 + 1 하는부분 배열길이 초과해 에러.
            for(int j=0; j<MemberRankScore.length-1; j++){
                if(MemberRankScore[j] < MemberRankScore[j+1]){
                    int s = MemberRankScore[j];
                    MemberRankScore[j] = MemberRankScore[j+1];
                    MemberRankScore[j+1] = s;

                    String u = MemberRankName[j];
                    MemberRankName[j] = MemberRankName[j+1];
                    MemberRankName[j+1] = u;    // 이거 어케빼가냐?
                }
            }
        }
        name = MemberRankName;  //몰라 전역으로 줘버려
        //this.MemberName = MemberRankName;
        return MemberRankScore;
    }

    public void ShowRank(int[] MemberRank, String[] MemberName){
        int same = 999;   // 동일점수 비교값 / 100은안넘겠지
        String out = "";
        for(int i=0; i<MemberRank.length; i++){
            if(same != MemberRank[i]){
                System.out.println("Rank : '" + (i+1) + "', Name : '"+ MemberName[i] + "', Avg : '" + MemberRank[i]);
            }else{
                System.out.println("Rank : '" + (i) + "', Name : '"+ MemberName[i] + "', Avg : '" + MemberRank[i]);
            }
            same = MemberRank[i];   // 같은 점수 = 같은 등수 나타내기 위함
        }
        System.out.println(out);
    }

    public void ShowRank2(int[] MemberRank, String[] MemberName){   //out 할놈
        int same = 999;   // 동일점수 비교값 / 100은안넘겠지
        String out = "";
        for(int i=0; i<MemberRank.length; i++){
            if(same != MemberRank[i]){
                out += "Rank : '" + (i+1) + "', Name : '"+ MemberName[i] + "', Avg : '" + MemberRank[i] + "'\r\n";
            }else{
                out += "Rank : '" + (i) + "', Name : '"+ MemberName[i] + "', Avg : '" + MemberRank[i] + "'\r\n";
            }
            same = MemberRank[i];   // 같은 점수 = 같은 등수 나타내기 위함
        }
        String fileNm = "c:/work/out.txt";
        try{
            File file = new File(fileNm);
            FileWriter fileWrite = new FileWriter(file, false);
            fileWrite.write(out);
            fileWrite.flush();
            fileWrite.close();
            System.out.println(out);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}