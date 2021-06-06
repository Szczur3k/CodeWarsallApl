package RecruitmentTasks;

import java.util.HashMap;
import java.util.Map;

public class KeyboardPhone implements VersionOfKeyboard {

    private final Map<String, String> mapOfKeysPhone = versionOfKeyboard();

    @Override
    public Map<String, String> versionOfKeyboard() {
        return new HashMap<>() {{
            put("A", "2");
            put("B", "22");
            put("C", "222");
            put("D", "3");
            put("E", "33");
            put("F", "333");
            put("G", "4");
            put("H", "44");
            put("I", "444");
            put("J", "5");
            put("K", "55");
            put("L", "555");
            put("M", "6");
            put("N", "66");
            put("O", "666");
            put("P", "7");
            put("Q", "77");
            put("R", "777");
            put("S", "7777");
            put("T", "8");
            put("U", "88");
            put("V", "888");
            put("W", "9");
            put("X", "99");
            put("Y", "999");
            put("Z", "9999");
        }};
    }

    public String changeWordToOldKeyboard(String word) {
        StringBuilder str = new StringBuilder();
        String[] splittedWord = word.toUpperCase().split("");
        for (int i = 0; i < word.length(); i++) {
            str.append(mapOfKeysPhone.getOrDefault(splittedWord[i], ""));

        }
        return str.toString();
    }
}
