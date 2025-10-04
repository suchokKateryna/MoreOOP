public class ElfKick extends KickStrategy{

    @Override
    public void kick(Characterr c, Characterr enemy){
        if (enemy.getPower() < c.getPower()){
            enemy.setHp(0);
        }else{
            int prev_power = enemy.getPower();
            enemy.setPower(prev_power + 1);
        }
    } 

}
