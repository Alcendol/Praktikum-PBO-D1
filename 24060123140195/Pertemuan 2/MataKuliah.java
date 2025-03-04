/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat   : Nayaka Fauzan Prasetyo/24060123140195
 * Tanggal   : Rabu, 26 Februari 2025
 */
package pertemuan2;

public class MataKuliah {
    //atribut
    private String id;
    private String nama;
    private Integer sks; 


    //method
    public MataKuliah () {
        this.id = "";
        this.nama = "";
        this.sks = 0;

    }

    public MataKuliah (String id,String nama,Integer sks) {
        this.id = id;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor 
    public String getId() {
        return this.id;
    }
    public String getNama () {
        return this.nama;
    }
    public Integer getSks () {
        return this.sks;
    }

    //mutator
    public void setId (String id) {
        this.id = id;   
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setSks (Integer sks) {
        this.sks = sks;
    }
}
