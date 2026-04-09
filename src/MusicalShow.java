public class MusicalShow extends Show{
    String musicAuthor;
    String librettoText;

    public MusicalShow(String musicAuthor, String librettoText, String title, int duration, Director director) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    public void printLibretto() {
        System.out.println(librettoText);
    }

}
