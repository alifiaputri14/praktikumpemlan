public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah,  int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        double gajinormal=getHariKerja()*getJamKerja()*15;
        return gajinormal;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        int libur=(getHariKerja()/7)*2;
        double bonuslembur = 0;
        if ((getHariKerja() - (getHariKerja() / 7 * 7) == 6) || getJamKerja()>7) {

            libur++;
            bonuslembur=(((getHariKerja() - libur) *(getJamKerja()-7)*7));
        }
        else{
            bonuslembur=0;
        }
        double bonuslibur;
        if(getHariKerja()>5){
            bonuslibur=((libur) *getJamKerja()*20);
        }else{
            bonuslibur=0;
        }
        return bonuslembur+bonuslibur;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {

        this.NIP = NIP;
    }

    public String getStatus() {
        String kantorCabang = null;
        if (getNIP().charAt(0) == '1') {
            kantorCabang = "Mondstadt";
        } else if (getNIP().charAt(0) == '2') {
            kantorCabang = "Liyue";
        } else if (getNIP().charAt(0) == '3') {
            kantorCabang = "Inazuma";
        } else if (getNIP().charAt(0) == '4') {
            kantorCabang = "Sumeru";
        } else if (getNIP().charAt(0) == '5') {
            kantorCabang = "Fontaine";
        } else if (getNIP().charAt(0) == '6') {
            kantorCabang = "Natlan";
        } else if (getNIP().charAt(0) == '7') {
            kantorCabang = "Snezhnaya";
        }
        String departemen = null;
        if (getNIP().charAt(6) == '1') {
            departemen = "Pemasaran";
        } else if (getNIP().charAt(6) == '2') {
            departemen = "Humas";
        } else if (getNIP().charAt(6) == '3') {
            departemen = "Riset";
        } else if (getNIP().charAt(6) == '4') {
            departemen = "Teknologi";
        } else if (getNIP().charAt(6) == '5') {
            departemen = "Personalia";
        } else if (getNIP().charAt(6) == '6') {
            departemen = "Akademik";
        } else if (getNIP().charAt(6) == '7') {
            departemen = "Administrasi";
        } else if (getNIP().charAt(6) == '8') {
            departemen = "Operasional";
        } else if (getNIP().charAt(6) == '9') {
            departemen = "Pembangunan";

        }
        char cabangke=getNIP().charAt(2);
        return departemen+","+" "+kantorCabang+" "+"cabang ke-"+cabangke;


    }
    public String toString() {
        return  "Nama              :" + getNama()+"\n"+"NIK               :" + getNIK() + "\n"+"Jenis Kelamin     : " + getJenisKelamin() + "\n"+"Pendapatan        :" +( getPendapatan()+getGaji()+getBonus()) + "$"+"\n"+"Bonus             :" + getBonus() +"$"+ "\n"+"Gaji              :" + getGaji() + "$"+"\n"+"Status            :" + getStatus()+"\n";

    }
}