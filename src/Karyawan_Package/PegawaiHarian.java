package Karyawan_Package;

public class PegawaiHarian extends Karyawan{

    private double jamKerja;
    private double upahPerJam;

    public PegawaiHarian(String nama, String nik, double jamKerja, double upahPerJam){
        super(nama,nik);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;

    }

    public double getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(double jamKerja) {
        this.jamKerja = jamKerja;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    
    
    public double penghasilan(){
        if (jamKerja<=40){
            return  jamKerja*upahPerJam;
        }else {
            return 40*upahPerJam+ (jamKerja-40)*upahPerJam*1.5;
        }
    }


    public void display() {
        System.out.printf("%-20s: %s%n", "Pegawai Harian", getNama());
        System.out.printf("%-20s: %s%n", "No KTP", getNik());
        System.out.printf("%-20s: Rp%,.2f%n", "Upah per Jam", getUpahPerJam());
        System.out.printf("%-20s: %.1f%n", "Total Jam Kerja", getJamKerja());
        System.out.printf("%-20s: Rp%,.2f%n", "Pendapatan", penghasilan());
    }


}
