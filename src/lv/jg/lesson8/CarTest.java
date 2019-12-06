package lv.jg.lesson8;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("four wheel", "Audi", 2006);
        Bus bus = new Bus("four wheel", "Solaris", 2012, "medium");
        PassengerCar passengerCar = new PassengerCar("four wheel", "Audi", 2014, 5);
        Truck truck = new Truck("four wheel", "Volvo", 2010, "heavy duty");

        System.out.println(car);
        System.out.println(bus);
        System.out.println(passengerCar);
        System.out.println(truck);
    }
}
