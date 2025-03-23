/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 26 Februari 2025
 * */

package pertemuanDua;

    public class Kendaraan {
        //atribut 
        private String noPlat;
        private String jenis;
    
        //konstruktor 
        public Kendaraan(){
            this.noPlat = "";
            this.jenis = "";
        }
    
        public Kendaraan(String noPlat,String jenis){
            this.noPlat = noPlat;
            this.jenis = jenis;
        }
    
        //getter 
        public String getnoPlat(){
            return noPlat;
        }
    
        public String getjenis(){
            return jenis;
        }
        
        //setter 
        public void setnoPlat(String noPlat){
            this.noPlat = noPlat;
        }
    
        public void setjenis(String jenis){
            this.jenis = jenis;
        }
    }
    
