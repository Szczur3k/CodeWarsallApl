package DuplicateCount;

import java.util.*;

public class DuplicateCount {
    public static int duplicateCount(String text) {

        List<String> split = Arrays.asList(text.toLowerCase(Locale.ROOT).split(""));
        HashSet<Object> objectHashSet = new HashSet<>();

        for (int i=0; i<split.size(); i++){
            String actualString = split.get(i);
            for (int j=i+1; j<split.size(); j++){
                if (actualString.equals(split.get(j))){
                    objectHashSet.add(actualString);
                }
            }
        }

        return objectHashSet.size();

    }
}