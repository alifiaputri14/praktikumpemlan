class Lingkaran{
    int jari2;
    public double Lingkaran(int jari2){
        if(jari2%7!=0){
            double phi= 3.14;
            int operasi=(int) (phi*jari2*jari2);
            return operasi;
        }else{
            float phi= 22/7;
            int operasi=(int) (phi*jari2*jari2);
            return operasi;
        }



    }
}
