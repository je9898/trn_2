package Package08;

public class RemoteControlEXM {
    public static void main(String[] args) {
        RemoteControl tv = new Tv();    //TV 따로노는친구 못읽어, RemoteControl에 있는친구만 읽어
        RemoteControl ad = new Audio();

        Tv test = new Tv();

        tv.turnOn();    //티비켜
        ad.turnOn();    //오디오켜
 
        tv.setMute(true);   //디폴트 메소드
        RemoteControl.changeBattery();  //private 메소드

        //((RemoteControl) tv).test(); 요놈을 아래로 변경 해야 접근 가능해!
        //((Tv) tv).test();  // 인스턴스 우선

        test.test();
    }
}
