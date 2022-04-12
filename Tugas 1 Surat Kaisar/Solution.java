import java.io.*;
import java.util.*;

public class Solution {

    private static void LompatKata(String kalimat, int lompat){
        for(int a=0;a<kalimat.length();a++){
            int ambil=kalimat.charAt(a);
            if(ambil>=65 ){
                if(ambil<=90){
                    if(ambil+lompat >90){
                        System.out.print((char)(ambil+lompat-26));
                    }else{
                        System.out.print((char)(ambil+lompat));
                    }
                }
            } if(ambil>=97 ){
                if(ambil<=122){
                    if(ambil+lompat >122){
                        System.out.print((char)(ambil+lompat-26));
                    }else{
                        System.out.print((char)(ambil+lompat));
                    }
                }
            }if(ambil==' '){
                System.out.print(' ');

            }
        }
    }
    public static void main(String[] args) {
        Scanner masukkan=new Scanner(System.in);
        String kalimat=masukkan.nextLine();
        int lompat=masukkan.nextInt();
        LompatKata(kalimat,lompat);

    }
}
