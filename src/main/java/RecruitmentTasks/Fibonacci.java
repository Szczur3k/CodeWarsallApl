package RecruitmentTasks;

public class Fibonacci {

    public static void printFibonacci() {
        int actualNum = 1;
        int numBefore = 0;
        int tempNum;
        for (int i = 0; i < 100; i++) {
            tempNum = actualNum + numBefore;
            numBefore = actualNum;
            actualNum = tempNum;
            System.out.println(actualNum);
        }
    }

    public static int printFibonacciRecursion(int number) {

        if (number == 1 || number == 2){
            return 1;
        }
            return printFibonacciRecursion(number - 1) + printFibonacciRecursion(number - 2);
    }

}
