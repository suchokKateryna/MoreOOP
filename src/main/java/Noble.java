import java.util.Random;

public class Noble extends Character{

    private static final Random RANDOM = new Random();

    public Noble(int lower, int high){
        super(RANDOM.nextInt(high-lower) + lower, RANDOM.nextInt(high-lower) + lower);
    }

    @Override
    public void kick(Character c) { 
        int enemyPower = c.getHp();
        c.setHp(enemyPower - RANDOM.nextInt(this.getPower()));
    }

}
