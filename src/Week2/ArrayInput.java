package Week2;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Initializing the length of an Array
        final int LENGTH = 100;
        double[] inputs = new double[LENGTH];
        int currentSize = 0;

        // Reading of input numbers
        System.out.println("Enter a sequence of values, press Q to stop");
        while (in.hasNextDouble()) {
            // Grow the array if it has been completely filled
            if (currentSize >= inputs.length) {
                inputs = Arrays.copyOf(inputs, 2 * inputs.length); // Grow the inputs array
            }
            inputs[currentSize] = in.nextDouble();
            currentSize++;
        }

        // Discarding excess elements
        inputs = Arrays.copyOf(inputs, currentSize);

        // Printing the array
        System.out.print(Arrays.toString(inputs));
        }
    }
