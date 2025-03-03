public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    Titik() {
        this(0,0);
        counterTitik++;
    }

    // Overloading Konstruktor
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Menentukan kuadran dari titik
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        } else if(absis < 0 && ordinat > 0){
            return 2;
        } else if(absis < 0 && ordinat < 0){
            return 3;
        } else if(absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    // Menghitung jarak suatu titik dengan titik pusat
    double getJarakPusat() {
        double jarak = Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
        // Bulatkan ke 2 angka di belakang koma
        return Math.round(jarak * 100) / 100.0;
    }
    
    double getJarak(Titik T) {
        double jarak = Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + 
                        Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
        // Bulatkan ke 2 angka di belakang koma
        return Math.round(jarak * 100) / 100.0;
    }
    
    // Merefleksikan nilai absis
    void refleksiX(){
        this.ordinat *= -1;
    }

    // Merefleksikan nilai ordinat
    void refleksiY(){
        this.absis *= -1;
    }

    // Mengembalikan nilai refleksi absis
    double getRefleksiX(){
        return this.absis * -1;
    }

    // Mengembalikan nilai refleksi ordinat
    double getRefleksiY(){
        return this.ordinat * -1;
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}