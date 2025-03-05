//Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : Garis.java
public class Garis {
   //Atribut garis
   Titik titikAwal, titikAkhir, titikTengah;
   static int counter = 0;

   //Konstruktor default
   public Garis(){
       //Set titik awal dengan koordinat (0,0)
       titikAwal = new Titik();
       //Set titik akhir dengan koordinat (1, 1)
       titikAkhir = new Titik(1, 1);
       //Set titik tengah berdasarkan nilai titik awal dan titik akhir
       updateTitikTengah();
       //Hitung jumlah garis
       counter++;
   }

   //konstruktor dengan parameter
   public Garis(Titik titikawal, Titik titikakhir){
       this.titikAwal = titikawal;
       this.titikAkhir = titikakhir;
       updateTitikTengah();
       counter++;
   }

   //Selektor titik awal
   public Titik getTitikAwal(){
       return titikAwal;
   }

   //Selektor titik akhir
   Titik getTitikAkhir(){
       return titikAkhir;
   }

   //Mutator titik awal
   void setTitikAwal(double absis, double ordinat){
       titikAwal.setAbsis(absis);
       titikAwal.setOrdinat(ordinat);
       updateTitikTengah();
   }

   //Mutator titik akhir
   void setTitikAkhir(double absis, double ordinat){
       titikAkhir.setAbsis(absis);
       titikAkhir.setOrdinat(ordinat);
       updateTitikTengah();
   }

   //Mengembalikan jumlah garis yang dibuat
   static int getCounter(){
       return counter;
   }
   //Mengembalikan panjang dari sebuah garis
   double panjangGaris(){
       return Math.sqrt(
           Math.pow(
               getTitikAwal().getAbsis()
               -
               getTitikAkhir().getAbsis()
               
           ,2)
           +
           Math.pow(
               getTitikAwal().getOrdinat()
               -
               getTitikAkhir().getOrdinat()
           ,2)
       );
   }

   //mengembalikan gradien dari sebuah garis
   double gradienGaris(){
       return 
       (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat())
       /
       (getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
   }


   //Memperbarui titik tengah setiap kali titik awal atau titik akhir berubah
   void updateTitikTengah(){
       this.titikTengah = new Titik(
           (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, 
           (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2
       );
   }

   //Mengembalikan titik tengah dari sebuah garis
   Titik getTitikTengah(){
       return titikTengah;
   }

   //Mengecek apakah sebuah garis sejajar dengan garis lainnnya
   boolean isSejajar(Garis G){
       return gradienGaris() == G.gradienGaris();
   }

   //Mengecek apakah sebuah garis tegak lurus dengan garis lainnya
   boolean isTegakLurus(Garis G){
       return gradienGaris() * G.gradienGaris() == -1;
   }


   //Menampilkan titik awal dan titik akhir dari sebuah baris
   void printGaris(){
       titikAwal.printTitik();
       titikAkhir.printTitik();
   }

   //Menampilkan persamaan garis
   String persamaanGaris(){
       return "y = " + gradienGaris() + "x" + "+" + (titikAwal.getOrdinat() - (gradienGaris()*titikAwal.getAbsis()));
   }
}