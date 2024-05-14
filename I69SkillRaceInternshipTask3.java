/* CREATE A LIMITED SIMPLE CHATBOT USING JAVA*/

import java.util.Scanner;

public class I69SkillRaceInternshipTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm your simple chatbot. How can I assist you today?");

        // Start conversation loop
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            // Respond to user input
            String botResponse = getResponse(userInput);
            System.out.println("Bot: " + botResponse);

            // End conversation if user says "bye"
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
        }
    }

    // Method to get bot's response based on user input
    public static String getResponse(String userInput) {
        String response;

        // Simple predefined responses
        if (userInput.contains("how are you")) {
            response = "I'm just a computer program, but thanks for asking!";
        } else if (userInput.contains("your name")) {
            response = "I'm just a simple chatbot. You can call me ChatBot.";
        } else if (userInput.contains("weather")) {
            response = "I'm sorry, I don't have access to weather information.";
        } else if (userInput.contains("joke")) {
            response = "Why don't scientists trust atoms? Because they make up everything!";
        } else {
            response = "Sorry, I don't understand. Can you please be more specific?";
        }

        return response;
    }
}




