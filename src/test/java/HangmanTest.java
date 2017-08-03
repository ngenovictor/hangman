import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by kingkong on 8/3/17.
 */
public class HangmanTest {
    @Test
    public void getSomething_returnsSomething_(){
//        check if class Game exists
        Game testGame = new Game();
        String computerChoice = testGame.computeChoices();
        assertEquals(true, computerChoice instanceof String);
    }
}
