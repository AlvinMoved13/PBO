package minggu_1;

public class BukuDemo {
    public static void main(String[] args) {
        // Membuat objek buku pertama
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        
        // Membuat objek buku kedua
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        
        // Menampilkan informasi buku pertama
        System.out.println("Buku 1:");
        buku1.cetakBuku();
        
        // Menampilkan informasi buku kedua
        System.out.println("Buku 2:");
        buku2.cetakBuku();
    }
}
