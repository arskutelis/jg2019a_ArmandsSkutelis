package lv.jg.lesson7;

//OK
public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService myArray = new ArrayService();

        int[] array = myArray.create(10);

        myArray.fillArrayWithRandomNumbers(array);

        myArray.printArraytoConsole(array);
        myArray.sumInArray(array);
    }
}
