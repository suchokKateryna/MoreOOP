public class Elf extends Character{

    public Elf(){
        super(10, 10);
        this.name = "Elf";
    }

    @Override
    public void kick(Character c){
        if (c.power < this.power){
            c.hp = 0;
        }else{
            c.power += 1;
        }
    }   
}
