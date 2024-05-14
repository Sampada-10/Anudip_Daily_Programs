package Patterns;
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numberOfRows = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            // Spaces before the numbers
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            System.out.println(); // Move to the next line for the next row
        }

        scanner.close();
    }
}
