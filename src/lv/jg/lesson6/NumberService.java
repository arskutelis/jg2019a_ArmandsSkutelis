package lv.jg.lesson6;

public class NumberService {

    //šai klasei nav jāsatur sevī stāvokļi, jo aprēķiniem katru reizi ir jāizmantoti jauni mainīgie
    //tādēļ tos vajag definēt metodes līmenī
    private int firstNumber;
    private int secondNumber;
    private int sum = 0;
    private int numberOfevens = 0; //typo

    public NumberService(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    //metode nosaukumi rakstāmi ar mazo burtu
    public int GetFirstNumber() {
        return firstNumber;
    }

    //metode nosaukumi rakstāmi ar mazo burtu
    public int GetSecondNumber() {
        return secondNumber;
    }

    //metodei ir jāatgriež rezultāts
    public void sumInRange() {
        //kāds būs rezultāts, ja piermais skaitlis būs lielāks par otro
        for (firstNumber = GetFirstNumber(); firstNumber <= secondNumber; firstNumber++) {
            sum = sum + firstNumber; //rakstām īsāk: sum =+ firstNumber;
        }
        System.out.println("Sum of numbers in range is = " + sum + ".");
    }

    //skatīt iepriekšējos komentārus
    public void getEvenNumberCount() {
        for (firstNumber = GetFirstNumber(); firstNumber <= secondNumber; firstNumber++) {
            if (firstNumber % 2 == 0) {
                numberOfevens++;
            }
        }
        System.out.println("Number of even numbers in range = " + numberOfevens + ".");

    }
}
