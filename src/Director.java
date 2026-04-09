public class Director extends Person {
    int numberOfShows;
    public Director (int numberOfShows, String name, String surname, String gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}
