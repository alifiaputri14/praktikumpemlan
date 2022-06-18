public class CarRent {
    //atribut
    CarRider rider;
    Car car;
    int RentDur;
    //constractor
    CarRent(CarRider rider, Car car, int RentDur){
        this.rider=rider;
        this.car=car;
        this.RentDur=RentDur;

    }
    //getter rider

    public CarRider getRider() {
        return rider;
    }
    //getter car

    public Car getCar() {
        return car;
    }
    //get rentdur

    public int getRentDur() {
        return RentDur;
    }
}