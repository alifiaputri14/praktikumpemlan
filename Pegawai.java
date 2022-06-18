public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }
    public double gaji(){

        return gaji();
    }
    public String toString() {
        String toString = "";
        toString+="Nama            :\t"+getNama()+"\n";
        toString+="No KTP          :\t"+getNoKTP()+"\n";
        return  toString;
    }
}