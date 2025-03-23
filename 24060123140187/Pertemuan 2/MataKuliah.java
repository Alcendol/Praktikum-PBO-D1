/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class Mata Kuliah
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 26 Februari 2025
 * */

package pertemuanDua;

    public class MataKuliah {
        private String idMatKul;
        private String nama;
        private int sks;
    
        public MataKuliah(){
            this.idMatKul = "";
            this.sks = 0;
            this.nama = "";
        }
    
        public MataKuliah(String idMatKul,String nama,int sks){
            this.idMatKul = idMatKul;
            this.sks = sks;
            this.nama = nama;
        }
    
        //getter (selektor)
        public String getidMatKul(){
            return idMatKul;
        }
    
        public String getnama(){
            return nama;
        }
    
        public int getsks(){
            return sks;
        }
    
        //setter (mutator)
        public void setidMatKul(String idMatKul){
            this.idMatKul = idMatKul;
        }
        
        public void setsks(int sks){
            this.sks = sks;
        }
    
        public void setnama(String nama){
            this.nama = nama;
        }
    }    
