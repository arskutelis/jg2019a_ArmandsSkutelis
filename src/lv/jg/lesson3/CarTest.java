package lv.jg.lesson3;

public class CarTest {
    public static void main(String[] args) {
        Car carBMW = new Car();
        carBMW.setColor("yellow");
        carBMW.setManufacturer("BMW");
        carBMW.setYear(2011);

        Car carVolvo = new Car();
        carVolvo.setColor("black");
        carVolvo.setManufacturer("Volvo");
        carVolvo.setYear(2009);

        Car carAudi = new Car();
        carAudi.setColor("purple");
        carAudi.setManufacturer("Audi");
        carAudi.setYear(2015);

        carVolvo.carMethod();
        carBMW.carMethod();
        carAudi.carMethod();
    }
}
