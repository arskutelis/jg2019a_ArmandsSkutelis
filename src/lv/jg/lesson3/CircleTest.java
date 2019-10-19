package lv.jg.lesson3;

import static java.lang.System.out;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        double circleRadius = circle.getRadius();
        out.println("The circle area for radius " + circleRadius +
                " is " + circle.calculateArea() + " cm2");
    }
}
