package SumOfIntervals;

public class Interval {

    public static int sumIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int column = intervals[0].length;
        int row = intervals.length;
        int sumOfIntervals = 0;

        for (int k = 0; k < row; k++) {
            int actualCheck1 = intervals[k][1];
            int actualCheck0 = intervals[k][0];
            if (actualCheck0 == 0 && actualCheck1 == 0) continue;
            for (int m = 0; m < row; m++) {
                if (!(actualCheck0 == intervals[m][0] && actualCheck1 == intervals[m][1]) && (intervals[m][0] != 0 && intervals[m][1] != 0)) {
                    if (actualCheck1 > intervals[m][0] && actualCheck1 < intervals[m][1] ||
                            actualCheck1 > intervals[m][0] && actualCheck0 < intervals[m][1]) {
                        // merge interval k0/k1 with m0/m1
                        if (intervals[k][0] < intervals[m][0]) {
                            intervals[m][0] = intervals[k][0];
                        }
                        if (intervals[k][1] > intervals[m][1]) {
                            intervals[m][1] = intervals[k][1];
                        }
                        //beacuse i cant delete a row from two dimensional Array i just put it 0 to both
                        intervals[k][0] = 0;
                        intervals[k][1] = 0;
                        actualCheck0 = 0;
                        actualCheck1 = 0;
                    }
                }
            }
        }

        for (int[] interval : intervals) {
            for (int j = 1; j < column; j++) {
                sumOfIntervals += interval[j] - interval[j - 1];
            }
        }

        return sumOfIntervals;
    }
}