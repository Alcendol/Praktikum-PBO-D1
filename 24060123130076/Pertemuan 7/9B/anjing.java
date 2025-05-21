/*Nama: Muhammad Helmi Abdulbaqi 
 *NIM: 2406012313076
*/

public class anjing extends anabul {
    public anjing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() +" "+ "Bergerak dengan cara melata");
    }

    @Override 
    public void bersuara(){
        System.out.println(getNama() +" "+ "Bersuara : Guk-Guk");
    }
}
