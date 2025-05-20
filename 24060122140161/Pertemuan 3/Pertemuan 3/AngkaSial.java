/**
 * File : AngkaSial.java
 * Deskripsi: program penggunaan exception buatan sendiri
 *              pengenalan klausa 'throw' dan 'throws'
 *              
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //Method getMassage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukan angka !!!!");
        }
    }
}

//PERTANYAAN: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
/*Ketika eksepsi terjadi saat program memanggil as.cobaAngka(13), variabel angka dalam metode cobaAngka memiliki nilai 13,
 yang sesuai dengan kondisi if. Oleh karena itu, baris yang mencetak pesan "13 bukan angka sial" (System.out.println(angka + " bukan angka sial");) 
 tidak akan dieksekusi pada saat ini. Sebaliknya, pernyataan throw new AngkaSialException(); 
 akan segera menjatuhkan eksepsi AngkaSialException. Ini berarti bahwa eksekusi metode cobaAngka akan berhenti pada titik ini,
 dan baris yang mencetak pesan tidak akan dieksekusi.*/

//PERTANYAAN: Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
/* Pernyataan catch (AngkaSialException ase) pada program AngkaSial.java akan dieksekusi jika terjadi eksepsi AngkaSialException dalam blok try. 
Ini disebabkan oleh fungsinya yang khusus: menangkap eksepsi yang dilemparkan oleh metode cobaAngka(). Ketika program mencoba untuk memanggil cobaAngka() 
dengan angka 13, metode ini melempar eksepsi AngkaSialException. Kemudian, blok catch ini bertindak sebagai penangan eksepsi, sehingga baris-baris 
di dalamnya akan dieksekusi. Dalam hal ini, akan mencetak pesan yang menyatakan "hati-hati memasukkan angka !!!!"..*/

