import java.util.ArrayList;

public class Mahasiswa {
    
    String nama;
    String nim;
    String prodi;
    Dosen dosenWali;
    ArrayList<MataKuliah> listMatkul;
    Kendaraan kend;



    /*
     * Konstruktor Mahasiswa tanpa parameter
     */
    public Mahasiswa()
    {
        nama = "";
        nim = "";
        prodi = "";
        dosenWali = new Dosen();
        listMatkul = new ArrayList<>(50);
        kend = new Kendaraan(); 
    }

    /*
     * Konstruktor Mahasiswa dengan parameter
     * @param nama nama mahasiswa
     * @param nim nim mahasiswa
     * @param prodi prodi mahasiswa
     */
    public Mahasiswa(String nama, String nim,String prodi)
    {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        dosenWali = new Dosen();
        listMatkul = new ArrayList<>(50);
        kend = new Kendaraan();
    }

    /*
     * Fungsi untuk mengambil nama mahasiswa
     * @return nama mahasiswa
     */
    public String getNama(){
        return nama;
    }

    /*
     * Fungsi untuk mengambil nim mahasiswa
     * @return nim mahasiswa
     */
    public String getNim()
    {
        return nim;
    }

    /*
     * Fungsi untuk mengambil prodi mahasiswa
     * @return prodi mahasiswa
     */
    public String getProdi()
    {
        return prodi;
    }

    /*
     * Fungsi untuk mengambil mata kuliah yang diambil mahasiswa
     * @return list mata kuliah yang diambil mahasiswa
     */
    public ArrayList<MataKuliah> getMatkul()
    {
        return listMatkul;
    }

    /*
     * Fungsi untuk mengambil dosen wali mahasiswa
     * @return dosen wali mahasiswa
     */
    public Dosen getDoswal()
    {
        return dosenWali;
    }

    /*
     * Fungsi untuk mengambil kendaraan mahasiswa
     * @return kendaraan mahasiswa
     */
    public Kendaraan getKendaraan()
    {
        return kend;
    }

    /*
     * Prosedur untuk mengatur nama mahasiswa
     * @param nama nama mahasiswa
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /*
     * Prosedur untuk mengatur nim mahasiswa
     * @param nim nim mahasiswa
     */
    public void setNim(String nim){
        this.nim = nim;
    }

    /*
     * Prosedur untuk mengatur prodi mahasiswa
     * @param prodi prodi mahasiswa
     */
    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }

    /*
     * Prosedur untuk mengatur dosen wali mahasiswa
     * @param dosenWali dosen wali mahasiswa
     */
    public void setDosenWali(Dosen dosenWali)
    {
        this.dosenWali = dosenWali;
    }

    /*
     * Prosedur untuk mengatur kendaraan mahasiswa
     * @param kend kendaraan mahasiswa
     */
    public void setKendaraan(Kendaraan kend)
    {
        this.kend = kend;
    }

    /*
     * Prosedur untuk menambahkan mata kuliah yang diambil mahasiswa
     * @param matkul mata kuliah yang diambil mahasiswa
     */
    public void addMatKul(MataKuliah matkul)
    {
        if (listMatkul.contains(matkul))
        {
            System.out.println("Mata kuliah sudah diambil");
        }
        else if (listMatkul.size() >= 50)
        {
            System.out.println("Mata kuliah sudah penuh");
        }
        else
        {
            listMatkul.add(matkul);
        }
    }

    public int getJumlahSKS(){
        int jml = 0;
        for (MataKuliah i : listMatkul) {
            jml += i.getSks();
        }
        return jml;
    }

    public int getJumlahMatKul(){
        return this.getMatkul().size();
    }

    public void printMhs(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs(){
        int count = 1;
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mata Kuliah : ");

        for (MataKuliah i : listMatkul) {
            System.out.println(count +".");
            count++;
            i.printMatKul();
        }

        System.out.println("Dosen Wali : " );
        System.out.println("Nama dosen : " + this.getDoswal().getNama());
        System.out.println("NIP dosen : " + this.getDoswal().getNip());
        System.out.println("Prodi dosen : " + this.getDoswal().getProdi());
    }

    
}
