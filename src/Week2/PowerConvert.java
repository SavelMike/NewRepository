package Week2;
import java.util.Scanner;

public class PowerConvert {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num = s.nextInt();
        double numSquare = num * num;
        System.out.println("Your number in square is " + numSquare);
        double numCube = num * num * num;
        System.out.println("Your number in cube is " + numCube);
        double numFourth = Math.pow(num, 4);
        System.out.println("Your number in fourth is " + numFourth );
    }
}
