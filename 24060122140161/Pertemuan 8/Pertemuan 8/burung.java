/*Nama: Demas Haikal Azizi
 *NIM: 24060122140161
*/

public class burung extends anabul {
    public burung (String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() +" "+ "Bergerak dengan cara teerbang");
    }

    @Override
    public void bersuara(){

        System.out.println(getNama() +" "+ "bersuara : Cuitt");
    }
}
