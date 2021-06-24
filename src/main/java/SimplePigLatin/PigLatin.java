package SimplePigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {

        //First approach without knowing regex
        String[] splitString = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : splitString) {
            if (word.matches("[a-zA-Z]+")) {
                stringBuilder.append(word, 1, word.length()).append(word.charAt(0)).append("ay").append(" ");
            }
            else {
                stringBuilder.append(word).append(" ");
            }
        }

        if (stringBuilder.substring(stringBuilder.length() - 1).isBlank()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public static String pigItWithMap(String str){
        return Arrays.stream(str.trim().split(" "))
                        .map(s -> s.matches("[a-zA-Z]+") ? s.substring(1).concat(s.substring(0, 1).concat("ay")) : s)
                        .collect(Collectors.joining(" "));
    }
}

