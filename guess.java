import javax.swing.*;

public class guess {
    public static void main(String[] args) {
        String inputCorrect;
        int correct;
        // User 1 sets the correct value
        inputCorrect = JOptionPane.showInputDialog(null, "User 1, enter the correct value:");
        correct = Integer.parseInt(inputCorrect);

        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            // User 2 makes a guess
            String inputGuess;
            int guess;
            inputGuess = JOptionPane.showInputDialog(null, "User 2, guess attempt " + i + ":");
            guess = Integer.parseInt(inputGuess);

            // Evaluate if guess is correct or not
            if (guess == correct) {
                JOptionPane.showMessageDialog(null, "Correct! You win!");
                return; // end program if guessed correctly
            } 
            else if (guess > correct) {
                JOptionPane.showMessageDialog(null, "Too high!");
            } 
            else {
                JOptionPane.showMessageDialog(null, "Too low!");
            }
        }
        // If all attempts are used and no correct guess
        JOptionPane.showMessageDialog(null, "Sorry, out of attempts!");
    }
}
