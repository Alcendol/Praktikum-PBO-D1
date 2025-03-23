public class Kendaraan {

    String noPlat;
    String jenis;

    public Kendaraan()
    {
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String p, String jnis)
    {
        noPlat = p;
        jenis = jnis; 
    }

    public String getPlat()
    {
        return noPlat;
    }

    public String getJenis()
    {
        return jenis;
    }
    
}