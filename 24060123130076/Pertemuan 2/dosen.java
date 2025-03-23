/*Nama: Muhammad Helmi Abdulbaqi */
/*NIM: 24060123130076 */


public class dosen {
    //atribut

    private String NIP;
    private String nama;
    private String prodi;



    //method
    public dosen(String NIP, String nama, String prodi){
        this.NIP=NIP;
        this.nama=nama;
        this.prodi=prodi;
    }

    public dosen(){
        this("","","");
    }

    public String getNIP(){
        return NIP;

    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;

    }

    public void setNIP(String X){
        this.NIP=X;

    }

    public void setNama(String X){
        this.nama=X;

        
    }

    public void setProdi(String X){
        this.prodi=X;

        
    }

}