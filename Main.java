import java.io.*;
import java.util.*;

public class Main {

    private static char pilihan;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //deklrasi variabel
        int sisi1, sisi2, sisi, jari2;

        //intansiasi
        Persegi BangunPersegi = new Persegi();
        Segitiga BangunSegitiga = new Segitiga();
        Lingkaran BangunLingkaran = new Lingkaran();

        pilihan = in.next().charAt(0);
        //pilihan

        switch (pilihan) {
            case '1': {
                sisi = in.nextInt();
                System.out.println(BangunPersegi.Persegi(sisi));
                break;
            }
            case '2': {
                sisi1 = in.nextInt();
                sisi2 = in.nextInt();
                System.out.println(BangunSegitiga.Segitiga(sisi1, sisi2));
                break;
            }
            case '3': {
                jari2 = in.nextInt();
                System.out.println((double)BangunLingkaran.Lingkaran(jari2));
                break;
            }
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}