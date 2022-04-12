import java.io.*;
import java.util.*;



public class Solution {

    public static boolean Selde(int angka) {
        int SusunanAngka  = angka;
        int balikan = 0;
        int ingat;

        while(SusunanAngka>0) {
            ingat = SusunanAngka % 10;
            balikan = balikan * 10 + ingat;
            SusunanAngka = SusunanAngka / 10;
        }


        if (angka == balikan) {
            return true;
        }
        return false;
    }

    public static void main(String args[]){

        Scanner masukkan=new Scanner(System.in);
        int SusunanAngka = masukkan.nextInt();

        if( Selde(SusunanAngka)){
            System.out.println(SusunanAngka
                    + " adalah selde.");
        }else{
            System.out.println(SusunanAngka
                    + " bukan selde.");
        }

    }



}

