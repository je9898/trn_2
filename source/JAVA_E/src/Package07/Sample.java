package Package07;

interface Mineral{
    int getValue();
}
class Gold implements Mineral{
    public int getValue(){
        return  100;
    }
}
class Silver implements Mineral{
    public int getValue(){
        return  90;
    }
}
class Bronze implements Mineral{
    public int getValue(){
        return  80;
    }
}
class MineralCalculator{
    int value = 0;
    public void add(Mineral type) {
        this.value += type.getValue();
    }
}
public class Sample {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        Gold gd = new Gold();
        cal.add(gd);    //객체를 전달
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.value); // 270 출 력
    }
}