import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();
    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }
    public void printActors() {
        for (Actor actor : listOfActors) {
            actor.printInfo();
        }
    }
    public void addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер уже есть в списке");
            return;
        }
        listOfActors.add(actor);
    }
    public void replaceActor (Actor firstActor, Actor secondActor) {
        System.out.println("Этого актера нет в списке");
        int i = 0;
        for (Actor actor : listOfActors) {
            if (actor.equals(firstActor)) {
                listOfActors.remove(i);
                listOfActors.add(secondActor);
            }
            i++;
        }
    }
    public void printDirectorInfo () {
        director.printInfo();
    }
}
