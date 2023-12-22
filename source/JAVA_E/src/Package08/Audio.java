package Package08;
public class Audio implements RemoteControl{
    Audio(){

    }
    private int vol;

    @Override
    public void turnOn(){
        System.out.println("라디오켜");
    };

    @Override
    public void turnOff(){
        System.out.println("라디오꺼");
    };

    @Override
    public void setVol(int vol){
        if(vol > RemoteControl.Max_Vol){
            this.vol = RemoteControl.Max_Vol;
        }else if(vol < RemoteControl.Min_Vol){
            this.vol = RemoteControl.Min_Vol;
        }else{
            this.vol = vol;
        }
        System.out.println("지금 소리 크기는  : " + this.vol);
    };
}
