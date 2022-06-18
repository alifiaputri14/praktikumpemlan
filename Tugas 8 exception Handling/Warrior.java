import java.util.concurrent.ThreadLocalRandom;
public class Warrior extends Character{
    public Warrior() {
        setHP(80);
        setAttack(25);
        setDefanse(30);
    }

    @Override
    boolean attack() {
        int hitungacak = ThreadLocalRandom.current().nextInt(100);
        if(hitungacak<=60 && hitungacak>0){
            return true;

        }else {
            return false;}
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Role    : Warrior");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefanse());
    }
}
