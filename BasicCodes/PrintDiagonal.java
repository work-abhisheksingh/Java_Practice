package BasicCodes;

import java.util.Scanner;

public class PrintDiagonal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();

		int[][] matrix = new int[rows][columns];

		System.out.println("Enter the matrix elements:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("The matrix is:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The diagonal elements are:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}

		scanner.close();
	}
}
