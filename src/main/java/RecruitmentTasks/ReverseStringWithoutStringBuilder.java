package RecruitmentTasks;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStringWithoutStringBuilder {

    public static String reverseString(String word) {
        String[] splittedWord = word.split("");
        String reverseWord = "";

        for (int i = splittedWord.length - 1; i >= 0; i--) {
            reverseWord = reverseWord + splittedWord[i];
        }

        return reverseWord;
    }

    public static String reverseStringWithArray(String word) {
        String[] splittedWord = word.split("");
        String[] reverseWord = new String[word.length()];
        int indexOfReverseWord = 0;

        for (int i = splittedWord.length - 1; i >= 0; i--) {
            reverseWord[indexOfReverseWord] = splittedWord[i];
            indexOfReverseWord++;
        }

        return String.join("", reverseWord);
    }

}
