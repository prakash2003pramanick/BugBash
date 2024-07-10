package java.easy;
/*
 * Q3 (Level - Easy) -> I'm trying to reverse a string in my program. 
 * The output is not as expected. Can you find out what's wrong with it?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q3.java
 */

public class q3 {
    public static void main(String[] args) {
        String str = "Hello";
        String reversedStr = "";
        for (int i = 0; i <= str.length(); i++) { // Bug: Loop condition should be i < str.length()
            reversedStr = str.charAt(i) + reversedStr;
        }
        System.out.println("Reversed String: " + reversedStr);
    }
}

/* Fix: Change the loop condition to:
 * for (int i = 0; i < str.length(); i++) {
 *     reversedStr = str.charAt(i) + reversedStr;
 * }
 */
