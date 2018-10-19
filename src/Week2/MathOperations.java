package Week2;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please input two numbers: ");

        int firstNum = s.nextInt();
        int secondNum = s.nextInt();
        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = (firstNum * secondNum);
        double average = sum / 2.0;
        int distance = Math.abs(firstNum - secondNum);
        int maxNum = Math.max(firstNum, secondNum);
        int minNum = Math.min(firstNum, secondNum);

        System.out.printf("Sum: %9d%n", sum);
        System.out.printf("Difference: %d%n", difference);
        System.out.printf("Product: %5d%n", product);
        System.out.printf("Average: %5.2f%n", average);
        System.out.printf("Distance: %4d%n", distance);
        System.out.printf("Maximum: %5d%n", maxNum);
        System.out.printf("Minimum: %5d%n", minNum);
    }
}
