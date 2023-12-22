package Package04;

import java.util.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        /*ArraysClass a = new ArraysClass();
        a.ArraysMethod();*/

        /*ArrayListClass b = new ArrayListClass();
        b.ArrayListMethode();*/

        /*ArrayListClass2 c = new ArrayListClass2();
        c.ArrayListMethode2();*/

        /*HashMapClass d = new HashMapClass();
        m.MapMethode();*/

        /*HashSetClass e = new HashSetClass();
        e.HashSetMethode();*/

        /*System.out.println(CoffeeTypeClass.CoffeeType.AMERICANO);
        System.out.println(CoffeeTypeClass.CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeTypeClass.CoffeeType.CAFE_LATTE);*/

        /*test t = new test();
        String[][] Arr = {{"국어","65"}, {"영어","88"}, {"수학","73"}};
        t.qe1(Arr);
        t.qe2("880407-2345711");
        t.qe3();*/

        //CoffeeTypeClass.printCoffeePrice(CoffeeTypeClass.CoffeeType.AMERICANO);

        /*IfClass i = new IfClass();
        i.IfMethode();*/

        /*whileClass w = new whileClass();
        w.whileMethode();*/

        forClass w = new forClass();
        //w.forMethode();
        w.forMethode2();
    }
}
// 배열
class ArraysClass{
    public void ArraysMethod(){
        int[] odds = {1, 3, 5, 7, 9};   //int형 배열 만들래.
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}; //String형 배열 만들래.
        /*
        String[] week = new String[7];  //7칸 줄래.
        week[0] = "월";
        week[1] = "화";
        week[2] = "수";
        week[3] = "목";
        week[4] = "금";
        week[5] = "토";
        week[6] = "일";
        */
        String[] week = new String[weeks.length];   // weeks 길이만큼 공간 줄래
        for(int i=0; i<weeks.length; i++){  // weeks 길이만큼 for문 돌릴래
            week[i] = weeks[i]; // week i번째에 weeks i번째 값 넣을래
        }
        System.out.println("1. " + Arrays.toString(week).replaceAll(" ",""));   // String 형변환 하고 공백 지울래
        System.out.println("2. " + Arrays.toString(weeks)); // String 형변환 할래
    }
}

// 제네릭 사용 한 ArrayList
class ArrayListClass{
    public void ArrayListMethode(){
        ArrayList<String> pitches = new ArrayList<>();  // pitches 이름으로 ArrayList 만들래
        pitches.add("138"); // pitches ArrayList에 데이터 넣을래
        pitches.add("139");
        pitches.add("145");
        System.out.println("Q. " + pitches.get(0) + ", " + pitches.get(1) + ", " + pitches.get(2));
        System.out.println("1. " + pitches.toString()); // String 형변환 할래
        System.out.println("2. " + pitches.contains("140"));    // 140 들고있니?
        System.out.println("3. " + pitches.size());    // 너 몇칸이니?
        pitches.remove(2);  // 두번째 아이 지울래
        pitches.remove("139");  // "139" 지울래
        System.out.println("4. " + pitches.toString());

    }
}

// 제네릭 사용 안한 ArrayList
class ArrayListClass2{
    public void ArrayListMethode2() {
        ArrayList play = new ArrayList();  // play 이름으로 ArrayList 만들래 제네릭 안쓸거야
        play.add("129"); // play ArrayList에 데이터 넣을래
        play.add("135");
        play.add("145");

        String one = (String) play.get(0);  //제네릭 안쓰면 이렇게 명시적 형변환 해줘야해 귀찮으니 걍 제네릭 쓰자
        String two = (String) play.get(1);
        String thr = (String) play.get(2);
    }
}

//HashMap, LinkedHashMap
class HashMapClass{
    public void MapMethode(){
        Map<String, String[]> mapName = new LinkedHashMap<>();  //HashMap = 저장순서 보장 x, LinkedHashMap = 저장순서 보장
        String[][] Arr = {{"A","B"},{"C","D"}};

        //mapName.put("1", {"a","b"}); 중괄호 인식 못해 이건 에러다
        mapName.put("1",Arr[0]);
        mapName.put("2",Arr[1]);
        String[] key = mapName.keySet().toArray(new String[0]);
        // size 0으로 주는건 넣을게 0보다 크면 넣는크기 , 작으면 내가 설정한 size로
        // mapName.keySet() List 포멧인거같은데?
        System.out.println(mapName.keySet().getClass().getName());  //HashMap$KeySet
        System.out.println("KEY : " + Arrays.toString(key));
        for (String s : key) {
            System.out.println("VALUES : " + Arrays.toString(mapName.get(s)));
        }
    }
}

//HashSet
class HashSetClass{
    public void HashSetMethode(){
        //중복된 데이터를 제거하거나 이미 데이터가 추가되어 있는지를 검사할 때 주로 사용
        HashSet<String> set = new LinkedHashSet<>(Arrays.asList("h","e","l","l","o"));
        System.out.println(set);    //[h, e, l, o]  중복 값 제거하네? -> 집합 자료형

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(2,4,6,8,10));

        //교집합
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        //합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        //차집합
        HashSet<Integer> subtract = new HashSet<>(s1);
        subtract.removeAll(s2);
        System.out.println(subtract);

    }
}

class CoffeeTypeClass{
    //enum
    public enum CoffeeType{
        AMERICANO(3000,99),
        ICE_AMERICANO(4000,99),
        CAFE_LATTE(5000,99);

        private final int price;        //private : 여기서만쓸거다, final : 값변동못한다, int : 정수형이다
        private final int cnt;        //private : 여기서만쓸거다, final : 값변동못한다, int : 정수형이다

        CoffeeType(int i,int j) {
            this.price = i;
            this.cnt = j-1;
        }
        public int getPrice() {
            return price;
        }

        public int getCnt() {
            return cnt;
        }

    };
    public static void printCoffeePrice(CoffeeType type) {
        /*HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, CoffeeType.AMERICANO.getValue());
        priceMap.put(CoffeeType.ICE_AMERICANO, CoffeeType.ICE_AMERICANO.getValue());
        priceMap.put(CoffeeType.CAFE_LATTE, CoffeeType.CAFE_LATTE.getValue());
        int price = priceMap.get(type);
        System.out.println(priceMap);*/
        System.out.println("주문내역 : " + type);
        System.out.println("가격은 "+ type.getPrice() +"원입니다.");
        System.out.println("남은 수량은 "+ type.getCnt() +"개입니다.");
    }

}

class test{
    public void qe1(String[][] Arr){
        //입력된 과목명과 점수의 합과 평균을 구해라.
        Map<String, Integer> mapName = new LinkedHashMap<>();  //HashMap = 저장순서 보장 x, LinkedHashMap = 저장순서 보장
        int SUM = 0;
        int AVG = 0;
        for (int i=0; i<Arr.length; i++){
            SUM = SUM + Integer.parseInt(Arr[i][1]);
        }
        AVG = SUM/Arr.length;
        mapName.put("SUM",SUM);
        mapName.put("AVG",AVG);

        System.out.println(mapName);
    }

    public void qe2(String data){
        //주민번호를 가지고 출생년도와 번호부분을 나눠라.
        //입력 : 880407-2345711
        String[] number = data.split("-");
        System.out.println("출생년도 : " + number[0]);
        System.out.println("번호부분 : " + number[1]);
    }

    public void qe3(){
        //ArrayList 사용
        //asList 사용
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,7,2,4,5,3,6));
        al.sort(Collections.reverseOrder());
        System.out.println(al);
    }


}


class IfClass {
    public void IfMethode(){
        int money = 2000;
        boolean hasCard = true;
        if(money >= 3000 && hasCard){
            System.out.println("버스로");
        }else{
            System.out.println("걸어라");
        }

        ArrayList<String> po = new ArrayList<>();
        po.add("paper");
        po.add("handPhone");
        po.add("don");

        if(po.contains("paper")){
            System.out.println("버스로");
        }else{
            System.out.println("걸어라");
        }
    }
}

class whileClass{
    public void whileMethode(){
        int treeten = 0;
        while (treeten < 10){
            treeten ++;
            System.out.println("나무를 " + treeten + "번 찍었어요.");
            if(treeten == 10){
                System.out.println("나무가 넘어가요!");
            }
        }
    }
}

class forClass{
    public void forMethode(){
        int[] mark = {90, 55, 60, 75, 85, 43};
        for (int j : mark) {
            if (j >= 60) {
                System.out.println(j + "은 합격");
            }else{
                System.out.println(j + "은 불합격");
            }
        }
    }

    public void forMethode2(){
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                if(String.valueOf(i*j).length()==1){
                    System.out.print(j+"x"+i+"=0"+i*j+"   ");
                }else{
                    System.out.print(j+"x"+i+"="+i*j+"   ");
                }
            }
            System.out.println("  ");
        }
    }
}