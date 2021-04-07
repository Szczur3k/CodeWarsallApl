package HighestScoringWord;

import java.util.LinkedHashMap;
import java.util.Map;

public class HighestScoringWord {

    public static String hight(String s) {


        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Map<String, Integer> pointsOfWords = new LinkedHashMap<>();
        String[] splittedString = s.split(" ");

        Map<String, Integer> pointsOfWordss = givePointsOfTheWord(alphabet, splittedString, pointsOfWords);
        return showHighestPointsWord(pointsOfWordss);
    }

    private static Map<String, Integer> givePointsOfTheWord(String[] alphabet, String[] splittedString, Map<String, Integer> pointsOfWords) {
        int counter = 0;
        int sumOfWord = 0;
        for (int i = 0; i <= splittedString.length - 1; i++) {
            String[] charsInWord = splittedString[i].split("");
            for (int j = 0; j <= charsInWord.length - 1; j++) {
                for (String letter : alphabet) {
                    counter++;
                    if (letter.equals(charsInWord[j])) {
                        sumOfWord += counter;
                        break;
                    }
                }
                counter = 0;
            }
            pointsOfWords.put(splittedString[i], sumOfWord);
            sumOfWord = 0;
        }

        return pointsOfWords;
    }


    private static String showHighestPointsWord(Map<String, Integer> pointsOfWords) {
        int maxValueWord = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : pointsOfWords.entrySet()) {
            if (maxValueWord == 0 || maxValueWord < entry.getValue()) {
                maxValueWord = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        return maxWord;
    }
}


/*
    Given a string of words, you need to find the highest scoring word.
        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
        You need to return the highest scoring word as a string.
        If two words score the same, return the word that appears earliest in the original string.
        All letters will be lowercase and all inputs will be valid.
*/