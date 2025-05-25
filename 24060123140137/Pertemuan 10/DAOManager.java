/*
 * Nama File : DAOManager.java
 * Deskripsi : Menyimpan referensi ke implementasi PersonDAO dan
 *             menyediakan setter-getter sederhana.
 * Pembuat   : Noval Putra Barliyanda / 24060123140137
 * Tanggal   : 20 Mei 2025
 */
public class DAOManager {

    private PersonDAO daoPerson; 

 
    public void setPersonDAO(PersonDAO dao) {
        daoPerson = dao;
    }

 
    public PersonDAO getPersonDAO() {
        return daoPerson;
    }
}