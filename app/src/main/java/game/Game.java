package game;

public class Game {
     public Game(String word) {
        
     }

    public static void main(String[] args) {
        // Game game1 = new Game("Test");

    }

    public String getWordToGuess(String word) {
        StringBuilder sBuilder = new StringBuilder(word);

        for (int i = 1; i < word.length(); i++) { /* Using index 1 as starting position instead of 0 to exclude first character */
            sBuilder.replace(i, word.length(), "_");
        }

        return sBuilder.toString(); /* Need to convert to a string to avoid a type mismatch error with StringBuilder type */
    }
}
