public class Car {

    // atribut
    private String CarType,Polnum,Merk;
    private boolean Status;
    //constractor
    Car(String CarType, String Polnum, String Merk, boolean Status){
        this.CarType=CarType;
        this.Polnum=Polnum;
        this.Merk=Merk;
        this.Status=Status;

    }
    //getter polnum
    public String getPolnum() {
        return Polnum;
    }
    //getter merk

    public String getMerk() {
        return Merk;
    }
    //is status
    public boolean isStatus() {
        return Status;
    }
    //set status ->method void

    public void setStatus(String status) {
        this.Status =Boolean.parseBoolean(status);

    }
    //getter car type (tambahan )

    public String getCarType() {
        return CarType;
    }
}