import lombok.Data;

@Data
public class Character {
    private int power;
    private int hp;
    private String name;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c){
        
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    public void setHp(int hp) {
        if (hp < 0){
            hp = 0;
        }
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + "{hp=" + this.hp + ", power=" + this.power + "}";
    }

}
