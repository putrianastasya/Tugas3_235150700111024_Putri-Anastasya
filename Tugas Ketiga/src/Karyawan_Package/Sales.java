package Karyawan_Package;

public class Sales extends Karyawan {

    private int jumlahPenjualan;
    private double komisi;

    public Sales (String nama, String nik, int jumlahPenjualan, double komisi){
        super(nama, nik);
        this.jumlahPenjualan = jumlahPenjualan;
        this.komisi = komisi;

    }

    public int getJumlahPenjualan() {
        return jumlahPenjualan;
    }

    public void setJumlahPenjualan(int jumlahPenjualan) {
        this.jumlahPenjualan = jumlahPenjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double penghasilan(){
        return komisi*jumlahPenjualan;

    }
    public void display() {
        System.out.printf("%-20s: %s%n", "Sales", getNama());
        System.out.printf("%-20s: %s%n", "No KTP", getNik());
        System.out.printf("%-20s: %d%n", "Total Penjualan", getJumlahPenjualan());
        System.out.printf("%-20s: Rp%,.2f%n", "Komisi", getKomisi());
        System.out.printf("%-20s: Rp%,.2f%n", "Pendapatan", penghasilan());
    }
    
}
