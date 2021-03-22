package ReverseSentence;

public class SpinWords {

    public String spinWords(String sentence) {

        String[] wordsSplit = sentence.split(" ");
        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < wordsSplit.length; i++) {
            if (wordsSplit[i].length() >= 5) {

                char[] splitAcctualWord = wordsSplit[i].toCharArray();

                for (int j = wordsSplit[i].length() - 1; j >= 0; j--) {
                    builder.append(splitAcctualWord[j]);
                }
                if (i != wordsSplit.length - 1) {
                    builder.append(" ");
                }
            } else {
                builder.append(wordsSplit[i]);
                if (i != wordsSplit.length - 1) {
                    builder.append(" ");
                }
            }
        }
        return builder.toString();
    }
}