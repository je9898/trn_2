package Package08;

class Tv implements RemoteControl{
    Tv(){

    }
    private int vol;

    @Override
    public void turnOn(){
        System.out.println("티비켜");
    };

    @Override
    public void turnOff(){
        System.out.println("티비꺼");
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
        System.out.println("소리크기 : " + this.vol);
    };

    public void test(){
        System.out.println("내가보이니?");
    }
}

