import java.util.Random;

public class CharacterFactory {
    
    private static final Random RANDOM = new Random();

    int choice = RANDOM.nextInt(4);

    public Character createCharacter(){
        switch(choice){
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return null;
        }
    }


}
