package java.easy;
/*
 * Q2 (Level - Easy) -> Hi! I'm trying to find the sum of the first 10 natural numbers.
 * However, my program doesn't seem to give the correct sum. 
 * Can you help me identify the issue and correct it?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q2.java
 */

public class q2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum); // Bug: Incorrect sum calculation logic
    }
}

/* Fix: Ensure the sum calculation logic is correct:
 * int sum = 0;
 * for (int i = 1; i <= 10; i++) {
 *     sum += i;
 * }
 */
