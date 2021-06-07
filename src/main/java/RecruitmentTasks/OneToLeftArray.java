package RecruitmentTasks;

public class OneToLeftArray {

    public static int[] moveToTheLeft(int[] table){

        int firstNumber = table[0];
        for (int i = 1; i <= table.length-1; i++){
            table[i-1] = table[i];
        }
        table[table.length-1] = firstNumber;
        return table;
    }

    int x = 2;
    public static int[] moveTOTheLeft(int[] table){

        int firstNumber = table[0];
        System.arraycopy(table, 1, table, 0, table.length-1);
        table[table.length-1] = firstNumber;
        return table;
    }

}
