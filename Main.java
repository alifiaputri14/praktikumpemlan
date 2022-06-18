public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Nama Mahasiswa : ALIFIA PUTRI BUDIYANTI");
        System.out.println("NIM            : 215150700111016");
        System.out.println("KELAS          : TI-A");
        System.out.println("--------------------------------------------------");

        //deklarasi objeck car rider
        CarRider ming=new CarRider("Ghinasti Khansa Hamidah","08233747347983",18);
        CarRider youhan=new CarRider("Seffi Nafa Pratama Urbach Hariyanto", "084348736623",17);
        CarRider ling=new CarRider("Dhifa Cahyani ", "085666788378", 19);
        //instansiasi class car data
        CarData data=new CarData();
        //tambahkan item
        data.addCar("SUV","S 1321 AA", "Honda");
        data.addCar("SPORT", "W 2093 AC", "CRV");
        data.addCar("TRUCK", "N 3344 AD", "Suzuki");
        //memanggil method listofcar untuk menampilkan data mobil
        data.ListofCar();

        //instansiasi clas rent archive
        RentArchive arsip=new RentArchive();
        //memasukkan data
        arsip.Rent(ming,data.carList.get(1),20);
        arsip.Rent(youhan,data.carList.get(0), 40);
        arsip.Rent(ling,data.carList.get(1), 7);

        System.out.println(" ");
        arsip.info();

    }
}