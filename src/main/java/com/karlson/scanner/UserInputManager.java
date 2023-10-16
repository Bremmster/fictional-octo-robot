package com.karlson.scanner;

import java.util.Scanner;

public class UserInputManager {


    private static final Scanner scanner = new Scanner(System.in);

    private UserInputManager() {
    }

    public static int getLimitedInt(int min, int max) {
        int input = getInt();
        if (input >= min && input <= max || input == 9) {
            return input;
        } else {
            System.out.println("Not a valid choice!");
            return getLimitedInt(min, max);
        }
    }

    public static int getInt() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid int!");
            }
        }
        return input;
    }

    public static String getString() {
        System.out.print("Set name: ");
        return scanner.nextLine();
    }
}
