
package lv.jg.lesson2; //package rinda vienmēr ir pati pirmā klases failā
import static java.lang.System.out;
//OK, būtu pieticis tika ar int
public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 4;
        double sumResult = firstNumber + secondNumber;
        double subtractResult = firstNumber - secondNumber;
        int divideIntResult = firstNumber / secondNumber;
        double divideDoubleResult = (double)firstNumber / secondNumber;
        double multiplyResult = firstNumber * secondNumber;
        double remainderResult = firstNumber % secondNumber;
        out.println("The two numbers are: " + firstNumber + " and " + secondNumber);
        out.println("...........................................................");
        out.println("Sum is: " + sumResult);
        out.println("Subtract: " + subtractResult);
        out.println("Divide int: " + divideIntResult);
        out.println("Divide double: " + divideDoubleResult);
        out.println("Multiply is: " + multiplyResult);
        out.println("Remainder is: " + remainderResult);
    }
}
