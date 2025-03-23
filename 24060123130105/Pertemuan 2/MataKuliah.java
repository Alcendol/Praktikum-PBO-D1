public class MataKuliah {
    
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String id, String nama, int sks)
    {
        idMatkul = id;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMK(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }
    
    public void printMatKul(){
        System.out.println("Nama MK : " + nama);
        System.out.println("Id MK : " + idMatkul);
        System.out.println("SKS MK : " + sks);
    }
}
