package game;

public class Game {

    String word;

     public Game() {
        WordChooser wChooser = new WordChooser();
        word = wChooser.getRandomWordFromDictionary();
     }

     Integer attempts = 10;
     public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
     
    //  final ArrayList<String> DICTIONARY = new ArrayList<String>();
    //  DICTIONARY.add("MAKERS");
    //  DICTIONARY.add("CANDIES");
    //  DICTIONARY.add("DEVELOPERS");
    //  DICTIONARY.add("LONDON");

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

    // getRandomWordFromDictionary method removed from game class and added to a separate Word Chooser class instead
    // public String getRandomWordFromDictionary() {
    //     Random rnd = new Random();
    //      return DICTIONARY[(rnd.nextInt(3))]; // should the upper limit be 4 (exclusive?) - need to use square brackets to access an element in an array by its index (using parentheses will result in an undefined method error "The method DICTIONARY(int) is undefined for the type Game")

    // }
}
