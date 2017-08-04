import java.util.*;

/**
 * Created by kingkong on 8/3/17.
 */
public class Game {
//    variables
    public String mWord;
    public String mProgress;

    String computeChoices(List<String> setWords){
        //selects a random word from a given array
        Random newRandomGenerator = new Random();
        int wordIndex = newRandomGenerator.nextInt(setWords.size());
        return setWords.get(wordIndex);
    }
    String checkLetter(String myGuess){
        //monitors progress and checks guess against the word in play
        String[] myLetters = mWord.split("");
        StringBuilder result = new StringBuilder();
        String[] myProgress;

        //Initialize progress if not present
        if(mProgress!=null){
            myProgress = mProgress.split("");
        }else{
            String[] wordLetters = mWord.split("");
            StringBuilder toSplit = new StringBuilder();
            for(int j=0;j<wordLetters.length;j++){
                toSplit.append("_");
            }
            myProgress = (toSplit.toString()).split("");
        }

        //check the guess and replace
        for(int i=0;i<myLetters.length;i++){
            if((myProgress[i]).equals("_")){
                if((myLetters[i]).equals(myGuess)){
                    result.append(myGuess);
                }else{
                    result.append("_");
                }
            }else{
                result.append(myProgress[i]);
            }
        }
        mProgress=result.toString();
        return mProgress;
    }
}
