package BasicCodes;
import java.util.Scanner;

public class ReverseString {
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("___________________Program for Reversing a String______________");
        System.out.println("Enter the string to reverse:");
        String input = scanner.nextLine();
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}
