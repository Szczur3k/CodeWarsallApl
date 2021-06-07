package RecruitmentTasks.Zoo;

public class Goryl implements Animal {

    final private String name = "Gorilla";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String somethingToDo() {
        return scratch();
    }

    public String scratch(){
        return "Gorrlia is scratching right now";
    }

}
