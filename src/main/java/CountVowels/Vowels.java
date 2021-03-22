package CountVowels;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;

        char[] tableOfStr = str.toCharArray();

        String vowels = "aeiouy";
        char[] tableOfChars = vowels.toCharArray();

        for (char charInString : tableOfStr) {
            for (char vowel : tableOfChars) {
                if (charInString == vowel) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }
}
