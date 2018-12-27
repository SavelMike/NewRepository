package Week2;

import java.util.Scanner;

public class ComaReader {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1.000 and 999.999: ");
        Scanner scanner = new Scanner(System.in);

        // Reading a number as a string
        String number = scanner.next();
        // Find a length of a number
        int length = number.length();
        // Extract substring
        String leftPart = number.substring (0, (length - 4));
        String rightPart = number.substring(length - 3);
        System.out.println(leftPart + rightPart);

    }
}
