package FindTheOddInt;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {

        if (a.length > 1) {
            Arrays.sort(a);
            int count = 1;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] == a[i + 1]) {
                    count++;
                }
                if (a[i] != a[i + 1] && count % 2 == 1 && count > 2) {
                    return a[i];
                }
                if (a[i] != a[i + 1]) {
                    if (count == 1) {
                        return a[i];
                    }
                    count = 1;
                }
            }
            return a[a.length-1];
        }
        if (a.length==1){
            return a[0];
        }
        return 0;
    }
}