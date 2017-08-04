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
    public void checkLetter_returnsStringWithGuessedWordReplaced_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("z");
        assertEquals("z____",checkedWord);
    }
    @Test
    public void checkLetter_returnsStringWithGuessedWordReplacedAndWithProgress_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        newGame.mProgress = "_e___";
        String checkedWord = newGame.checkLetter("z");
        assertEquals("ze___",checkedWord);
    }
    @Test
    public void checkLetter_returnsStringWithGuessedWordReplacedWithoutProgress_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("z");
        assertEquals("z____",checkedWord);
    }
    @Test
    public void checkLetter_returnsPreviousOutputForMissingLetter_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("c");
        assertEquals("_____",checkedWord);
    }
    @Test
    public void checkLetter_returnsPreviousOutputForWhenGivenMoreThanOneLetter_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("ze");
        assertEquals("_____",checkedWord);
    }
    @Test
    public void checkLetter_returnsPreviousOutputForNonAlphabetCharacters_String(){
        Game newGame = new Game();
        newGame.mWord = "zebra";
        String checkedWord = newGame.checkLetter("7");
        assertEquals("_____",checkedWord);
    }
    @Test
    public void checkLetter_replacesAllInstancesOfLetter_String(){
        Game newGame = new Game();
        newGame.mWord = "abracadabra";
        String checkedWord = newGame.checkLetter("a");
        assertEquals("a__a_a_a__a",checkedWord);
    }
}
