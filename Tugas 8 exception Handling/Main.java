import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=1;
        //Opening Program
        System.out.print("Selamat datang di game defend Filkom \n");
        System.out.print("Masukkan nama anda :");
        String namaPemain=scan.nextLine();
        System.out.print("Daftar Hero dalam Permainan : \n");
        System.out.print("1. Magician \n");
        System.out.print("2. Healer \n");
        System.out.print("3. Warrior \n");
        System.out.print("Masukkan pilihan anda : ");

        int pilihan = 0;
        while (pilihan != 1 && pilihan != 2 && pilihan != 3){
            try {
                pilihan = scan.nextInt();
                if (pilihan != 1 && pilihan != 2 && pilihan != 3){
                    throw new NullPointerException();
                }
            }
            catch (InputMismatchException e){
                System.out.println("Masukkan pilihan berupa angka!");
                System.out.print("Pilih karakter : ");
                scan.nextLine();
            }
            catch (NullPointerException e){
                System.out.println("Masukkan pilihan yang sesuai!");
                System.out.print("Pilih karakter: ");
                scan.nextLine();
            }
        }
        Titan titan = new Titan();
        Character figure = null;
        System.out.println("Selamat datang, "+namaPemain+ " !");

        switch (pilihan){
            case 1:{
                figure = new Magician();
                figure.info();
                break;
            }
            case 2:{
                figure = new Healer();
                ((Healer)figure).info();
                break;
            }
            case 3:{
                figure = new Warrior();
                ((Warrior)figure).info();
                break;
            }
            default:
        }

        while (titan.getHP() > 0 && figure.getHP() > 0){
            System.out.println("=========================TURN "+count+"========================");
            if (figure.attack()){
                titan.receiveDamage(figure.getAttack());
            }
            count++;
            System.out.println("Enemy's HP : "+titan.getHP());
            System.out.println(namaPemain + "'s HP : "+figure.getHP());
            if (titan.getHP() == 0)
                break;

            System.out.println("========================"+ " TURN " + count + "==============================");
            if (count % 2 == 0 && figure instanceof Healer){
                System.out.print("Menggunakan skill Heal.\n");
                ((Healer) figure).heal();
            }
            if (titan.attack() == true){
                figure.receiveDamage(titan.getAttack());
            }
            System.out.println("Enemy's HP : "+titan.getHP());
            System.out.println(namaPemain + "'s HP : "+figure.getHP());
            count++;
        }

        if (titan.getHP() <= 0){
            titan.setHP(0);
            System.out.print("-------------------------------------------------------------- \n");
            System.out.println(namaPemain + " menang");
        }
        else if (figure.getHP() <= 0){
            figure.setHP(0);
            System.out.println("----------------------------------------------------------- \n");
            System.out.println(namaPemain+" Kalah");
        }

        System.out.print("======================= PLAYER ================================\n");
        figure.info();
        System.out.println("========================= MUSUH ============================= \n");
        titan.info();

    }
}

