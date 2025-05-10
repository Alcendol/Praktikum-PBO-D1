/*Nama: Muhammad Helmi Abdulbaqi 
 *NIM: 2406012313076
*/

public abstract class anabul {
    protected String nama;

    public anabul (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}