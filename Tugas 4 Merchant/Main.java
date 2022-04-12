import java.util.*;
public class Main {


    public static void main(String[] args) {



        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso",(int) 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa",(int) 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi",(int) 10000));

        System.out.println("Nama Pemilik : Alifia Putri Budiyanti");
        System.out.println("NIM Pemilik  : 215150700111016");
        System.out.println("Kelas Pemilik: TI-A");
        boolean Menu = true;

        do {
            Scanner masukkan = new Scanner(System.in);

            System.out.println("Pilih Salah Satu Kategori Berikut!");
            System.out.println("a.Tambah Merchant");
            System.out.println("b.Tampil Data");
            System.out.println("c.Cari Merchant");
            System.out.println("d.Update Merchant");
            System.out.print("Masukkan Kategori yang dipilih : ");
            String kategori=masukkan.nextLine();
            switch(kategori){
                case "Tampil Data":{
                    DataMerchant.tampilData();
                    break;
                }
                case "Tambah Merchant":{
                    System.out.print("Masukkan Nama Merchant : ");
                    String namaMerchant = masukkan.nextLine();
                    System.out.print("Masukkan Nama Produk   : ");
                    String namaProduk = masukkan.nextLine();
                    System.out.print("Masukkan Harga Makanan  : ");
                    Double HargaMakanan = masukkan.nextDouble();
                    DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, HargaMakanan));
                    break;
                }case "Cari Merchant":{
                    System.out.print("Masukkan Nama Merchant : ");
                    String Nama = masukkan.nextLine();
                    DataMerchant.tampilMerchant(DataMerchant.cariMerchant(Nama));
                    break;
                }case "Update Merchant":{
                    System.out.print("Masukkan Nama Merchant : ");
                    String Nama = masukkan.nextLine();
                    switch (Nama){
                        case "Bakso Pak Sahid":{
                            DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama));
                            break;
                        }case "Nasgor Mblebes":{
                            DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama));
                            break;
                        }case "Ayam Geprek Kak Ros":{
                            DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama));
                            break;
                        }default:{
                            DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama));
                            break;
                        }
                    }

                    break;
                }default:{
                    Menu = false;
                }
            }

        }  while (Menu);
    }
}




