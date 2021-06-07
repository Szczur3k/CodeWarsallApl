package RecruitmentTasks.Zoo;

public class Zyrafa implements Animal{

    final private String name = "Girrafe";
    int age;
    int cage;

    public Zyrafa(int age, int cage) {
        this.age = age;
        this.cage = cage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String somethingToDo() {
        return eat();
    }

    public String eat(){
        return "Girrafe is eating right now";
    }
}
