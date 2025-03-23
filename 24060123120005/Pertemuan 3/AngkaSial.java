/*
    Nama File : AngkaSial.java
    Deskripsi : Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'
    Pembuat   : Patricia Gabrielle Yudianto
    Tanggal   : 9 Maret 2025
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage());
            System.out.println("hati hati memasukkan angka!!");
        }

    }
}

/*
 * Pertanyaan : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di
 * atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * Jelaskan pada lembar praktikum anda !
 * 
 * Jawaban :
 * 1. Tidak, baris 12 tidak dieksekusi, baris 12 dalam soal adalah pemanggilan
 * as.cobaAngka(12);
 * Sebelumnya, pada baris 11 as.cobaAngka(13); dipanggil. Karena 13 adalah angka
 * sial, maka kondisi if(angka == 13) di dalam metode cobaAngka(int angka) akan
 * bernilai true, sehingga program akan melempar eksepsi AngkaSialException.
 * Saat eksepsi dilempar, program langsung lompat ke blok catch, sehingga baris
 * 12 (pemanggilan as.cobaAngka(12);) tidak dieksekusi
 * 
 * 2. Ya, baris 21 dieksekusi, baris 21 dalam soal adalah
 * System.out.println("hati-hati memasukkan angka!!!"); yang ada di dalam blok
 * catch.
 * Karena eksepsi AngkaSialException terjadi saat as.cobaAngka(13); dipanggil,
 * program masuk ke blok catch. Semua perintah dalam blok catch, termasuk baris
 * 21, akan diekseskusi (mengeluarkan output pesan dari catch yang ada)
 */