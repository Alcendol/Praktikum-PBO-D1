import java.util.HashMap;

public class MahasiswaList {
    public static void main(String[] args) {
        
        HashMap<Integer, String> mahasiswa = new HashMap<>();

        mahasiswa.put(1, "Budi");
        mahasiswa.put(2, "Siti");
        mahasiswa.put(3, "Andi");
        mahasiswa.put(4, "Dewi");
        mahasiswa.put(5, "Joko");


        // Menggunakan lambda untuk mencetak nama mahasiswa
        // for (var key : mahasiswa.keySet()) {
        //     System.out.println("ID: " + key+ ", Nama: " + mahasiswa.get(key));
        // }
        mahasiswa   .keySet().forEach(key -> {
            System.out.println("Nama :  " + mahasiswa.get(key) );
        });

    }

}
