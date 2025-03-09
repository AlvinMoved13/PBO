// Class Sepeda
public class Sepeda {
    // Atribut
    private String merk;
    private String jenis;
    private String warna;

    // Konstruktor
    public Sepeda(String merk, String jenis, String warna) {
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
    }

    // Metode untuk menampilkan informasi sepeda
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
    }

    // Metode untuk mengubah warna sepeda
    public void ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna sepeda telah diubah menjadi " + warnaBaru);
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek sepeda
        Sepeda sepedaSaya = new Sepeda("Polygon", "Gunung", "Hitam");

        // Menampilkan informasi sepeda
        sepedaSaya.tampilkanInfo();

        // Mengubah warna sepeda
        sepedaSaya.ubahWarna("Merah");

        // Menampilkan informasi sepeda setelah warna diubah
        sepedaSaya.tampilkanInfo();
    }
}
