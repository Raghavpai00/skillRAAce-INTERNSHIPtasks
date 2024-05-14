/* Mona set off with great zeal to the "Fun Fair 2017". There were numerous
activities in the fair, though Mona liked the Candy game. Delicious candies
were wrapped in colourful foiled sheets with some random numbers on each
of the candies. The game coordinators then formed many groups of few
candies together, such that each candy group makes an integer and hid them
all around the room. The objective of the game is that the players should look
for the occurrences of number four anywhere in the integers (candy groups)
placed in the room.
Mona started off with the game where there are many such integers, for each
of them she should calculate the number of occurrences of the digit 4 in the
decimal representation. Can you please help her in succeeding the game?
Input format :
The only line of input contains a single integer from the candy group.
Output format :
Output should contain the number of occurrences of the digit 4 in the
respective integer from the candy groups that Mona gets.
sample test cases:
input 1 : 447474 - output 1 : 4
input 2 : 12 - output 2 : 0 */


import java.util.Scanner;

public class I68SkillRaceInternshipTask2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer from the candy group: ");
        int number = scanner.nextInt();

        // Calculate the number of occurrences of digit 4
        int occurrences = countDigitFour(number);

        // Print the result
        System.out.println("Number of occurrences of digit 4: " + occurrences);
    }

    public static int countDigitFour(int number) {
        // Convert the number to a string to iterate through each digit
        String numberStr = Integer.toString(number);

        int count = 0;

        // Iterate through each digit in the number
        for (int i = 0; i < numberStr.length(); i++) {
            // Check if the digit is 4
            if (numberStr.charAt(i) == '4') {
                count++;
            }
        }

        return count;
    }
}




