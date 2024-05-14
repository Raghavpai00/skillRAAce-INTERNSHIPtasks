/*Write a program to calculate the sum of odd and even digits in a number. The
input consists of a single integer 'n' which corresponds to the given
number.The output must display the sum of odd numbers and even
numbers.
Input format:
Input consists of a long number.
output format:
Output prints the sum of odd numbers and even numbers separated by a
space.
sample test cases:
input : 3924209420352 - output : 29 16  */



import java.util.Scanner;

public class I67SkillRaceInternshipTask2A  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scanner.nextLong();

        // Calculate the sum of odd and even digits
        long[] sums = sumOddEvenDigits(n);

        // Print the result
        System.out.println("Sum of odd numbers and even numbers: " + sums[0] + " " + sums[1]);
    }

    public static long[] sumOddEvenDigits(long n) {
        long oddSum = 0;
        long evenSum = 0;

        // Convert the number to a string to iterate through each digit
        String numberStr = Long.toString(n);

        // Iterate through each digit in the number
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));

            // Check if the digit is odd or even
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return new long[]{oddSum, evenSum};
    }
}







