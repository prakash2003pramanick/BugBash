package java.easy;
/*
 * Q5 (Level - Easy) -> I'm trying to find the length of a string.
 * But my program gives an incorrect result. Can you identify the issue?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q5.java
 */

public class q5 {
    public static void main(String[] args) {
        String str = "Hello";
        int length = str.length() - 1; // Bug: Incorrect length calculation
        System.out.println("Length of the string is: " + length);
    }
}

/* Fix: Correct the length calculation:
 * int length = str.length();
 */
