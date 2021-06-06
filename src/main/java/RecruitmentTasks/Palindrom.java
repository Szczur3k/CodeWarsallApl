package RecruitmentTasks;

public class Palindrom {

    public static boolean checkIfPalindrom(String text) {
        text = text.toLowerCase();
        StringBuilder strB = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            strB.append(text.charAt(i));
        }

        return text.contentEquals(strB);
    }
}
