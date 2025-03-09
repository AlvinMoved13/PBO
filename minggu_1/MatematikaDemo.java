package minggu_1;

public class MatematikaDemo {
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();

        // Menampilkan hasil operasi matematika
        System.out.println("Pertambahan: 20 + 20 = " + matematika.pertambahan(20, 20));
        System.out.println("Pengurangan: 10 - 5 = " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian: 10 x 20 = " + matematika.perkalian(10, 20));
        System.out.println("Pembagian: 20 / 2 = " + matematika.pembagian(20, 2));
    }
}
