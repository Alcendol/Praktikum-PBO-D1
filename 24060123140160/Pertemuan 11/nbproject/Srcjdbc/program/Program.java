package ondi.program;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author ondisihom
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println();

        System.out.println("=== Insert ===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd);
        displayAll();

        System.out.println("=== Update ===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("Dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        System.out.println("=== Delete ===");
        System.out.println("Akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    static void displayAll() {
        List<Mahasiswa> listMhs = service.getAll();
        System.out.println("=== Display All ===");
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
    }
}
