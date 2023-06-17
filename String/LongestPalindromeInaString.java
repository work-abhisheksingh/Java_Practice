package StringCode;

import java.util.Scanner;

public class LongestPalindromeInaString {
	public static String longestPalindrome(String S) {
		if (S == null || S.length() < 2) {
			return S;
		}

		int maxLength = 0;
		int start = 0;
		int end = 0;

		for (int i = 0; i < S.length(); i++) {
			int len1 = expandAroundCenter(S, i, i); // Check for odd-length palindromes
			int len2 = expandAroundCenter(S, i, i + 1); // Check for even-length palindromes

			int len = Math.max(len1, len2); // Length of the longest palindrome centered at current index

			if (len > maxLength) {
				maxLength = len;
				start = i - (len - 1) / 2; // Calculate start and end indices of the longest palindrome
				end = i + len / 2;
			}
		}

		return S.substring(start, end + 1); // Return the longest palindromic substring
	}

	private static int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1; // Length of the palindrome
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to check");
		String Input = sc.nextLine();
		String longestPalindrome = longestPalindrome(Input);
		System.out.println("Longest Palindromic Substring: " + longestPalindrome);

		sc.close();
	}

}
