package BasicCodes;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			// Sort the left half
			mergeSort(arr, left, mid);

			// Sort the right half
			mergeSort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		// Calculate the sizes of the two subarrays
		int size1 = mid - left + 1;
		int size2 = right - mid;

		// Create temporary arrays to store the elements
		int[] temp1 = new int[size1];
		int[] temp2 = new int[size2];

		// Copy the elements to the temporary arrays
		for (int i = 0; i < size1; i++) {
			temp1[i] = arr[left + i];
		}
		for (int j = 0; j < size2; j++) {
			temp2[j] = arr[mid + 1 + j];
		}

		// Merge the temporary arrays back into the original array
		int i = 0; // Initial index of the first subarray
		int j = 0; // Initial index of the second subarray
		int k = left; // Initial index of the merged subarray

		while (i < size1 && j < size2) {
			if (temp1[i] <= temp2[j]) {
				arr[k] = temp1[i];
				i++;
			} else {
				arr[k] = temp2[j];
				j++;
			}
			k++;
		}

		// Copy the remaining elements of temp1[], if any
		while (i < size1) {
			arr[k] = temp1[i];
			i++;
			k++;
		}

		// Copy the remaining elements of temp2[], if any
		while (j < size2) {
			arr[k] = temp2[j];
			j++;
			k++;
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

		// Perform merge sort
		mergeSort(arr, 0, n - 1);

		// Print the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		scanner.close();
	}
}
