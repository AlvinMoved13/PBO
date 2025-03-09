package minggu_1;

public class Buku {
    // Atribut
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    // Konstruktor untuk menginisialisasi atribut
    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    // Metode untuk menampilkan informasi buku
    public void cetakBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}
