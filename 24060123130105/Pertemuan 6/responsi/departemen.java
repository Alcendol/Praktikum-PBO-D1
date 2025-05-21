public class departemen {
    protected String nama;
    protected String Ketua;
    protected double biayaKebersihan;

    public departemen() {
        this.nama = "Tidak ada";
        this.Ketua = "Tidak ada";
        this.biayaKebersihan = 0.0;
    }
    public departemen(String nama, String Ketua, double biayaKebersihan) {
        this.nama = nama;
        this.Ketua = Ketua;
        this.biayaKebersihan = biayaKebersihan;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKetua() {
        return Ketua;
    }

    public void setKetua(String Ketua){
        this.Ketua = Ketua;
    }

    public double getBiayaKebersihan() {
        return biayaKebersihan;
    }

    public void setBiayaKebersihan(double biayaKebersihan) {
        this.biayaKebersihan = biayaKebersihan;
    }
}
