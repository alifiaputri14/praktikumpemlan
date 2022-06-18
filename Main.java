public class Main {
    public static void main(String[] args) {
        Manusia manusia1=new Manusia("Aku","3923842934",true,true);
        Manusia manusia2=new Manusia("Khansa","3156789034",false,true);
        Manusia manusia3=new Manusia("Diki","3157563445",true,false);
        System.out.println(manusia1.toString());
        System.out.println(manusia2.toString());
        System.out.println(manusia3.toString());
        System.out.println("-------------------------------------------------------------------------");
        Mahasiswa mahasiswa1=new Mahasiswa("I Putu Yoga","351923848239",false,false,"201550601111018",3.70);
        Mahasiswa mahasiswa2=new Mahasiswa("Lovrisca","3156237812",false,false,"215150700111012",3.8);
        Mahasiswa mahasiswa3=new Mahasiswa("Al","3154213760",false,false,"215150700111016",4.0);
        System.out.println(mahasiswa1.toString());
        System.out.println(mahasiswa2.toString());
        System.out.println(mahasiswa3.toString());
        System.out.println("-------------------------------------------------------------------------");
        Pekerja pekerja1=new Pekerja("Iqbal Biondy","351717969",true,true,7,22,"195102439283");
        Pekerja pekerja2=new Pekerja("Seffi Nafa ","31569809",false,true,12,15,"451334698712");
        Pekerja pekerja3=new Pekerja("Ghinasti Khansa Hamidah","31569809",false,false,12,25,"157334398712");
        System.out.println(pekerja1.toString());
        System.out.println(pekerja2.toString());
        System.out.println(pekerja3.toString());
        System.out.println("-------------------------------------------------------------------------");
        Manager manager1=new Manager("Lyra Hertin","351707384392",false,false,9,20,"204837283728",1500);
        Manager manager2=new Manager("Sefti Ade","3517034584392",false,false,10,8,"406837183728",2500);
        Manager manager3=new Manager("Dimas Agung ","35170742592",true,true,5,29,"303837383728",2500);
        System.out.println(manager1.toString());
        System.out.println(manager2.toString());
        System.out.println(manager3.toString());
        System.out.println("-------------------------------------------------------------------------");


    }
}