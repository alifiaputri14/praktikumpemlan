import java.util.ArrayList;
public class RentArchive {
    //deklarasi arraylist
    ArrayList<CarRent> rentData=new ArrayList<CarRent>();
    public void Rent(CarRider rider, Car car, int RentDur){
        CarRent rentcar= new CarRent(rider,car,RentDur);
        if(car.isStatus()==false){
            System.out.println("Maaf, mobil sudah disewa");

        }

        if(car.isStatus()==true){
            rentData.add(rentcar);
            System.out.println("Mobil berhasil disewa ");
            car.setStatus(String.valueOf(false));

        }
        else{
            System.out.println("Maaf, mobil sudah disewa");
        }

    }
    public void info(){
        System.out.println("--------------------------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("--------------------------------------------------");
        int a=0;
        while (a< rentData.size()){

            System.out.println("NAMA PEMINJAM     :"+rentData.get(a).getRider().getName());
            System.out.println("TIPE MOBIL        :"+rentData.get(a).getCar().getCarType());
            System.out.println("NO POLISI         :"+rentData.get(a).getCar().getPolnum());
            System.out.println("LAMA RENTAL       :"+rentData.get(a).getRentDur());
            System.out.println("--------------------------------------------------");

            a++;
        }
    }
}
