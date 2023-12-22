package Package09;

public class Driver {
    public void driver(Vehicle vehicle, boolean YN){
        // 요금 확인 조건
        if(YN){
            vehicle.run();
        }else{
            Bus b = new Bus();
            //Bus b = (Bus) vehicle;
            b.checkFare();
        }
    }
    public void driver(Vehicle vehicle){
        //클래스 비교법
        System.out.println(vehicle.getClass());
        System.out.println(Taxi.class);
        System.out.println(vehicle.getClass()==Taxi.class);
        System.out.println(Taxi.class.equals(vehicle.getClass()));

        //인스턴스 사용중인 클래스인지 확인
        System.out.println(vehicle instanceof Bus);
        vehicle.run();
    }
}
