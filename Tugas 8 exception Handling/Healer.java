import java.util.concurrent.ThreadLocalRandom;
public class Healer extends Character{
    public Healer() {
        setHP(70);
        setAttack(10);
        setDefanse(10);
    }

    @Override
    boolean attack() {
        int hitungacak = ThreadLocalRandom.current().nextInt(100);
        if(hitungacak<=85 && hitungacak>0){
            return true;
        }else {
            return false;
        }
    }
    public void heal(){
        setHP(getHP()+25);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Role    : Healer");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefanse());
    }

}
