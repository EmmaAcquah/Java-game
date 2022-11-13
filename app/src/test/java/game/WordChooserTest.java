package game;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class WordChooserTest {
        // Testing the presence of an attribute within a class (has)
        // Unit tests shuould test behaviour rather than state
        @Test public void testShouldGetARandomWordFromDictionary() {
            WordChooser wordChooser = new WordChooser();
            // assertThat(wordChooser, hasProperty("DICTIONARY")); //hasProperty isn't a valid matcher in Junit - requires importing a library
            String[] MOCK_DITIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

            assertTrue(Arrays.asList(MOCK_DITIONARY).contains(wordChooser.getRandomWordFromDictionary()));
        
        }
    
}
