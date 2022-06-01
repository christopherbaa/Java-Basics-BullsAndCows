
public class Game {
    private final String number;
    private final Grader grader;

    public Game() {
        this.number = String.valueOf(NumberGenerator.generateNumber());
        this.grader = new Grader();
    }

    public String getNumber() {
        return number;
    }

    public Grader getGrader() {
        return grader;
    }
}
