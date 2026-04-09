public class Actor extends Person {
    private int heigh;
    public Actor (int heigh, String name, String surname, String gender) {
        super(name, surname, gender);
        this.heigh = heigh;
    }
    @Override
    public void printInfo () {
        System.out.println(this.getName() + " " + this.getSurname() + " (" + heigh + ")");
    }
}
