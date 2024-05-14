/*Pranav, an enthusiastic kid visited the "Fun Fair 2017" along with his family. His
        father wanted him to purchase entry tickets from the counter for his family
        members. Being a little kid, he is just learning to understand about units of money.
        Pranav has paid some amount of money for the tickets but he wants your help to
        give him back the change of Rs. N using minimum number of rupee notes.
        Consider a currency system in which there are notes of seven denominations,
        namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100. If the change given to Pranav Rs. N is
        input, write a program to computer smallest number of notes that will combine to
        give Rs. N.
        Input format:
        First line of the input is an integer N, the change to be given to Pranav.
        output format:
        Output should display the the smallest number of notes that will combine to give
        N.
        sample test cases:
        input 1 : 1200 - output 1 : 12
        input 2 : 242 - output 2 : 7 */





import java.util.Scanner;

public class I62SkillRaceInternshipTask1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the change to be given to Pranav: ");
        int N = scanner.nextInt();
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int numberOfNotes = 0;

        for (int denomination : denominations) {
            numberOfNotes += N / denomination;
            N %= denomination;
        }

        System.out.println("The smallest number of notes that will combine to give Rs. " + N + " is: " + numberOfNotes);
    }
}












//public class I62SkillRaceInternshipTask1A {
//}
