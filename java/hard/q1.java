package java.hard;
/*
 * Q3 (Level - Hard) -> Hey! I am trying to write a program to check if a number 
 * is a Strong Number. A Strong Number is a number whose sum of the factorial of its digits 
 * is equal to the number itself. For example, 145 is a Strong Number because 1! + 4! + 5! = 145.
 * However, my program seems to be stuck or gives an incorrect output. 
 * Can you tell me what the output should be and why I am getting this result?
 * 
 * For example:
 * Input: 145
 * Expected Output: 145 is a Strong Number.
 * 
 * Input: 123
 * Expected Output: 123 is not a Strong Number.
 * 
 * To execute the program open a terminal in the current working directory using ctrl+shift+` and execute the command - java q3.java
 */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Strong Number: ");
        int number = sc.nextInt();
        sc.close();
        
        boolean isStrong = isStrongNumber(number);
        if (isStrong) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        
        while (number != 0) {
            int digit = number / 10; // % <- remove while preparing actual programs
            sum += factorial(digit); // Calculate factorial of each digit
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n);  // n-1 <- remove while preparing actual programs
    }
}
