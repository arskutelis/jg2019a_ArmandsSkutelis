package lv.jg.lesson1;

import static java.lang.System.out;
import java.util.Random;
public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int generatedNumberOne = randomGenerator.nextInt(21);
        int generatedNumberTwo = randomGenerator.nextInt(21);
        int generatedNumberThree = randomGenerator.nextInt(21);
        out.println("Random numbers are: " + generatedNumberOne + " " + generatedNumberTwo + " " + generatedNumberThree);
        out.println ("Sum is: " + (generatedNumberOne + generatedNumberTwo + generatedNumberThree));
    }
}
