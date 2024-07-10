package java.easy;
/*
 * Q7 (Level - Easy) -> I'm trying to find the average of an array of numbers.
 * But my program doesn't give the correct result. Can you identify the issue?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q7.java
 */

public class q7 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length; // Bug: Integer division
        System.out.println("Average of the array is: " + average);
    }
}

/* Fix: Use double for average calculation:
 * double average = (double) sum / arr.length;
 */
