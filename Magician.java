import java.util.concurrent.ThreadLocalRandom;
public class Magician extends Character{
    public Magician() {
        setHP(100);
        setAttack(60);
        setDefanse(10);


    }
    @Override
    public void info() {
        super.info();
        System.out.println("Role    : Magician");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefanse());

    }

    @Override
    boolean attack() {
        int hitungacak = ThreadLocalRandom.current().nextInt(1000);
        if(hitungacak<=35 && hitungacak>0){
            return true;
        }else{
            return false;
        }
    }
}
