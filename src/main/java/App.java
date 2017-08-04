import java.io.Console;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kingkong on 8/4/17.
 */
public class App {

    public static void main(String[] args){
        Console myConsole = System.console();

        List<String> myWords = Arrays.asList("zebra","cow","committee","animals");
        Game myGame = new Game();
        myGame.computeChoices(myWords);



        System.out.println("Hey welcome to the Hangman's game");
        System.out.println("Guess the letters that are missing to fill the following dashes:");

        while (!myGame.mWord.equals(myGame.mProgress)){
            System.out.println(myGame.mProgress);
            String myGuess = myConsole.readLine();
            myGame.checkLetter(myGuess);
        }
        System.out.println("Kudos you are still Alive");
    }
}
