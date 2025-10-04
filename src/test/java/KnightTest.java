
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnightTest {
    private Characterr character;

    @BeforeEach
    public void init() {
        character = new Knight();
    }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof Characterr);
    }

    @Test
    public void testHp() {
        assertTrue(character.getHp() >= 2 && character.getHp() <= 12);
    }

    @Test
    public void testPower() {
        assertTrue(character.getPower() >= 2 && character.getPower() <= 12);
    }
}