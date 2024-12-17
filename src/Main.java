import java.util.Scanner;

/**
 * The Main class contains the main method that serves as the entry point for the application.
 * This class implements a simple chatbot that interacts with users through the console.
 * Users can input predefined queries, and the chatbot provides corresponding responses.
 * If the input does not match any predefined responses, the chatbot informs the user
 * that the input is not understood.
 */
public class Main {
    public static void main(String[] args) {
        // creating variable to store users input
        String userInput;
        // initiate a new scanner to read what users type
        Scanner sc = new Scanner(System.in);
        // greeting the user
        System.out.println("******HELLO! WELCOME TO MY SIMPLE CHATBOT!!******");
        // asking the user to insert their question
        System.out.println("\nPlease type your inquire.");
        // saving the user's answer in the variable userInput
        userInput = sc.nextLine();
        // comparing what the user has written and return an answer
        if(userInput.equalsIgnoreCase("Hello") || userInput.equalsIgnoreCase("Hi")){
            System.out.println("Hello :)");
        } else if (userInput.equalsIgnoreCase("How are you") || userInput.equalsIgnoreCase("How's it going")) {
            System.out.println("I'm great, thanks for asking");
        } else if (userInput.equalsIgnoreCase("what's the weather like") || userInput.equalsIgnoreCase("weather")){
            System.out.println("Always raining !! This is Ireland LOL");
        } else if(userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")){
            System.out.println("Goodbye, it was nice talking to you");
        } else { // this line is executed when none of the other options is true
            System.out.println("Sorry, I couldn't understand what you need");
        }
        sc.close();
    }
}