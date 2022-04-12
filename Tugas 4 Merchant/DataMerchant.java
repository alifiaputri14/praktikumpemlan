import java.util.*;

public class DataMerchant {

    static Merchant[] merc = new Merchant[0];
    static Scanner Masukkan = new Scanner(System.in);



    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] indeks = new Merchant[DataMerchant.merc.length+1];
        int a=0;
        while (a<DataMerchant.merc.length) {
            indeks[a] = DataMerchant.merc[a];
            a++;
        }
        indeks[indeks.length - 1] = merchant;
        return indeks;
    }

    public static void tampilData(){
        System.out.println("==== Tampilan Data Merchant UBFood ====");
        int a=0;
        while (a<merc.length) {
            System.out.println("Nama Merchant   : "+merc[a].getNamaMerchant());
            System.out.println("Nama Produk     : "+merc[a].getNamaProduk());
            System.out.println("Harga           : "+(int)merc[a].getHargaMakanan());
            System.out.println("=======================================");
            a++;
        }
    }

    public static Merchant cariMerchant(String nama){
        Merchant simpan = merc[0];
        int a=0;
        while (a<merc.length) {
            String CariNama=merc[a].getNamaMerchant();
            if (nama.equals(CariNama)) {
                simpan = merc[a];
            }
            a++;

        }
        return simpan;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("== Tampilan Cari Data Merchant UBFood ==");
        System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk     : "+merchant.getNamaProduk());
        System.out.println("Harga           : "+(int)merchant.getHargaMakanan());
        System.out.println("=======================================");

    }
    public static void Kategori_Update(){
        System.out.println("----Kategori Update---- ");
        System.out.println("a. Nama Merchant");
        System.out.println("b. Nama Produk");
        System.out.println("c. Harga Makanan");
    }
    public static Merchant updateMerchant(Merchant merchant){
        DataMerchant.Kategori_Update();
        System.out.print("Masukkan Kategori : ");
        String Kategori=Masukkan.nextLine();
        switch(Kategori){
            case "Nama Merchant":{

                System.out.print("Update Nama Merhant  : ");
                String inputNamaMerchant = Masukkan.nextLine();
                merchant.setNamaMerchant(inputNamaMerchant);
                break;

            }case "Nama Produk":{
                System.out.print("Update Nama Produk  : ");
                String inputNamaProduk = Masukkan.nextLine();
                merchant.setNamaProduk(inputNamaProduk);
                break;
            }case "Harga Makanan":{
                System.out.print("Update Harga Makanan  : ");
                Double inputHarga = Masukkan.nextDouble();
                merchant.setHargaMakanan(inputHarga);
                break;
            }default:{

            }

        }
        return merchant;
    }
}
