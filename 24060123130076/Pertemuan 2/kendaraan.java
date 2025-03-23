/*Nama: Muhammad Helmi Abdulbaqi */
/*NIM: 24060123130076 */


public class kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

      //method
    public kendaraan(String noPLat, String jenis){
        this.noPlat=noPLat;
        this.jenis=jenis;
    }

    public kendaraan(){
        this("","");

    }

    public String getNoPLat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String X){
        this.noPlat=X;
    }

    public void setJenis(String X){
        this.jenis=X;
    }

}
