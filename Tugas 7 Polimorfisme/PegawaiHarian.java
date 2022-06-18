public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if(totalJam<=40)
            return getUpahPerJam()*getTotalJam();
        else
            return ((getUpahPerJam()*getTotalJam())+((getTotalJam()-40)*getUpahPerJam()*1.5));
    }

    @Override
    public String toString() {
        return super.toString()+"Upah/jam        :   "+getUpahPerJam()+"\n"+
                "Total Jam Kerja :   "+getTotalJam()+"\n"+
                "Pendapatan      :    "+gaji()+"\n";

    }
}
