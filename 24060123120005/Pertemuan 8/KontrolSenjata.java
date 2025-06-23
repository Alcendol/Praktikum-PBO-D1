/*
 * Nama File : KontrolSenjata.java
 * Deskripsi : Kelas untuk mengontrol aksi senjata—isi peluru, menembak, dan fitur bayonet
 * Pembuat   : Patricia Gabrielle Yudianto
 * Tanggal   : 6 Mei 2025
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public String menusuk() {
        return senjata.isMenusuk()
            ? "Menusuk aktif"
            : "Menusuk belum dipasang";
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
}
