package lv.jg.lesson2;

import static java.lang.System.out;
import java.util.Random;
//OK
public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int generatedNumberOne = randomGenerator.nextInt(21);
        int generatedNumberTwo = randomGenerator.nextInt(21);
        int generatedNumberThree = randomGenerator.nextInt(21);
        out.println("Random numbers are: " + generatedNumberOne + " " + generatedNumberTwo + " " + generatedNumberThree);
        //skaitļu summu vajag iznest vai nu atsevišķā mainīgajā vai vēl labāk - metodē
        out.println ("Sum is: " + (generatedNumberOne + generatedNumberTwo + generatedNumberThree));
    }
}
