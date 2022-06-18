public class Mahasiswa extends Manusia{
    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {

        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {

        return IPK;
    }

    public void setIPK(double IPK) {

        this.IPK = IPK;
    }

    public String getStatus() {

        String prodi = "";
        char angkatan1 = getNIM().charAt(0);
        char angkatan2 = getNIM().charAt(1);
        if (getNIM().charAt(6) == '2') {
            prodi = "Teknik Meniup Gelembung,20";
            return prodi+angkatan1+angkatan2;

        } else if (getNIM().charAt(6) == '3') {
            prodi = "Teknik Berburu Ubur-Ubur,20";
            return prodi+angkatan1+angkatan2;

        } else if (getNIM().charAt(6) == '4') {
            prodi = "Sistem Penghamburgeran,20";
            return prodi+angkatan1+angkatan2;

        } else if (getNIM().charAt(6) == '6') {
            prodi = "Pendidikan Chum Bucket,20";
            return prodi+angkatan1+angkatan2;

        } else if (getNIM().charAt(6) == '7') {
            prodi = "Teknologi Telepon Kerang,20";
            return prodi+angkatan1+angkatan2;

        }
        return prodi+angkatan1+angkatan2;
    }




    public double getBeasiswa(){
        double Beasiswa=0;
        if(getIPK()>=3.0 && getIPK()<=3.5){
            Beasiswa=20;

        }else if(getIPK()>3.5 && getIPK()<=4.0){
            Beasiswa=75;
        }
        return Beasiswa;
    }

    public String toString() {
        return "Nama              :" + getNama()+"\n"+"NIK               :" + getNIK() + "\n"+"Jenis Kelamin     : " + getJenisKelamin() + "\n"+"Jumlah Pendapatan :" +( getPendapatan()+getBeasiswa()) + "\n"+"NIM               :" + getNIM() + "\n"+"Status            :" + getStatus()+"\n";

    }

}
