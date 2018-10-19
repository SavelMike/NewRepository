package Week2;

import java.util.Scanner;

public class Measurements {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Input a number of meters: ");
        double meters = s.nextDouble();

        final double METERSININCHES = 39.37008;
        final double METERSINFEET = 3.28084;
        final double METERSINMILES = 0.00062;

        System.out.println("This number is equal to " + (int)(meters * METERSININCHES) + " inches");
        System.out.println("This number in feet equals: " + (int)(meters * METERSINFEET) + " inches");
        System.out.println("This number in miles equals: " + (int)(meters * METERSINMILES) + " miles");
    }
}
