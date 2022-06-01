import java.util.Random;

public class NumberGenerator {
    private static final int MIN = 1000;
    private static final int MAX = (int) Math.pow(10, 4);

    private NumberGenerator() {
    }

    public static int generateNumber() {
        Random rand = new Random();
        return rand.ints(MIN, MAX).findFirst().getAsInt();
    }
}
