package TEST01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;   // 나 사용자에게 값 입력 받을거야

public class TE01 {
    public static void main(String[] args) {

    }
}

public class makeData{
    Scanner input = new Scanner(System.in); // Scanner 쓸거야
    System.out.println("시작 = \"go\"");
    String startStr = input.nextLine();  // 엔터 입력 전까지 저장  (String)
    ArrayList<String> data = new ArrayList<>();
        if(startStr.equals("go")){    // inputString == "a"  , == : 주소값 비교, equals : 데이터 비교
        System.out.println("계산 식을 입력해 주세요.");
        String endStr="";
        while(!endStr.equals("=")){
            endStr = input.next();
            if(!endStr.equals("=")){
                data.add(endStr);
            }
        }
        System.out.println(data);

    }else{
        System.out.println("bye");
    }
}