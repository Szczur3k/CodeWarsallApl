package NotVerySecure;

public class SecureTester {
    public static boolean alphanumeric(String s){
        if (s.equals("")){
            return false;
        }
        s = s.replaceAll("[^a-zA-Z0-9]+$", " ");
        if (!s.isEmpty()){
            return s.matches("^[a-zA-Z0-9]+$");
        }
        return s.isEmpty();
    }

}
