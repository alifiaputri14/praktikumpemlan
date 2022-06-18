public abstract class Character {
    private int defanse;
    private int attack;
    private int HP;


    //setter getter

    public int getDefanse() {
        return defanse;
    }

    public void setDefanse(int defanse) {
        this.defanse = defanse;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    //fungsi

    abstract boolean attack();

    public void receiveDamage(int damage){
        if(damage>getDefanse()){

            int pengurangan=damage-getDefanse();
            setHP(getHP()-pengurangan);

        }
        if(HP<=0){
            setHP(0);
        }
    }
    public void info(){
        System.out.println("---------- STATUS ----------");
    }
}
