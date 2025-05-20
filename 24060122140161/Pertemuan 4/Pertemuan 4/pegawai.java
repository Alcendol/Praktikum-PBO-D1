import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
public class pegawai {
    private String nip;
    private String nama;
    private Date tanggalLahir;
    private Date tmt;
    private double gajiPokok;

    public pegawai(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public Date getTanggalLahir(){
        return this.tanggalLahir;
    }

    public Date getTmt(){
        return this.tmt;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setNip(String nip){
        this.nip = nip;
    } 

    public void setNama(String nama){
        this.nama = nama;
    } 

    public void setTanggalLahir(Date tglLahir){
        this.tanggalLahir = tglLahir;
    }

    public void setTmt(Date newTmt){
        this.tmt = newTmt;
    }

    public void setGajiPokok(Float gaji){
        this.gajiPokok = gaji;
    }

    public int hitungMasaKerja() {
        long diff = new Date().getTime() - tmt.getTime();
        return (int) TimeUnit.MILLISECONDS.toDays(diff) / 365;
    }
  
    public String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        return sdf.format(date);
    }
    

}
