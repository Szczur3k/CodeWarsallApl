package RecruitmentTasks.Zoo;

public class childGiraffe extends Zyrafa {

    String nameOfChildGiraffe;

    public childGiraffe(int age, int cage, String nameOfChildGiraffe) {
        super(age, cage);
        this.nameOfChildGiraffe = nameOfChildGiraffe;
    }

    @Override
    public String somethingToDo() {
        return super.somethingToDo();
    }

    @Override
    public String eat() {
        return "Eating leaf";
    }
}
