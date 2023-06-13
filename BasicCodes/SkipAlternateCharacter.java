package BasicCodes;

import java.util.Scanner;

public class SkipAlternateCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		 String userInput = sc.nextLine();
	        String result = "";

	        for (int i = 0; i < userInput.length(); i++) {
	            if (i % 2 == 0) {
	                result += userInput.charAt(i);
	            }
	        }

	        System.out.println("Result: " + result);
	    }

}
