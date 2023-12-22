package Package07;


class MyTV{
    private boolean isPowerOn;
    private int volume;
    private int channel;
    final int MAX_VOL = 100;
    final int MIN_VOL = 0;
    final int MAX_CHA = 100;
    final int MIN_CHA = 0;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {

        return channel;
    }

    public void setChannel(int channel) {
        if(channel>100||channel<1) return; // 사용자 입장에서 생각했을때 추가했어야하는 코드
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume>100||volume<0) return;
        this.volume = volume;
    }

    void gotoPrevChannel(){
        //setChannel(preChannel);
    }
}
public class YouTv {
    public static void main(String[] args) {
        MyTV t = new MyTV();
    }
}


