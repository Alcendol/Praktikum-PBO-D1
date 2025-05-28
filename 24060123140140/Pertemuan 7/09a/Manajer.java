class Manajer extends Pegawai {
    private final int tunjangan = 700000;
    
    // Constructor
    public Manajer(String nama) {
        super(nama);
    }
    
    // Override method tampilData untuk menambahkan informasi tunjangan
    @Override
    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}

// Kelas Programmer yang merupakan turunan dari Pegawai
class Programmer extends Pegawai {
    private final int bonus = 450000;
    
    // Constructor
    public Programmer(String nama) {
        super(nama);
    }
    
    // Override method tampilData untuk menambahkan informasi bonus
    @Override
    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
        System.out.println("Bonus : " + this.bonus);
    }
}