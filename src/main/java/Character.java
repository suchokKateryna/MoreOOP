import lombok.Data;

@Data
public class Character {
    int power;
    int hp;
    String name;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c){
        
    }

    public boolean isAlive(){
        return this.hp >0;
    }
}
