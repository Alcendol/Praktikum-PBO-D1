/*Nama: Muhammad Helmi Abdulbaqi */
/*NIM: 24060123130076 */


public class MataKuliah {
    //atribut
    private String idMatkul;
    private String nama;
    private int sks;


    //method
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul=idMatkul;
        this.nama=nama;
        this.sks=sks;
    }

    public MataKuliah(){
        this("","",0);

    }

    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    public void setIdMatkul( String X){
        this.idMatkul=X;
    }
    public void setNama(String X){
        this.nama=X;
    }

    public void setSKS(int X){
        this.sks=X;
    }
}
