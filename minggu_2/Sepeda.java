package PBO.minggu_2;

public class Sepeda {
    // Atribut
    private int tahun;
    private String warna;
    private int gigi;

    // Konstruktor
    public Sepeda(int tahun, String warna, int gigi) {
        this.tahun = tahun;
        this.warna = warna;
        this.gigi = gigi;
    }

    // Getter dan Setter
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getGigi() {
        return gigi;
    }

    public void setGigi(int gigi) {
        this.gigi = gigi;
    }

    // Fungsi untuk perpindahan gigi
    public void pindahGigi(int gigiBaru) {
        if (gigiBaru > 0 && gigiBaru <= 7) { // Misalnya, sepeda hanya memiliki 7 gigi
            this.gigi = gigiBaru;
            System.out.println("Perpindahan gigi berhasil. Gigi sekarang: " + gigi);
        } else {
            System.out.println("Gigi tidak valid. Gigi harus antara 1 dan 7.");
        }
    }

    // Menampilkan informasi sepeda
    public void tampilkanInfo() {
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
        System.out.println("Gigi: " + gigi);
    }

    // Fungsi tambah
    public int tambah(int angka) {
        return this.gigi + angka;
    }

    // Fungsi kurang
    public int kurang(int angka) {
        return this.gigi - angka;
    }

    // Fungsi kali
    public int kali(int angka) {
        return this.gigi * angka;
    }

    // Fungsi bagi
    public double bagi(int angka) {
        if (angka != 0) {
            return (double) this.gigi / angka;
        } else {
            System.out.println("Tidak dapat membagi dengan nol!");
            return 0;
        }
    }

    // Fungsi utama (main)
    public static void main(String[] args) {
        // Membuat objek sepeda
        Sepeda sepedaSaya = new Sepeda(2022, "Merah", 3);

        // Menampilkan informasi sepeda
        sepedaSaya.tampilkanInfo();

        // Perpindahan gigi
        sepedaSaya.pindahGigi(5);
        sepedaSaya.tampilkanInfo();

        // Menggunakan fungsi tambah, kurang, kali, bagi
        System.out.println("Tambah 2: " + sepedaSaya.tambah(2));
        System.out.println("Kurang 1: " + sepedaSaya.kurang(1));
        System.out.println("Kali 4: " + sepedaSaya.kali(4));
        System.out.println("Bagi 2: " + sepedaSaya.bagi(2));
        System.out.println("Bagi 0: " + sepedaSaya.bagi(0));
    }
}
