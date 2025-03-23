/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 19 Februari 2025
 */


 public class Titik {
    //ATRIBUT
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    public int kuadran;

    //METHOD
    //konstruktor membuat titik (0,0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        kuadran = 0;
        counterTitik++;
    }

    //konstruktor membuat titik (x,y)
    public Titik(double x, double y){
        absis = x;
        ordinat = y;
        kuadran = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + y;
        ordinat = ordinat + x;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai kudran titik
    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            kuadran = 1;
        }
        else if (absis < 0 && ordinat > 0) {
            kuadran = 2;
        }
        else if (absis < 0 && ordinat < 0) {
            kuadran = 3;
        }
        else if (absis > 0 && ordinat < 0) {
            kuadran = 4;
        }
        return kuadran;
    }

    // mengembalikan jarak pusat
    public double getJarakPusat(){
        return Math.sqrt(
            (getAbsis() * getAbsis()) 
            + 
            (getOrdinat() * getOrdinat())
        );
    }

    // mengembalikan jarak 2 titik
    public double getJarak(Titik T1){
        return Math.sqrt(
            Math.pow((absis - T1.getAbsis()), 2)  
            + 
            Math.pow((ordinat - T1.getOrdinat()), 2)
        );
    }

    // merefleksi x
    public void refleksiX(){
        absis = absis * -1;
    }

    // merefleksi y
    public void refleksiY(){
        ordinat = ordinat * 1;
    }

    // mengembalikan nilai titik setelah refleksi x
    public Titik getRefleksiX(){
        Titik a = new Titik();
        a.setOrdinat(this.ordinat * -1);
        a.setAbsis(this.absis);

        return a;
    }

    // mengembalikan nilai titik setelah refleksi y
    public Titik getRefleksiY(){
        Titik a = new Titik();
        a.setOrdinat(this.ordinat);
        a.setAbsis(this.absis * -1);

        return a;
    }

    // Override toString() untuk mencetak objek dengan format yang jelas
    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }
}
