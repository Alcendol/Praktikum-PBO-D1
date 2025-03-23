/*
    Nama File : ExceptionOnArray.java
    Deskripsi : Program penggunaan eksepsi menggunakan class library Java
    Pembuat   : Patricia Gabrielle Yudianto
    Tanggal   : 9 Maret 2025
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[3] = 10;
            double coba = 7 / 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up clode . . .");
        }
    }
}
