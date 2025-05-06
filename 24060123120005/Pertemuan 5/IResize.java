/*  
    Nama File : IResize.java  
    Deskripsi : Interface yang merepresentasikan kemampuan untuk mengubah ukuran suatu objek
                dengan fungsi zoomIn, zoomOut, dan zoom 
    Pembuat   : Patricia Gabrielle Yudianto  
    NIM       : 24060123120005  
    Tanggal   : 22 Maret 2025  
*/
public interface IResize {
    public void zoomIn();

    public void zoomOut();

    public void zoom(int percent);
}