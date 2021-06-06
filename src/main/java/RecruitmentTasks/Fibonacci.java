package RecruitmentTasks;

public class Fibonacci {

    private static void printFibonacci() {
        int actualNum = 1;
        int numBefore = 0;
        int tempNum = 0;
        for (int i = 0; i < 100; i++) {
            tempNum = actualNum + numBefore;
            numBefore = actualNum;
            actualNum = tempNum;
            System.out.println(actualNum);
        }
    }

}
