# Simple Chatbot Program

This is a simple Java program that implements a Chatbot to respond to user queries entered via the console. It provides answers for predefined queries and informative messages if the user's input is not recognized.

## Features

- Responds to greetings like "Hello" and "Hi".
- Responds to questions about well-being ("How are you" and "How's it going").
- Comments about the weather when asked ("what's the weather like" or "weather").
- Ends the interaction politely when the user types "bye" or "goodbye".
- Informs the user if the input is not understood.

## How to Use

1. Make sure Java 17 (or higher) is installed on your machine.
2. Clone or download this repository.
3. Compile the program using `javac`:
   ```bash
   javac Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```
5. Type a query in the console and see the Chatbot's response.

## Examples of Use

1. **Input**: `Hello`  
   **Output**: `Hello :)`

2. **Input**: `How are you`  
   **Output**: `I'm great, thanks for asking`

3. **Input**: `what's the weather like`  
   **Output**: `Always raining !! This is Ireland LOL`

4. **Input**: `bye`  
   **Output**: `Goodbye, it was nice talking to you`

5. **Input**: Any other text  
   **Output**: `Sorry, I couldn't understand what you need`

## Source Code

Here is the code used in the project:

```java
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
```

## Requirements

- **Java SDK** version 17 or higher.
- Operating system compatible with Java (Windows, macOS, Linux).

## Contribute

If you want to improve this project:
1. Fork this repository.
2. Create a new branch for your changes:
    ```bash
    git checkout -b my-new-feature
    ```
3. Commit your changes:
    ```bash
    git commit -m 'Added a new feature'
    ```
4. Push to the branch:
    ```bash
    git push origin my-new-feature
    ```
5. Create a Pull Request!

## License

This project is available under the [MIT License](LICENSE).

---

Enjoy exploring and interacting with your simple chatbot! 😊
