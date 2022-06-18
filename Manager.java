public class Manager extends Pekerja{
    private int lamaKerja;

    public Manager(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan()+15;
    }

    @Override
    public double getBonus() {
        return super.getBonus()+((super.getBonus()*0.3));
    }

    public String toString (){
        return  "Nama              : " + getNama() + "\n"+"NIK               : " + getNIK() + "\n"+"Jenis Kelamin     : " + getJenisKelamin() + "\n"+"Pendapatan        : " + (getBonus() + getGaji() + getPendapatan() ) + "$\n"+"Bonus             : " + getBonus()+ "$\n"+"Gaji              : " + getGaji() + "$\n"+"Status            : " + getStatus() + "\n"+"Lama Kerja        : " + getLamaKerja() + "hari\n";


    }
}
