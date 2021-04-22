package Scramblies;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        String[] splittedStr1 = str1.split("");
        String[] splittedStr2 = str2.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : splittedStr2) {
            for (int j = 0; j < splittedStr1.length; j++) {
                if (splittedStr1[j].equals(s)) {
                    stringBuilder.append(splittedStr1[j]);
                    splittedStr1[j] = "";
                    break;
                }
            }
        }
        return stringBuilder.toString().equals(str2);
    }
}