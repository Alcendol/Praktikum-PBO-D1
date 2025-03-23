package pertemuan3;
//Nama file : AngkaSialException.java
//Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan masukkan angka 13");
    }
}
