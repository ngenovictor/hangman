import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kingkong on 8/3/17.
 */
public class HangmanTest {
    @Test
    public void computeChoices_atLeastReturnsAString_String(){
        //nameOfMethodWeAreTesting_descriptionOfBehavior_expectedReturnValue()
        //check if class Game exists
        Game testGame = new Game();
        List<String> myWord = Arrays.asList("zebra");
        String computerChoice = testGame.computeChoices(myWord);
        assertEquals(true, computerChoice!=null);
    }
    @Test
    public void computeChoices_GivenOneArrayListReturnsContent_String(){
        Game newGame = new Game();
        List<String> myWord = Arrays.asList("zebra");
        String computedChoice= newGame.computeChoices(myWord);
        assertEquals("zebra", computedChoice);
    }
    @Test
    public void computeChoices_GivenLongStringArrayReturnsAnyOfTheWords_String(){
        Game newGame = new Game();
        List<String> myWords = Arrays.asList("zebra","cow","committee","animals");
        String computedChoice = newGame.computeChoices(myWords);
        assertEquals(true,myWords.contains(computedChoice));
    }
    @Test
    public void checkLetter_ReturnsAString_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String myLetter = "z";
        String checkedWord = newGame.checkLetter(myLetter);
        assertEquals(true, checkedWord!=null);
    }
    @Test
    public void checkLetterReturnsSameSizeString_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String myLetter = "z";
        String checkedWord = newGame.checkLetter(myLetter);
        assertEquals(newGame.mWord.length(), checkedWord.length());
    }
    @Test
    public void checkLetter_returnsStringWithDashesEqualToStringSize_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("");
        assertEquals("_____",checkedWord);
    }
    @Test
    public void checkLetter_returnsStringWithGuessedWordReplaced(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("z");
        assertEquals("z____",checkedWord);
    }
}
