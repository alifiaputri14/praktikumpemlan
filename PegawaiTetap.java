public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return getUpah();
    }

    @Override
    public String toString() {
        return super.toString()+"Upah            :   "+getUpah()+
                "\n"+"Pendapatan      :   "+gaji()+"\n";
    }
}
