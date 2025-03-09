public class SepedaDemo {
    public static void main(String[] args) {
        // Membuat objek sepeda
        Sepeda sepedaSaya = new Sepeda("Polygon", "Gunung", "Hitam");

        // Menampilkan informasi sepeda
        System.out.println("Informasi sepeda sebelum perubahan warna:");
        sepedaSaya.tampilkanInfo();

        // Mengubah warna sepeda
        sepedaSaya.ubahWarna("Merah");

        // Menampilkan informasi sepeda setelah warna diubah
        System.out.println("\nInformasi sepeda setelah perubahan warna:");
        sepedaSaya.tampilkanInfo();
    }
}
