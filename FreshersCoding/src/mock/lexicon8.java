package mock;

import java.util.Scanner;

//Custom exception class
@SuppressWarnings("serial")
class InvalidGuessException extends Exception {
 public InvalidGuessException(String message) {
     super(message);
 }
}

//WordMaster class
class WordMaster {

 // Method to validate the guess and calculate the score
 public int AcceptGuess(String secretWord, String codedWord) throws InvalidGuessException {
     // Ensure the secret word is not empty
     if (secretWord == null || secretWord.isEmpty()) {
         throw new IllegalArgumentException("Secret word cannot be empty");
     }

     // Get the first and last letter of the secret word
     char firstLetter = secretWord.charAt(0);
     char lastLetter = secretWord.charAt(secretWord.length() - 1);

     // Reverse alphabetical order position of the first letter (1-26)
     int reverseAlphaPos = 26 - (Character.toLowerCase(firstLetter) - 'a');
     // Alphabetical order position of the first letter (1-26)
     int alphaPos = Character.toLowerCase(firstLetter) - 'a' + 1;

     // Length of the secret word
     int wordLength = secretWord.length();

     // Construct the expected coded word
     String expectedCodedWord = "" + reverseAlphaPos + alphaPos + wordLength + Character.toLowerCase(lastLetter);

     // Check if the provided coded word matches the expected coded word
     if (codedWord.equals(expectedCodedWord)) {
         // If it matches, return the length of the secret word
         return wordLength;
     } else {
         // If the coded word does not match, throw an InvalidGuessException
         throw new InvalidGuessException("Incorrect guess. Try again");
     }
 }
}

public class lexicon8 {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Get the secret word from the user
         System.out.print("Enter the secret word:\n");
         String secretWord = scanner.nextLine();

         // Get the coded word from the user
         System.out.print("Enter the coded word for the secret word:\n");
         String codedWord = scanner.nextLine();

         // Create an instance of WordMaster
         WordMaster wordMaster = new WordMaster();

         // Call AcceptGuess method to validate the guess and get the score
         int result = wordMaster.AcceptGuess(secretWord, codedWord);

         // Calculate the magical points
         int magicalPoints = result * 10;

         // Output the success message
         System.out.println("Hurray! You've guessed right, You are earning " + magicalPoints + " magical points!");

     } catch (InvalidGuessException ex) {
         // Catch the InvalidGuessException and print the message
         System.out.println(ex.getMessage());
     } catch (IllegalArgumentException ex) {
         // Catch any invalid input errors (such as empty secret word)
         System.out.println(ex.getMessage());
     } finally {
         scanner.close(); // Close the scanner to prevent resource leak
     }
 }
}

//question 8:
//
//In the mystical realm of Enchanted Lexicon, brave adventurers seek to unlock the ancient secrets
//
//hidden within the magical words guarded by the Wordkeeper.
//
//Once such adventurer, Josh, embarks on a quest to decipher the mystical code of the Wordkeeper
//
//and unlock the profound wisdom concealed within.
//
//Assist Josh with your C# skills to code the secret word.
//
//Functionalities:
//
//In the class WordMaster, implement the below specified method:
//
//public int AcceptGuess(string secretWord, string codedWord):
//
//This method accepts the adventurer's attempt to decipher the coded word and reveals its true form
//
//(The first letter of the secret word must be capitalized and the last letter should be small).
//
//This method returns the length of the secret word, representing the adventurer's progress in
//
//uncovering the hidden knowledge.
//
//If the coded word is not guessed correctly, then throw a user-defined exception called
//
//InvalidGuessException with the message "Incorrect guess. Try again".
//
//Note:
//
//- The Exception object itself should display this message.
//
//- To do this, A class InvalidGuessException that inherits from the Exception class.
//
//- In the Program class, write the Main method and test the AcceptGuess method.
//
//- If it returns an integer value that represents the total length in the secret word, then display
//
//"Hurray! You've guessed right, You are earning <Result> magical points!".
//
//- The result is the multiple of 10 and the number of letters in the secret word.
//
//- Use a catch block to handle the exception that is returned by the AcceptGuess method. In the catch
//
//block, display the exception message.
//
//- Output is Case-sensitive.
//
//Sample Input 1:
//
//Enter the secret word:
//
//Word Game
//
//Enter the coded word for the secret word:
//
//4239e
//
//Sample Output 1:
//
//Hurray! You've guessed right, You are earning 90 magical points!
//
//Explanation:
//
//4 - The position of the first letter of the secret word in reverse Alphabetical order.
//
//23 - The position of the first letter of the secret word in Alphabetical order.
//
//9 - Total number of letters in the secret word (including spaces).
//
//e - Last letter of the secret word (Case-sensitive).