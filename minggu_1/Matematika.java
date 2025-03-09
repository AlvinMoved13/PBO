package minggu_1;

public class Matematika {

    // Metode untuk pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Metode untuk pembagian
    public int pembagian(int a, int b) {
        // Menangani pembagian dengan nol
        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            return 0; // Atau bisa melempar exception
        }
        return a / b;
    }
}
