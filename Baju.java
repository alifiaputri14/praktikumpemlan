import java.util.*;
public class Baju {
    String Jenis_Baju;
    int Total;
    double Harga_baju;
    int jumlah;
    Scanner input=new Scanner(System.in);

    final double bajua= 100000;
    final double bajub= 125000;
    final double bajuc= 175000;

    static void tampilan(){
        System.out.println("Baju yang tersedia:");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
    }
    void harga(){
        if(Jenis_Baju.equalsIgnoreCase("A")|| Jenis_Baju.equalsIgnoreCase("a")){
            Harga_baju=bajua;
            if (jumlah<=100) {
                System.out.println("Harga per buah        : "+(int)(bajua));
            }else if(jumlah>100){
                double diskon=5000;
                System.out.println("Harga per buah        : "+(int)(bajua-diskon));
            }
        }if (Jenis_Baju.equalsIgnoreCase("B") || Jenis_Baju.equalsIgnoreCase("b") ) {
            Harga_baju=bajub;
            if (jumlah<=100) {
                System.out.println("Harga per buah        : "+(int)(bajub));
            }else if(jumlah>100){
                double diskon=5000;
                System.out.println("Harga per buah        : "+(int)(bajub-diskon));
            }
        }if (Jenis_Baju.equalsIgnoreCase("C") || Jenis_Baju.equalsIgnoreCase("c")) {
            Harga_baju=bajuc;
            if (jumlah<=100) {
                System.out.println("Harga per buah        : "+(int)(bajuc));
            }else if(jumlah>100){
                double diskon=15000;
                System.out.println("Harga per buah        : "+(int)(bajuc-diskon));
            }

        }
    }
    void menghitung(int jumlah){
        if(Jenis_Baju.equalsIgnoreCase("A") || Jenis_Baju.equalsIgnoreCase("a")){
            Harga_baju=bajua;
            if (jumlah<=100) {
                Total=(int)(Harga_baju*jumlah);


                System.out.println("Total harga           : " + Total);
            }else if(jumlah>100){
                double diskon=5000;
                Total=(int)((Harga_baju-diskon)*jumlah);
                System.out.println("Total harga           : " + Total);
            }
        }if (Jenis_Baju.equalsIgnoreCase("B") || Jenis_Baju.equalsIgnoreCase("b")) {
            Harga_baju=bajub;
            if (jumlah<=100) {
                Total=(int)(Harga_baju*jumlah);
                System.out.println("Total harga           : " + Total);
            }else if(jumlah>100){
                double diskon=5000;
                Total=(int)((Harga_baju-diskon)*jumlah);
                System.out.println("Total harga           : " + Total);
            }
        }if (Jenis_Baju.equalsIgnoreCase("C") || Jenis_Baju.equalsIgnoreCase("c")) {
            Harga_baju=bajuc;
            if (jumlah<=100) {
                Total=(int)(Harga_baju*jumlah);
                System.out.println("Total harga           : " + Total);
            }else if(jumlah>100){
                double diskon=15000;
                Total=(int)((Harga_baju-diskon)*jumlah);
                System.out.println("Total harga           : " + Total);
            }

        }
    }
    void hasil(){

    }
    void memilih_tipe(String Jenis_Baju){

        switch(Jenis_Baju.toLowerCase()){

            case "A":{
                jumlah=input.nextInt();

                break;

            }
            case "B":{
                jumlah=input.nextInt();
                System.out.println(Jenis_Baju);
                break;
            }
            case "C":{
                jumlah=input.nextInt();
                System.out.println(Jenis_Baju);
                break;
            }
        }
        switch(Jenis_Baju.toUpperCase()){

            case "A":{
                jumlah=input.nextInt();

                break;

            }
            case "B":{
                jumlah=input.nextInt();
                System.out.println(Jenis_Baju);
                break;
            }
            case "C":{
                jumlah=input.nextInt();
                System.out.println(Jenis_Baju);
                break;
            }
        }
    }


}

