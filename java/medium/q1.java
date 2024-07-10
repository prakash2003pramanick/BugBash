package java.medium;
/*
 * Q4 (Level - Hard) -> Hey! I am trying to implement the Selection Sort algorithm 
 * to sort an array of integers. However, my implementation seems to be incorrect and 
 * gives unexpected output. 
 * Can you help me understand what the output should be and why I am getting this result?
 * 
 * For example:
 * Input: [64, 25, 12, 22, 11]
 * Expected Output: [11, 12, 22, 25, 64]
 * 
 * To execute the program open a terminal in the current working directory using ctrl+shift+` and execute the command - javac q4.java && java q4
 */

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] arrCopy = arr.clone();

        selectionSort(arr);
        System.out.println("Sorted array (Selection Sort): " + Arrays.toString(arr));

        verifySortedArray(arr, arrCopy);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = 0; // min index should be initialized with i
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            // Introduced error: Incorrectly swapping elements
            int temp = arr[minIdx];
            arr[minIdx] = arr[minIdx]; // Logical error: This line should be arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void verifySortedArray(int[] arr, int[] arrCopy) {

        Arrays.sort(arrCopy);
        if (Arrays.equals(arr, arrCopy)) {
            System.out.println("The question is solved correctly!");
        } else {
            System.out
                    .println("The sorted arrays do not match. There is an error in the selection sort implementation.");
        }
    }
}
