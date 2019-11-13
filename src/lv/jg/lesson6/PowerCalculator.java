package lv.jg.lesson6;

public class PowerCalculator {

    //šeit arī neglabājam nekādu stāvokli
    //visi mainīgie tikai metodēs
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

    //šai metodei ir jāpieņem mainīgie un jāatdod rezultāts
    public void pow() {
        while (power != 0) {
            power--;
            result = result * number; //rakstām īsāk result =* number;
        }
        System.out.println("The result is " + result + "."); //teksta izvadi var veikt testa klasē
    }
}
