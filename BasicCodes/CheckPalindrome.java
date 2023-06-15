package BasicCodes;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string or number: ");
		String input = scanner.nextLine();

		// Remove any spaces and convert the input to lowercase
		String processedInput = input.replaceAll("\\s+", "").toLowerCase();

		// Check if the processedInput is a palindrome
		if (isPalindrome(processedInput)) {
			System.out.println("The string/number is a palindrome.");
		} else {
			System.out.println("The string/number is not a palindrome.");
		}

		// Close the scanner
		scanner.close();
	}

	// Method to check if a string/number is a palindrome
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		// Compare characters/digits from the start and end, moving towards the middle
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false; // Characters/digits don't match, not a palindrome
			}
			left++;
			right--;
		}

		return true; // All characters/digits matched, it is a palindrome
	}
}
