import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels for the Christmas tree: ");
        int levels = scanner.nextInt();

        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < levels - i - 1; j++) {
                System.out.print(" ");
            }

            // Print asterisks for this level
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // konar drzewka
        for (int i = 0; i < levels - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        scanner.close();
    }
}