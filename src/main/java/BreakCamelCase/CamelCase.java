package BreakCamelCase;

public class CamelCase {

    public static String breakCamelCase(String input) {
        String[] splittedInput = input.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (String split : splittedInput) {
            if(split.equals(split.toUpperCase()) && stringBuilder.length()!=0){
                stringBuilder.append(" ").append(split);
            } else {
                stringBuilder.append(split);
            }
        }

        return stringBuilder.toString();
    }
}