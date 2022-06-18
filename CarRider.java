public class CarRider {
    //atribut
    private String Name, Phone;
    private int age;
    //constractur
    CarRider(String Name, String Phone, int age){
        this.Name=Name;
        this.Phone=Phone;
        this.age=age;
    }
    //getter name

    public String getName() {
        return Name;
    }
    //getter age
    public int getAge() {
        return age;
    }
    //getter phone

    public String getPhone() {
        return Phone;
    }
}
