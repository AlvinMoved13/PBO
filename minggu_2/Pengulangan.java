public class Pengulangan {
    
    // Method untuk mencetak pola pengulangan
    public static void cetakPengulangan(int bilangan) {
        // Melakukan loop sebanyak bilangan
        for (int i = 1; i <= bilangan; i++) {
            // Mencetak angka i, sebanyak i kali
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Cetak angka i
            }
            System.out.println(); // Pindah ke baris berikutnya setelah selesai mencetak
        }
    }
    
    public static void main(String[] args) {
        // Mencetak pengulangan hingga bilangan ke 5
        cetakPengulangan(5);
    }
}
