//package Package11;
//import java.util.Scanner;
//
//public class CalNoClassNoMethode {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in); // Scanner 객체 생성
//
//        boolean YN = true;  //false까지 while 돌꺼야.
//        while (YN){
//            System.out.println("여기부터");
//            int a = in.nextInt();//시작값 입력받기
//            System.out.println("여기까지");
//            int b = in.nextInt();//종료값 입력받기
//            int res = 0;    //결과값
//
//            if(a > b){
//                System.out.println("맞냐? 맞으면Y, 틀리면N");
//                String real = in.next();    //y,n 입력받기
//                if(real.equals("N")){   //n이면?
//                    System.out.println("다시");
//                    continue;   //이번 while은 여기까지...
//                }
//                //a와 b 값 교체 시작
//                int c = a;
//                a = b;
//                b = c;
//                //a와 b 값 교체 끝
//            }
//            for(int i=a; i<=b; i++) {   //더해
//                res = res + i;
//            }
//            YN = false; //너 while 그만돌아
//            System.out.println("요놈 : " + res);
//        }
//
//
//        //String z = in.next();
//
//        //System.out.println("String next() : " + System.identityHashCode(z));    //String next() 로 받은 아이 주소값
//        //System.out.println("String 'a' : " + System.identityHashCode('a'));  //그냥 문자 'a' 친구 주소값
//        // == : 주소값을 비교한다.
//        // .equals() : 문자 비교한다.*/
//    }
//}
