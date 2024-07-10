package java.easy;
/*
 * Q4 (Level - Easy) -> I'm trying to find the largest number in an array.
 * But my program gives an incorrect result. Can you identify the problem?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q4.java
 */

public class q4 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 6, 3};
        int max = 0; // Bug: Initialize max with the first element of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number in the array is: " + max);
    }
}

/* Fix: Initialize max with the first element of the array:
 * int max = arr[0];
 */
