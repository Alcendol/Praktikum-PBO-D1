package latihanMedium;

public class KontrolSenjata {
    
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal Menembak, Peluru Habis");
            }
        }
    }

    public int getSisaPeluru() {
        return senjata.getPeluru();
    }
    
}