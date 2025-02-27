// Nama File : Kendaraan.java
// Deskripsi : berisi atribut dan method dalam class Kendaraan 
// Pembuat   : Pramudya Jati Pamungkas
// Tanggal   : 27 Februari 2025

public class Kendaraan {
    /*************** Atribut *****************/
    private String noPlat;
    private String Jenis;

    /*************** Method *****************/
    // Constructor
    protected Kendaraan(){
        this.noPlat = "00000";
        this.Jenis = "Jenis Kendaraan";
    }

    protected Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    // Selector / getter
    protected String getNoPlat(){
        return noPlat;
    }

    protected String getJenis(){
        return Jenis;
    }

    // Mutator / Setter
    protected void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    protected void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
}
