package RecruitmentTasks;

public class ReverseStringWithoutStringBuilder {

    public static String reverseString(String word) {
        String[] splittedWord = word.split("");
        String reverseWord = "";

        for (int i = splittedWord.length - 1; i >= 0; i--) {
            reverseWord = reverseWord + splittedWord[i];
        }

        return reverseWord;
    }

}
