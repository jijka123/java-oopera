public class Opera extends MusicalShow{
    private int choirSize;
    public Opera (int choirSize, String musicAuthor, String librettoText, String title, int duration, Director director) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choirSize = choirSize;
    }
}
