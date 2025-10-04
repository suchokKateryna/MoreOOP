public class GameManager {

    public static void fight(Characterr c1, Characterr c2){
        while(c1.getHp() > 0 && c2.getHp() > 0){
            c1.kick(c2);
            c2.kick(c1);
        }
        if(c1.getHp() <= 0 && c2.getHp() <= 0){
            System.out.println("It's a draw!");
        } else if(c1.getHp() <= 0){
            System.out.println("Character " + c2.getName() + " wins!");
        } else {
            System.out.println("Character " + c1.getName() + " wins!");
        }
    }

}
