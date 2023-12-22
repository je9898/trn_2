package Package06;
public class Main06 {
    public static void main(String[] args) {
        interfaces in = new interfaces();
        interfaces.ZooKeeper zo = in.new ZooKeeper();
        interfaces.Tiger ti = in.new Tiger();
        interfaces.Lion li = in.new Lion();
        zo.feed((interfaces.NoNoOver) ti);
        zo.feed((interfaces.BarkBark) ti);

        //interfaces.Bouncer bo = in.new Bouncer();
        //bo.barkAnimal(ti);

        /*objects ob = new objects();
        objects.Counter co = ob.new Counter();
        System.out.println("before update:"+co.count);

        objects.Updater up = ob.new Updater();
        up.update(co);
        System.out.println("after update:"+co.count);*/
    }
}
