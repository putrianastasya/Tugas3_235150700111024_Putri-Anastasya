package Karyawan_Package;

public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawai1 = new PegawaiTetap("Andre", "12345678", 3000000);
        PegawaiTetap pegawai4 = new PegawaiTetap("Alexander", "665577448833", 3500000);
        PegawaiTetap pegawai5 = new PegawaiTetap("Marhsa", "110022993388", 4500000);

        PegawaiHarian pegawai2 = new PegawaiHarian("Edo", "0987654321", 10, 25000);
        PegawaiHarian pegawai3 = new PegawaiHarian("Edo", "0987654321", 45, 20000);
        PegawaiHarian pegawai6 = new PegawaiHarian("Anne", "1357924680", 35, 55000);

        Sales sales1 = new Sales("Gracia", "1029384756", 20, 35000);
        Sales sales2 = new Sales("Azel", "2468013579", 44, 49000);
        Sales sales3 = new Sales("Michelle", "1123467890234", 12, 75000);

        pegawai1.display();
        System.out.println();
        pegawai2.display();
        System.out.println();
        pegawai3.display();
        System.out.println();
        sales1.display();
    }
    
}
