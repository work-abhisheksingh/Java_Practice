package BasicCodes;
import java.util.Scanner;;

public class CalculateCharacterFrequency {
	public static int calculateFrequency(String str, char ch) {
		int frequency = 0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==ch) {
				frequency++;
			}
			
		}
		return frequency;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String UserInput = sc.nextLine();
		System.out.println("Enter the Character: ");
		char Character = sc.nextLine().charAt(0);
		sc.close();
		int frequency = calculateFrequency(UserInput, Character);
		System.out.println("Frequency of "+Character+ " in the given String "+UserInput+ " is: " +frequency);

	}

}
