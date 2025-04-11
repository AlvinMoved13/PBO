public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok;
    private double tunjangan;
    
    public Pegawai(String nama, String nip, double gajiPokok, double tunjangan) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNip() {
        return nip;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public double getTunjangan() {
        return tunjangan;
    }
}
