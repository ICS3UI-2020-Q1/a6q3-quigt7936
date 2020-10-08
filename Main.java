import java.util.Scanner;
/**
 * Find the largest of the given numbers
 * @author Thomas Quigley
 */

/** 
 * the program doesn't work if all integers are negative, this is because the largest number starts at -1000 
 * and unless the starting largest number is negative infinity there is a chance that the user picks only numbers below the largest number
 * the way to fix this is to find the largest number at the end but I wanted to see if this way worked
 */

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declares the array and the largest number
    int[] givenNumbers = new int[10];
    int largestNumber = -1000;

    // ask for the numbers
    System.out.println("Please enter in 10 integers to put into the array");
    
    // store the numbers
    for (int i = 0; i < givenNumbers.length; i++) {
      givenNumbers[i] = input.nextInt();
      
      // find out if it's the largest number so far, if it is give it's value to the largest number variable
      if (givenNumbers[i] > largestNumber) {
        largestNumber = givenNumbers[i];
      }
    }

    // tells the user the largest number
    System.out.println("The largest number is " + largestNumber);
    
  }
}
