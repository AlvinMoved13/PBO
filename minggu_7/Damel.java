import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Siswa {
    private String nis;
    private String nama;
    private int kelas;
    private double spp;
    private String bulan;
    private int terlambat;
    private double denda;
    private double totalBayar;
    private boolean sudahBayar;

    public Siswa(String nis, String nama, int kelas) {
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
        this.sudahBayar = false;
        
        // Menentukan SPP berdasarkan kelas
        switch (kelas) {
            case 1: this.spp = 200000; break;
            case 2: this.spp = 250000; break;
            case 3: this.spp = 300000; break;
            case 4: this.spp = 350000; break;
            case 5: this.spp = 400000; break;
            case 6: this.spp = 600000; break;
            default: this.spp = 0; break;
        }
    }
    
    public void bayarSPP(String bulan, int terlambat) {
        this.bulan = bulan;
        this.terlambat = terlambat;
        this.denda = 0;
        
        if (terlambat > 0) {
            // Denda 10% dari SPP per bulan keterlambatan
            this.denda = this.spp * 0.1 * terlambat;
        }
        
        this.totalBayar = this.spp + this.denda;
        this.sudahBayar = true;
    }
    
    // Getter dan setter
    public String getNis() { return nis; }
    public String getNama() { return nama; }
    public int getKelas() { return kelas; }
    public double getSpp() { return spp; }
    public String getBulan() { return bulan; }
    public int getTerlambat() { return terlambat; }
    public double getDenda() { return denda; }
    public double getTotalBayar() { return totalBayar; }
    public boolean getSudahBayar() { return sudahBayar; }
}

public class Damel {
    private static ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    
    public static void main(String[] args) {
        boolean lanjut = true;
        
        while (lanjut) {
            tampilkanMenu();
            int pilihan = inputPilihan();
            
            switch (pilihan) {
                case 1:
                    inputDataSiswa();
                    break;
                case 2:
                    bayarSPP();
                    break;
                case 3:
                    tampilkanLaporan();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih [1..4]");
            }
        }
        
        scanner.close();
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n------------------------------");
        System.out.println("1. INPUT DATA SISWA");
        System.out.println("2. BAYAR SPP");
        System.out.println("3. LAPORAN");
        System.out.println("4. KELUAR");
        System.out.println("------------------------------");
        System.out.print("PILIH [1..4] : ");
    }
    
    private static int inputPilihan() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Pilihan tidak valid
        }
    }
    
    private static void inputDataSiswa() {
        System.out.println("\n--- INPUT DATA SISWA ---");
        
        System.out.print("Masukkan NIS: ");
        String nis = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Kelas (1-6): ");
        int kelas = 0;
        try {
            kelas = Integer.parseInt(scanner.nextLine());
            if (kelas < 1 || kelas > 6) {
                System.out.println("Kelas tidak valid. Harus antara 1-6.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input kelas tidak valid!");
            return;
        }
        
        // Cek apakah NIS sudah ada
        for (Siswa s : daftarSiswa) {
            if (s.getNis().equals(nis)) {
                System.out.println("NIS sudah terdaftar!");
                return;
            }
        }
        
        Siswa siswa = new Siswa(nis, nama, kelas);
        daftarSiswa.add(siswa);
        
        System.out.println("Data siswa berhasil ditambahkan!");
    }
    
    private static void bayarSPP() {
        if (daftarSiswa.isEmpty()) {
            System.out.println("\nBelum ada data siswa. Silakan input data siswa terlebih dahulu.");
            return;
        }
        
        System.out.println("\n--- BAYAR SPP SEKOLAH DASAR \"DAMEL MENALAR\" ---");
        
        // Tampilkan daftar siswa
        System.out.println("\nDaftar Siswa:");
        for (int i = 0; i < daftarSiswa.size(); i++) {
            Siswa s = daftarSiswa.get(i);
            System.out.println((i+1) + ". " + s.getNama() + " (Kelas " + s.getKelas() + ")");
        }
        
        System.out.print("\nPilih nomor siswa: ");
        int nomorSiswa = 0;
        try {
            nomorSiswa = Integer.parseInt(scanner.nextLine());
            if (nomorSiswa < 1 || nomorSiswa > daftarSiswa.size()) {
                System.out.println("Nomor siswa tidak valid!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
            return;
        }
        
        Siswa siswa = daftarSiswa.get(nomorSiswa - 1);
        
        if (siswa.getSudahBayar()) {
            System.out.println("Siswa ini sudah melakukan pembayaran SPP!");
            return;
        }
        
        System.out.print("Masukkan Bulan (contoh: Januari): ");
        String bulan = scanner.nextLine();
        
        System.out.print("Terlambat (dalam bulan): ");
        int terlambat = 0;
        try {
            terlambat = Integer.parseInt(scanner.nextLine());
            if (terlambat < 0) {
                System.out.println("Jumlah bulan tidak valid!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
            return;
        }
        
        siswa.bayarSPP(bulan, terlambat);
        
        System.out.println("\n--- DETAIL PEMBAYARAN ---");
        System.out.println("Nama Siswa: " + siswa.getNama());
        System.out.println("Kelas: " + siswa.getKelas());
        System.out.println("Jumlah SPP: " + formatRupiah.format(siswa.getSpp()));
        System.out.println("Terlambat: " + siswa.getTerlambat() + " bulan");
        if (siswa.getTerlambat() > 0) {
            System.out.println("Denda: " + formatRupiah.format(siswa.getDenda()));
        }
        System.out.println("Total Bayar: " + formatRupiah.format(siswa.getTotalBayar()));
        System.out.println("Pembayaran berhasil!");
    }
    
    private static void tampilkanLaporan() {
        System.out.println("\nLaporan Data Pembayaran SPP:");
        System.out.println("Sekolah Dasar \"DAMEL MENALAR\"");
        System.out.println("Laporan data SPP Siswa");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("NO  NAMA SISWA       KELAS    SPP          BULAN       TERLAMBAT       DENDA         TOTAL");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        
        if (daftarSiswa.isEmpty()) {
            System.out.println("Belum ada data siswa.");
        } else {
            int nomor = 1;
            for (Siswa siswa : daftarSiswa) {
                if (siswa.getSudahBayar()) {
                    System.out.printf("%-3d %-16s %-5d %s  %-10s  %-6d BULAN    %s   %s\n",
                            nomor++,
                            siswa.getNama(),
                            siswa.getKelas(),
                            formatRupiah.format(siswa.getSpp()),
                            siswa.getBulan(),
                            siswa.getTerlambat(),
                            formatRupiah.format(siswa.getDenda()),
                            formatRupiah.format(siswa.getTotalBayar()));
                } else {
                    System.out.printf("%-3d %-16s %-5d %s  %-10s  %s    %s   %s\n",
                            nomor++,
                            siswa.getNama(),
                            siswa.getKelas(),
                            formatRupiah.format(siswa.getSpp()),
                            "-",
                            "-",
                            "-",
                            "-");
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    }
}