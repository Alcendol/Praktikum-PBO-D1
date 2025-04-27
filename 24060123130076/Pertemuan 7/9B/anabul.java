/*Nama: Muhammad Helmi Abdulbaqi 
 *NIM: 2406012313076
*/

public abstract class anabul {
    protected String nama;

    public anabul (String nama){
        this.nama = nama;
    }

    //getter 
    public String getNama(){
        return nama;
    }
    
    //setter 
    public void setNama(String nama){
        this.nama = nama;
    }

    //method 
    public abstract void gerak();
    public abstract void bersuara();
}