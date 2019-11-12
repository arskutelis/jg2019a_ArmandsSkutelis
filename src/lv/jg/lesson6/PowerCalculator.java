package lv.jg.lesson6;

public class PowerCalculator {
    private int number;
    private int power;
    private int result = 1;

    public PowerCalculator(int number, int power) {
        this.number = number;
        this.power = power;
    }
    public int getNumber() {
        return number;
    }

    public int getPower() {
        return power;
    }
    public void pow() {
        while (power != 0) {
            power--;
            result = result * number;
        }
        System.out.println("The result is " + result + ".");
    }
}
