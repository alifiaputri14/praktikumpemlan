import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Nama Pengguna :");
        String namaPenggun=in.nextLine();

        System.out.print("NIM           :");
        String nim=in.nextLine();
        System.out.println("=====Selamat Datang di Daftar Pegawai=========");
        System.out.println("=====Data Seluruh Pegawai =====");

        Pegawai pegawaitetap1=new PegawaiTetap("Bianca","31515152662",3000000);
        System.out.println("=====Pegawai Tetap ======");
        System.out.println(pegawaitetap1.toString());

        Pegawai pegawaitetap2=new PegawaiTetap("Dido ","31515152661",2500000);
        System.out.println(pegawaitetap2.toString());

        Pegawai pegawaitetap3=new PegawaiTetap("Dimas ","31595152661",2590000);
        System.out.println(pegawaitetap3.toString());

        System.out.println("=====Pegawai Harian ======");
        Pegawai pegawaiHarian=new PegawaiHarian("totok","47473588835",8500,40);
        System.out.println(pegawaiHarian.toString());

        Pegawai pegawaiHarian2=new PegawaiHarian("Yayam","42344588835",10000,20);
        System.out.println(pegawaiHarian2.toString());

        Pegawai pegawaiHarian3=new PegawaiHarian("Budi","81473588835",11000,10);
        System.out.println(pegawaiHarian3.toString());

        System.out.println("=====Sales======");
        Pegawai sales=new Sales("Bambang","43478389288910",50,50000);
        System.out.println(sales.toString());

        Pegawai sales2=new Sales("Tresno","434783234088910",25,80000);
        System.out.println(sales2.toString());

        Pegawai sales3=new Sales("Dika","33455589288910",80,90000);
        System.out.println(sales3.toString());
    }
}