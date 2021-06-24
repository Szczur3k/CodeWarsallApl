package ReversedWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        Collections.reverse(list);
        return Arrays.stream(list.toArray())
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}

