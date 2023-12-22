package Package09;

public class DriverRun {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.driver(new Bus(),true);
        d.driver(new Bus(),false);
        d.driver(new Taxi());
    }
}
