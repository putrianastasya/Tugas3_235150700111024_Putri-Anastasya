package Karyawan_Package;

public abstract class Karyawan {

    private String nama;
    private String nik;

    Karyawan (String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }

    public abstract double penghasilan();
    
}
