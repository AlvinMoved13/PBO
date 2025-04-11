public class Gaji extends Pegawai {
    private int jamLembur;
    private double upahPerJam;
    private double bonus;
    
    public Gaji(String nama, String nip, double gajiPokok, double tunjangan, 
                int jamLembur, double upahPerJam, double bonus) {
        super(nama, nip, gajiPokok, tunjangan);
        this.jamLembur = jamLembur;
        this.upahPerJam = upahPerJam;
        this.bonus = bonus;
    }
    
    public double hitungLembur() {
        return jamLembur * upahPerJam;
    }
    
    public double hitungTotalGaji() {
        return getGajiPokok() + getTunjangan() + hitungLembur() + bonus;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji Pokok: Rp." + getGajiPokok());
        System.out.println("Tunjangan: Rp." + getTunjangan());
        System.out.println("Lembur: Rp." + hitungLembur());
        System.out.println("Bonus: Rp." + bonus);
        System.out.println("Total Gaji: Rp." + hitungTotalGaji());
    }
}
