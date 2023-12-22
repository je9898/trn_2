package Package06;

public class Phone {
    String name;
    String model;
    String color;

    void powerOn(){
        System.out.println("켜.");
    }

    void powerOff(){
        System.out.println("꺼.");
    }

    void bell(){
        System.out.println("벨.");
    }

    void sendVoice(String message){
        System.out.println("내가 + " + message + ".");
    }

    void receiveVoice(String message){
        System.out.println("네가 + " + message + ".");
    }

    void hangup(){
        System.out.println("끊어.");
    }
}



