package java.easy;
/*
 * Q9 (Level - Easy) -> I'm trying to convert a string to uppercase.
 * But my program doesn't give the correct result. Can you identify the issue?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q9.java
 */

public class q9 {
    public static void main(String[] args) {
        String str = "hello";
        str.toUpperCase(); // Bug: toUpperCase() returns a new string
        System.out.println("Uppercase String: " + str);
    }
}

/* Fix: Assign the result of toUpperCase() to str:
 * str = str.toUpperCase();
 */
