import java.util.*;

/**
 * Created by kingkong on 8/3/17.
 */
public class Game {
    String computeChoices(List<String> setWords){
        Random newRandomGenerator = new Random();
        int wordIndex = newRandomGenerator.nextInt(setWords.size());
        return setWords.get(wordIndex);
    }
    String checkLetter(String myWord,String myGuess){
        String[] myLetters = myWord.split("");
        String result = "";
        for(int i=0;i<myLetters.length;i++){
            result+="_";
        }
        return result;
    }
}
