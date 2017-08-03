import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by kingkong on 8/3/17.
 */
public class HangmanTest {
    @Test
    public void computeChoices_atleastReturnsAString_String(){
        //nameOfMethodWeAreTesting_descriptionOfBehavior_expectedReturnValue()
        //check if class Game exists
        Game testGame = new Game();
        String[] myWord = {"zebra"};
        String computerChoice = testGame.computeChoices(myWord);
        assertEquals(true, computerChoice instanceof String);
    }
    @Test
    public void computeChoices_GivenArrayListReturnsContent_String(){
        Game newGame = new Game();
        String[] myWord = {"zebra"};
        String computedChoice= newGame.computeChoices(myWord);
        assertEquals("zebra", computedChoice);
        assertEquals("zebra", computedChoice);
    }
//    @Test
//    public void computeChoices_Given(){
//       Game newGame = new Game();
//       String[] myWord = {"zebra", "cow"};
//       String computedChoice = newGame.computeChoices(myWord);
//       assertThat(computedChoice,is(equalTo("zebra") || equalTo("cow")));
//    }


}
