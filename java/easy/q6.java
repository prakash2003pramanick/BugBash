package java.easy;
/*
 * Q6 (Level - Easy) -> I'm trying to print a right-angled triangle pattern using stars.
 * But my program doesn't give the expected output. Can you find the issue?
 * 
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q6.java
 */

public class q6 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* Fix: No fix needed, this program should print the expected pattern:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
