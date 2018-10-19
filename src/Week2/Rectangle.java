package Week2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("There is a rectangle. Input lengths of rectangle sides. ");

        System.out.print("Input first side: ");
        double width = s.nextDouble();
        System.out.print("Input second side: ");
        double length = s.nextDouble();

        double perimeter = 2 * (width + length);
        double area = width * length;
        double diagonal = Math.sqrt(width * width + length * length);
        System.out.println("Perimeter of the rectangle equals: " + perimeter);
        System.out.println("Area of rectangle equals: " + area);
        System.out.printf("Diagonal equals: %.2f%n ", diagonal);

    }

}
