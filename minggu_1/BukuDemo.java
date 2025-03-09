// Class Buku
class Buku {
    // Deklarasi variabel
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    // Konstruktor Buku dengan parameter
    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    // Method untuk mencetak informasi buku
    public void cetakBuku() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahun);
        System.out.println();
    }
}

// Class BukuDemo untuk menampilkan 2 buku
public class BukuDemo {
    public static void main(String[] args) {
        // Membuat objek buku pertama
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        
        // Membuat objek buku kedua
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        
        // Mencetak informasi buku pertama
        buku1.cetakBuku();
        
        // Mencetak informasi buku kedua
        buku2.cetakBuku();
    }
}
