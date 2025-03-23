package pertemuan3;
//File : AngkaSial.java
//Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa throw dan throws
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println("Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(12);
            as.cobaAngka(13);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati2 memasukkan angka");
        }
    }
}

//Ketika eksepsi terjadi, kode program pada baris 12 tidak akan dieksekusi dikarenakan eksepsi menangkap kesalahan dan langsung throw ke AngkaSialException
//Baris ke 21 akan dieksekusi apabila terdapat eksepsi dari blok try sebelum catch