package BasicCodes;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;

		// Perform n-1 passes
		for (int i = 0; i < n - 1; i++) {
			// Each pass compares adjacent elements and swaps them if necessary
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get the number of elements from the user
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		// Create an array to store the elements
		int[] arr = new int[n];

		// Get the elements from the user
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Perform bubble sort
		bubbleSort(arr);

		// Print the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		scanner.close();
	}
}
