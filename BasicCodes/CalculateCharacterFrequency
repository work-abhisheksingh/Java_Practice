package BasicCodes;

import java.util.Scanner;

public class CalculateCharacterFrequency {
    public static int calculateFrequency(String str, char ch) {
        int frequency = 0;
        ch = Character.toLowerCase(ch); 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i)); 
            if (currentChar == ch) {
                frequency++;
            }
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String userInput = sc.nextLine();
        System.out.println("Enter the Character: ");
        char character = sc.nextLine().toLowerCase().charAt(0); 
        sc.close();

        int frequency = calculateFrequency(userInput, character);
        System.out.println("Frequency of " + character + " in the given String " + userInput + " is: " + frequency);
    }
}
