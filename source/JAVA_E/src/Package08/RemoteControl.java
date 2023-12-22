package Package08;
public interface RemoteControl {
    int Max_Vol = 10;
    int Min_Vol = 0;

    void turnOn();      // 추상 메소드
    void turnOff();
    void setVol(int vol);

    default void setMute(boolean mute){
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        }
    }

    static void changeBattery() {    // 정적메소드는 public 있어도 없어도 됨
        System.out.println("배터리 교체");
    }   // 안딸려와
}
