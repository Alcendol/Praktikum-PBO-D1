public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Garis G2 = new Garis(new Titik(4, 7), new Titik(3, 7));
        
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}
