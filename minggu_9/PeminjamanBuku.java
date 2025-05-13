

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

// Subclass 1
class BukuFiksi extends Buku {
    String genre;

    BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Buku: Fiksi");
        System.out.println("Genre: " + genre);
    }
}

// Subclass 2
class BukuNonFiksi extends Buku {
    String bidang;

    BukuNonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Buku: Non-Fiksi");
        System.out.println("Bidang: " + bidang);
    }
}

// Kelas Utama
public class PeminjamanBuku {
    public static void main(String[] args) {
        Buku buku1 = new BukuFiksi("Harry Potter", "J.K. Rowling", "Fantasi");
        Buku buku2 = new BukuNonFiksi("Sapiens", "Yuval Noah Harari", "Sejarah");

        // Polymorphism: objek Buku merujuk ke subclass
        buku1.tampilkanInfo();
        System.out.println();
        buku2.tampilkanInfo();
    }
}
