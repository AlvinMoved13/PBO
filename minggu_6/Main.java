import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Program Penggajian Pegawai ===");
        System.out.print("Nama Pegawai: ");
        String nama = input.nextLine();
        
        System.out.print("NIP: ");
        String nip = input.nextLine();
        
        System.out.print("Gaji Pokok: ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Tunjangan: ");
        double tunjangan = input.nextDouble();
        
        System.out.print("Jam Lembur: ");
        int jamLembur = input.nextInt();
        
        System.out.print("Upah Lembur per Jam: ");
        double upahPerJam = input.nextDouble();
        
        System.out.print("Bonus: ");
        double bonus = input.nextDouble();
        
        System.out.println("\n=== Hasil Perhitungan Gaji ===");
        Gaji pegawai = new Gaji(nama, nip, gajiPokok, tunjangan, jamLembur, upahPerJam, bonus);
        pegawai.tampilkanInfo();
        
        input.close();
    }
}
