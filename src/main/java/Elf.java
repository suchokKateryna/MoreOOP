public class Elf extends Character{

    public Elf(){
        super(10, 10);
        this.setName("Elf");
    }

    @Override
    public void kick(Character c){
        if (c.getPower() < this.getPower()){
            c.setHp(0);
        }else{
            int prev_power = c.getPower();
            c.setPower(prev_power + 1);
        }
    }   
}
