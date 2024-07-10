package java.easy;
/*
 * Q8 (Level - Easy) -> I'm trying to check if a number is even or odd.
 * But my program always returns "Odd". Can you identify the issue?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q8.java
 */

public class q8 {
    public static void main(String[] args) {
        int num = 4;
        if (num % 2 == 1) { // Bug: Incorrect condition for even check
            System.out.println(num + " is Odd");
        } else {
            System.out.println(num + " is Even");
        }
    }
}

/* Fix: Change the condition to check for even:
 * if (num % 2 == 0) {
 *     System.out.println(num + " is Even");
 * } else {
 *     System.out.println(num + " is Odd");
 * }
 */
