package lv.jg.lesson6;

public class NumberService {
    private int firstNumber;
    private int secondNumber;
    private int sum = 0;
    private int numberOfevens = 0;

    public NumberService(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int GetFirstNumber() {
        return firstNumber;
    }

    public int GetSecondNumber() {
        return secondNumber;
    }

    public void sumInRange() {
        for (firstNumber = GetFirstNumber(); firstNumber <= secondNumber; firstNumber++) {
            sum = sum + firstNumber;
        }
        System.out.println("Sum of numbers in range is = " + sum + ".");
    }

    public void getEvenNumberCount() {
        for (firstNumber = GetFirstNumber(); firstNumber <= secondNumber; firstNumber++) {
            if (firstNumber % 2 == 0) {
                numberOfevens++;
            }
        }
        System.out.println("Number of even numbers in range = " + numberOfevens + ".");

    }
}
