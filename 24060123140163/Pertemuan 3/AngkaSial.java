/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Nasywa Alya Kamila
 * Tanggal      : 11/3/2025
 */ 

 public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial.");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println("Terjadi eksepsi: " + ase.getMessage());
            System.out.println("Hati hati memasukkan angka!!!");
        }
    }
}

/* 
 * Baris ke 12 tidak dieksekusi saat angka 13 dipanggil, karena ketika 
 * angka 13 dipanggil, eksepsi AngkaSialException dithrow kan, 
 * sehingga eksekusi langsung berpindah ke blok catch
 */

/* 
 * Baris ke 21 tetap dieksekusi, karena setelah eksepsi ditangkap 
 * oleh catch, program tidak berhenti tetapi melanjutkan eksekusi 
 * dari blok catch 
 */