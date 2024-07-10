package java.easy;
/*
 * Q1 (Level - Easy) -> Hey! When I try to input numbers into an array, 
 * the program doesn't work as expected. 
 * I am trying to create a program that takes 9 integers as input from the user 
 * and then displays the array. However, when I run the program, it gives an unexpected output.
 * Can you tell me what the output should be and why I am getting this result?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q1.java
 */

import java.util.Scanner;

public class q1 {
    static int number_of_elements = 9;
    static int[] arr = new int[number_of_elements];

    public static void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements into the array");
        for (int i = 1; i < arr.length; i++) { // Bug: Loop should start from 0
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void displayArray() {
        // Printing the array
        System.out.println("The updated array is:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Accept input
        acceptInput();
        
        // Display array
        displayArray();
    }
}

/* Fix: Change the loop to start from 0 in the acceptInput method:
 * for (int i = 0; i < arr.length; i++) {
 *     arr[i] = sc.nextInt();
 * }
 */
