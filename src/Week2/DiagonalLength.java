package Week2;

public class DiagonalLength {

    public static void main(String[] args) {

        double letterLength = 8.5;
        int letterHeight = 11;
        double perimeterLetter = (letterHeight + letterLength) * 2;  // Find perimeter by adding height and length //
        System.out.println("Perimeter of the letter is " + perimeterLetter);

        double diagonalLetter = Math.sqrt(letterLength * letterLength + letterHeight * letterHeight);
        System.out.print("Diagonal equals ");
        System.out.printf("%.2f\n", diagonalLetter);

    }
}
