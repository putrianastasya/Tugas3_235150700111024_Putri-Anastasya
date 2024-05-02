package Karyawan_Package;

public class PegawaiTetap extends Karyawan{

    private double gajiBulanan;

    public PegawaiTetap (String nama, String nik, double gajiBulanan){
        super(nama, nik);
        this.gajiBulanan = gajiBulanan;
    }

    public double getGajiBulanan() {
        return gajiBulanan;
    }

    public void setGajiBulanan(double gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    public double penghasilan() {
        return gajiBulanan;
    }

    public void display() {
        System.out.printf("%-20s: %s%n", "Pegawai Tetap", getNama());
        System.out.printf("%-20s: %s%n", "No KTP", getNik());
        System.out.printf("%-20s: Rp%,.2f%n", "Gaji Bulanan", getGajiBulanan());
        System.out.printf("%-20s: Rp%,.2f%n", "Pendapatan", penghasilan());
    }
    
}
