import java.util.ArrayList;
public class CarData {
    //deklarasi arraylist
    ArrayList<Car>carList=new ArrayList<Car>();
    public void addCar(String CarType, String Polnum , String Merk){
        Car car=new Car(CarType, Polnum, Merk, true);
        // menambahkan item
        carList.add(car);}
    //method list of car -> menampilkan seluruh objek car pada arraylist carlist
    public void ListofCar() {
        System.out.println("--------------------------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("--------------------------------------------------");
        int a=0;
        while (a<carList.size()){

            System.out.println("TIPE MOBIL     :" + carList.get(a).getCarType());
            System.out.println("NOMOR POLISI   :" + carList.get(a).getPolnum());
            System.out.println("MERK MOBIL     :" + carList.get(a).getMerk());
            System.out.println("--------------------------------------------------");
            a++;
        }
    }
    public ArrayList<Car> getCarList(){
        return carList;
    }

}
