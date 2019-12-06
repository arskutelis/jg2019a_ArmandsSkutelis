package lv.jg.lesson7;

import java.util.Random;

public class ArrayService {
    //šis nekādā gadījumā nevar būt static
    //jo summa mainīsies katram aprēķinam, tādēļ jābūt lokālam
    private static int sum = 0;

    public int[] create(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);  //"101" vajag iznest kā konstanti, jo šis lielums paliek nemainīgs
        }
    }

    public void printArraytoConsole(int[] array) {  //typo
        for (int element : array) {
            System.out.print(element + ";");
        }
    }

    public void sumInArray(int[] array) {
        for (int count : array) {
            sum += count;
        }
        System.out.print("\n" + "Sum of numbers in range is = " + sum + ".");
    }
}
