package minggu_1;

// Nama class yang bersifat public harus sesuai dengan nama file
public class Mobil2 {
    // Atribut
    String warna;
    int tahunProduksi;
    String merk;
    boolean isHidup = false; // Status apakah mobil hidup atau mati
    int gigi = 0; // Menunjukkan gigi mobil (0 = netral)

    // Metode untuk menghidupkan mobil
    public void hidupkanMobil() {
        if (!isHidup) {
            isHidup = true;
            System.out.println("Mobil " + merk + " hidup!");
        } else {
            System.out.println("Mobil " + merk + " sudah hidup.");
        }
    }

    // Metode untuk mematikan mobil
    public void matikanMobil() {
        if (isHidup) {
            isHidup = false;
            System.out.println("Mobil " + merk + " dimatikan.");
        } else {
            System.out.println("Mobil " + merk + " sudah mati.");
        }
    }

    // Metode untuk mengubah gigi mobil
    public void ubahGigi(int gigiBaru) {
        if (gigiBaru >= 0 && gigiBaru <= 5) {
            gigi = gigiBaru;
            System.out.println("Gigi mobil " + merk + " sekarang berada di gigi " + gigi);
        } else {
            System.out.println("Gigi tidak valid! Pilih gigi antara 0 sampai 5.");
        }
    }

    // Kelas utama untuk menjalankan program (kamu bisa memanggil main dari sini)
    public static void main(String[] args) {
        // Membuat objek mobil2
        Mobil2 mobil = new Mobil2();
        mobil.warna = "Biru";
        mobil.tahunProduksi = 2015;
        mobil.merk = "Honda";

        // Menampilkan informasi mobil
        System.out.println("Warna mobil: " + mobil.warna);
        System.out.println("Tahun produksi mobil: " + mobil.tahunProduksi);
        System.out.println("Merk mobil: " + mobil.merk);

        // Memanggil metode untuk menghidupkan mobil
        mobil.hidupkanMobil();

        // Memanggil metode untuk mengubah gigi mobil
        mobil.ubahGigi(3);

        // Memanggil metode untuk mematikan mobil
        mobil.matikanMobil();
    }
}
