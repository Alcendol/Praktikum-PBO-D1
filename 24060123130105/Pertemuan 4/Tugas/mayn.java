import java.time.LocalDate;
public class mayn {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("123456789", "Budi", LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1), 10000000, "123456789", "Fakultas Teknik");
        dosenTetap.printInfo();
        System.out.println();
        DosenTamu dosenTamu = new DosenTamu("312654987", "Tahalu", LocalDate.of(1992, 2, 1), LocalDate.of(2010, 5, 10) ,3000000, "654312987", "Fakultas Teknik", LocalDate.of(2021, 1, 1));
        dosenTamu.printInfo();
        System.out.println();
        Tendik tendik = new Tendik("987654321", "Rahmat", LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1), 10000000, "Administrasi");
        tendik.printInfo();
    }
}
