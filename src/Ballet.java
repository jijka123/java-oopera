public class Ballet extends MusicalShow{
    private Choreographer choreographer;
    public Ballet (Choreographer choreographer, String musicAuthor, String librettoText, String title, int duration, Director director) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;

    }
}
