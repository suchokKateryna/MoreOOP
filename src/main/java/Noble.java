import java.util.Random;

public class Noble extends Characterr{

    private static final Random RANDOM = new Random();

    public Noble(int lower, int high) {
        super(RANDOM.nextInt(high-lower) + lower, RANDOM.nextInt(high-lower) + lower, new NobleKick());
    }

}
