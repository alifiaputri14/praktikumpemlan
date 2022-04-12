//nama: Alifia Putri Budiyanti
//kelas: TI-B
//judul: Toko Baju

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Baju.tampilan();
        //instansiasi
        Baju tokobaju=new Baju();
        //input
        Scanner input=new Scanner(System.in);



        System.out.print("Baju yang akan anda beli bertipe : ");
        tokobaju.Jenis_Baju=input.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        tokobaju.jumlah=input.nextInt();

        System.out.println("Jenis  yang anda beli : "+tokobaju.Jenis_Baju);
        tokobaju.harga();
        tokobaju.menghitung(tokobaju.jumlah);


    }
}

