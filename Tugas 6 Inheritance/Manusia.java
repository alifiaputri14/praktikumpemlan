public class Manusia {
    //atribut
    private String nama;
    private String NIK;
    private boolean JenisKelamin;
    private boolean Menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        JenisKelamin = jenisKelamin;
        Menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin(){
        String JenisKelamin=null;
        if(isJenisKelamin()==false){
            JenisKelamin="Perempuan";

        }else if(isJenisKelamin()==true){
            JenisKelamin="Laki-Laki";

        }

        return JenisKelamin;
    }

    public boolean isMenikah() {
        return Menikah;
    }

    public void setMenikah(boolean menikah) {
        Menikah = menikah;
    }
    public double getTunjangan(){
        double Tunjangan=0;
        if(isMenikah()==true){
            if (isJenisKelamin()==true){
                Tunjangan=25;
            }else if(isJenisKelamin()==false){
                Tunjangan=20;
            }
        }if (isMenikah()==false){
            Tunjangan=15;
        }
        return Tunjangan;
    }
    public  double getPendapatan(){

        return getTunjangan();
    }
    public String toString(){
        return "Nama              :"+getNama()+"\n"+"NIK               :"+getNIK()+"\n"+"Jenis Kelamin     : "+getJenisKelamin()+"\n"+"Jumlah Pendapatan :"+getPendapatan()+"$"+"\n";


    }

}
