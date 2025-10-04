import java.util.Random;

public class NobleKick extends KickStrategy{

    private static final Random RANDOM = new Random();

    @Override
    public void kick(Characterr c, Characterr enemy) { 
        int enemyPower = enemy.getHp();
        enemy.setHp(enemyPower - RANDOM.nextInt(c.getPower()));
    }

}
