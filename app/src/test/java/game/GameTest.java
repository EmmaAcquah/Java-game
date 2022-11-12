package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
//  Testing that the method can return a matching string value when the word is hardcoded as the return value
//   @Test public void testGetsWordToGuess1() {
//     Game game = new Game();

//     assertEquals(game.getWordToGuess(), "B_____");
//   }


//  Testing that the method can return a matching string value when passed to the method as "word" parameter, without having a class constructor
//   @Test public void testGetsWordToGuess2() {
//     Game game = new Game();

//     assertEquals(game.getWordToGuess("B_____"), "B_____");
//   }

//  Testing that the method can be passed a word parameter, after adding a constructor
    // @Test public void testGetsWordToGuess() {
    //     Game game = new Game("MAKERS"); /* Note that after defining the class constructor, a parameter can be passed with the new method when initialising the object */
    //     String word = "MAKERS"; /* word cannot be resolved to a variable error if not declared here */

    //     assertEquals(game.getWordToGuess(word), word);
    // }

    //  Testing that the method can return only the first letter of the word
    @Test public void testGetsWordToGuess() {
        Game game = new Game("MAKERS"); /* Note that after defining the class constructor, a parameter can be passed with the new method when initialising the object */
        String word = "M_____"; /* word cannot be resolved to a variable error if not declared here, the word parameter is being updated */

        assertEquals(game.getWordToGuess(word), word);
    }

    // Testing that the class can hold the remaining number of attempts after adding a class attribute
    @Test public void testGetsInitialRemainingAttempts() {
        Game game = new Game("Makers");
        
        assertEquals(game.attempts, Integer.valueOf(10));
    }
}