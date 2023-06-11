package BasicCodes;
import java.util.Scanner;

// Java code to demonstrate star patterns
public class PrintPattern {
    // Function to demonstrate printing pattern
    public static void printStars(int n) {
        int i, j;

        // outer loop to handle number of rows
        // n in this case
        for (i = 0; i < n; i++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        printStars(n);
    }
}
