package java.easy;
/*
 * Q10 (Level - Easy) -> I'm trying to find the average of some numbers.
 * However, my program is always printing the same incorrect result. 
 * Your task is to complete the calcuateAverage function such that any number of argument is acceptable
 * 
 * To execute the program open a terminal in the current working directory and execute the command - java q10.java
 */

public class q10 {
    double calculateAverage(int... numbers) { 

        /* Write your code here */

        // Task is to find the average

        /* Your code ends */
        return 0.0;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;

        // Error: Cannot access non-static method calculateAverage() from static context
        int average = calculateAverage(num1, num2, num3); // Bug: Trying to access a non-static method

        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
    }
}

/*
 * Fix: Create an instance of the class q10 and call the calculateAverage method
 * on that instance:
 * q10 obj = new q10();
 * double average = obj.calculateAverage(num1, num2, num3);
 * 
 * or make calculateAverage method static
 * 
 * Additionally, complete the calculation inside calculateAverage method to
 * calculate the average correctly:
 *
 * double calculateAverage(int... numbers) {
        if (numbers.length == 0) {
            return 0.0; // Handle case where no numbers are passed
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average as double to retain decimal precision
        double average = (double) sum / numbers.length;
        return average;
    }
 */
