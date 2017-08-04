import java.util.*;

/**
 * Created by kingkong on 8/3/17.
 */
public class Game {
    public String mWord;
    public String mProgress;
    String computeChoices(List<String> setWords){
        Random newRandomGenerator = new Random();
        int wordIndex = newRandomGenerator.nextInt(setWords.size());
        return setWords.get(wordIndex);
    }
    String checkLetter(String myGuess){

        String[] myLetters = mWord.split("");

        StringBuilder result = new StringBuilder();

        for(int i=0;i<myLetters.length;i++){
            if((myLetters[i]).equals(myGuess)){
                result.append(myGuess);
            }else{
                result.append("_");
            }
        }
        return result.toString();
    }
}
