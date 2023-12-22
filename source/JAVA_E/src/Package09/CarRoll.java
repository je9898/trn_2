package Package09;

public class CarRoll {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
        myCar.tires[0] = new KeumhoTire();
        myCar.tires[1] = new KeumhoTire();
        myCar.run();



    }
}
