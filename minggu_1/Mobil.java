package minggu_1;

// Nama class harus sama dengan nama file dan menggunakan PascalCase
public class Mobil {
    String warna;
    int tahunProduksi;
    String merk;
}

public class MobilDemo {
    public static void main(String[] args) {
        // Menggunakan class Mobil yang sudah diperbaiki
        Mobil mobil = new Mobil();
        mobil.warna = "Merah";
        mobil.tahunProduksi = 2010;
        mobil.merk = "Toyota";
        
        System.out.println("Warna mobil: " + mobil.warna);
        System.out.println("Tahun produksi mobil: " + mobil.tahunProduksi);
        System.out.println("Merk mobil: " + mobil.merk);
    }
}
