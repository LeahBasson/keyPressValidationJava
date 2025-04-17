package keypressvalidation;

import java.util.Scanner;

public class KeyPressValidation {

    public static void main(String[] args) {
        // Use a switch statement to validate key presses on a keyboard.
        // If the user enters a number between 0-9, the program will display "Number valid".
        // Otherwise it will display "Not allowed."

        Scanner kbd = new Scanner(System.in);

        System.out.println("Please enter a number between(0-9): ");
        int num = kbd.nextInt();

        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Number valid.");
                break;
            default: System.out.println("Not allowed.");
        }
    }

}
