/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class mata kuliah
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 26 Februari 2025
 */

public class MataKuliah {
    // Atribut
    private String idMatKul;
    private String nama;
    private Integer sks;

    // Method
    // Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter idMatKul, nama, sks
    public MataKuliah(String idMatKul, String nama, Integer sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor
    public String getIdMatKul() {
        return this.idMatKul;
    } 

    public String getNama() {
        return this.nama;
    }

    public Integer getSks() {
        return this.sks;
    }

    // Mutator
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
}
