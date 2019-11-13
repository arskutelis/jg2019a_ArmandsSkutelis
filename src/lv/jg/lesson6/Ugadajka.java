package lv.jg.lesson6;

import java.util.Random;
import java.util.Scanner;

//Ievērojam tos principus kurus esam iemācījušies
//Izmantojam atsevišķas klases, lai veidotu objektus
//izmantojam iespēju loģiku iznest metodēs utt.
public class Ugadajka {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner userNumber = new Scanner(System.in);  //
        System.out.println("Enter a number from 1 to 100");
        userNumber.nextInt();
        System.out.println("..............................");

        Scanner input = new Scanner(System.in);
        char letter;
        boolean result = false;
        int guess;
        int max;
        int lowestBorder = 1;
        int highestBorder = 100;
        do {
            max = highestBorder - lowestBorder;
            guess = random.nextInt(max) + lowestBorder;
            System.out.println("You number is: " + guess + " M(More), L(Less), Y(Yes)");
            System.out.println("********Highest border: " + highestBorder + ", lowest border " + lowestBorder + "********");
            letter = input.nextLine().toLowerCase().charAt(0);
            switch (letter) {
                case 'm': {
                    lowestBorder = guess;
                    break;
                }
                case 'l': {
                    highestBorder = guess;
                    break;
                }
                case 'y': {
                    result = true;
                    break;
                }
                default:
                    System.out.println("Please enter valid answer.");
            }
        } while (!result);
        System.out.println("I win!");
    }
}
