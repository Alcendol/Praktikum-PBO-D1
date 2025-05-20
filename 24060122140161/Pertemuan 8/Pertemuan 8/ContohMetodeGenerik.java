public class ContohMetodeGenerik {
    public static <T extends anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.gerak();
        hewan.bersuara();
    }
}
