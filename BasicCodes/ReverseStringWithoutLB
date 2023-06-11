package BasicCodes;
import java.util.Scanner;


public class ReverseStringWithoutLB {
    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program for Reversing a String");
        System.out.println("Enter the string to reverse:");
        String input = scanner.nextLine();
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}
