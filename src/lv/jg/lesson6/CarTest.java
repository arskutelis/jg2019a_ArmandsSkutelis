package lv.jg.lesson6;

//OK
public class CarTest {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "silver", 5, 1);
        audi.isDriving();
        audi.canAccelerate();
        audi.accelerate();
        audi.canAccelerate();
        audi.accelerate();
        audi.slowDown();
        audi.canAccelerate();
        audi.speedUp();
        audi.slowDown();
        audi.slowDown();
        audi.slowDown();
        audi.slowDown();
        audi.slowDown();
        audi.canAccelerate();
        audi.isDriving();
        audi.speedUp();
        audi.canAccelerate();
    }
}
