package Package09;
public class Car {
    Tire[] tires = {
        new HanKookTire(), //FrontLeftTire
        new HanKookTire(), //FrontRightTire
        new HanKookTire(), //BackLeftTire
        new HanKookTire() //BackRightTire
    };


    void run(){
        for (int i = 0; i < tires.length; i++) {
            tires[i].roll();
        }
        /*for(Tire tire : tires){
            tire.roll();
        }*/
    }
}
