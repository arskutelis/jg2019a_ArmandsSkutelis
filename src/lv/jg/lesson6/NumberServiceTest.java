package lv.jg.lesson6;

//šeit vajag precīzāk uzraksīt testa gadījumus
//un sadalīt tos pa atsevišķām metodēm
public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService testNumbersSum = new NumberService(2, 51);
        NumberService testNumbersEven = new NumberService(2, 51);
        testNumbersSum.sumInRange();
        testNumbersEven.getEvenNumberCount();

    }
}
