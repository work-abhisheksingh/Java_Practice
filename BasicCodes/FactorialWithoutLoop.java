package BasicCodes;

import java.util.Scanner;

public class FactorialWithoutLoop {
	private static long factorial(long number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long Number = sc.nextLong();
		sc.close();
		long result = factorial(Number);
		System.out.println("Factorial of the given Number is: " + result);

	}

}
