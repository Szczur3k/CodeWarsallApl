package CheckIfTriangle;

public class Triangle {

    public static boolean isTriangle(int a, int b, int c) {

        if (a > 0 && b > 0 && c > 0) {
            return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
        }
        return true;
    }
}