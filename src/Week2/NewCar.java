package Week2;

import java.util.Scanner;

public class NewCar {
    public static void main(String[] args) {

        System.out.println("You are buying a new car. Input the following details: ");
        Scanner scanner = new Scanner(System.in);

        // User input the price of the car
        System.out.println("What is the price of the car:  ");

        final double priceCar = scanner.nextDouble();

        System.out.println("How many miles are you planning to go?");
        // User input estimated miles driven
        final double milesDriven = scanner.nextDouble();

        System.out.println("What is the gas price of today?");
        // User input gas price of today
        final double gasPrice = scanner.nextDouble();

        System.out.println("How much do you want to get for your car after?");
        // User input resale value
        final double resaleValue = scanner.nextDouble();

        System.out.println("What is the efficiency of your car?");
        // User input  efficiency of the car
        final double milesPerGal = scanner.nextDouble();

        // Set variables
        final double newHybridPrice = 74100;
        final double usedHybridPrice = 45900;
        final double newHybridResale = 35000;
        final double usedHybridResale = 25000;
        final double newHybridMPG = 26;
        final double usedHybridMPG = 27;

        // Calculations
        double carGasCost = 5 * (milesDriven / milesPerGal) * gasPrice;
        double hybridNewGasCost = 5 * (milesDriven / newHybridMPG) * gasPrice;
        double hybridUsedGasCost = 5 * (milesDriven / usedHybridMPG) * gasPrice;

        double carTotalCost = priceCar + carGasCost - resaleValue;
        double hybridNewTotalCost = newHybridPrice + hybridNewGasCost - newHybridResale;
        double hybridUsedTotalCost = usedHybridPrice + hybridUsedGasCost - usedHybridResale;

        // Conclusion
        System.out.println("With stable gas prices and with " + milesDriven + "miles per year in the next 5 years:");
        System.out.printf("Your car total cost will be: \t$%10.2f", carTotalCost);
        System.out.printf("\n 2018 Volvo XC60 total cost will be:  \t$%10.2f", hybridNewTotalCost);
        System.out.printf("\n 2015 Volvo XC60 total cost will be: \t$%10.2f", hybridUsedTotalCost);
    }
}
