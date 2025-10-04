public class Hobbit extends Character{
    public Hobbit(){
        super(0, 3);
        this.setName("Hobbit");
    }

    @Override
    public void kick(Character c){
        System.out.println("Hobbit is crying!");
    }


}
