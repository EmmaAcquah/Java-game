package game;

import java.util.Random;

public class WordChooser {
    
    public static void main(String[] args) {
        
    }

    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    
    public String getRandomWordFromDictionary() {

        Random rnd = new Random();
        return DICTIONARY[(rnd.nextInt(3))];

    }
}
