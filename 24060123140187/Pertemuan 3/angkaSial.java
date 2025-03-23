/*Nama File  : angkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Naifah Athika Swedy - 24060123140142
 * Tanggal   : Rabu, 5 Maret 2025
 * */

package pertemuanTiga;

public class angkaSial{

    public void cobaAngka(int angka) throws angkaSialException{
        if(angka == 13) {
            throw new angkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        angkaSial as = new angkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(angkaSialException e){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(e.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//3. *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
//Jika angka yang dimasukkan adalah 13, maka pernyataan if (angka == 13) akan bernilai true, dan eksepsi AngkaSialException akan dilempar dengan throw new AngkaSialException(); pada baris 10.
//Begitu eksepsi dilempar, eksekusi metode cobaAngka() akan langsung dihentikan, sehingga baris 12 tidak akan dieksekusi.

//*Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
//Jelaskan pada lembar praktikum anda !
//Dalam blok try, metode cobaAngka(10) akan dijalankan terlebih dahulu dan berhasil karena 10 bukan angka sial.
//Kemudian, cobaAngka(13) akan dieksekusi, yang menyebabkan eksepsi dilempar.
//Ketika eksepsi dilempar, eksekusi langsung dialihkan ke blok catch, sehingga baris setelah cobaAngka(13), termasuk cobaAngka(12), tidak akan dieksekusi.



