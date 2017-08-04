import org.junit.Test;

import java.util.ArrayList;
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
        assertEquals(true, computerChoice instanceof String);
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
       List<String> myWords = Arrays.asList("zebra","cow");
       String computedChoice = newGame.computeChoices(myWords);
       assertEquals(true,myWords.contains(computedChoice));

    }


}
