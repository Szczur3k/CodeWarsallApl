package NumberFun;

public class NumberFun {
    public static long findNextSquare(Long sq){

        double sqrt = Math.sqrt(sq);
        if (sqrt!=Math.floor(sqrt)){
            return -1;
        }

        long anotherNumber = (long) Math.sqrt(sq) + 1;
        return anotherNumber * anotherNumber;
    }
}
