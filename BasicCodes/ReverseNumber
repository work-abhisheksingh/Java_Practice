package BasicCodes;

import java.util.Scanner;

public class ReverseNumber {
    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for Reversing the Number");
        System.out.println("Enter the Number to reverse:");
        int number = sc.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reverse of the Number is: " + reversedNumber);
    }
}

