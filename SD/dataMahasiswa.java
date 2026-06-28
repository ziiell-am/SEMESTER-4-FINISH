class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    String noTelp;
    String tglLahir;
    String prodi;

    Mahasiswa(String nama, String nim, String alamat, String noTelp, String tglLahir, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.tglLahir = tglLahir;
        this.prodi = prodi;
    }

    void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("NIM        : " + nim);
        System.out.println("Alamat     : " + alamat);
        System.out.println("No Telp    : " + noTelp);
        System.out.println("Tgl Lahir  : " + tglLahir);
        System.out.println("Prodi      : " + prodi);
        System.out.println("---------------------------");
    }
}

public class dataMahasiswa {
    public static void main(String[] args) {

        Mahasiswa[] dataMhs = new Mahasiswa[3];

        dataMhs[0] = new Mahasiswa("Ziel", "221001", "Padang", "08123456789", "01-01-2004", "Informatika");
        dataMhs[1] = new Mahasiswa("Budi", "221002", "Jakarta", "08234567890", "02-02-2004", "Sistem Informasi");
        dataMhs[2] = new Mahasiswa("Cici", "221003", "Bandung", "08345678901", "03-03-2004", "Teknik Komputer");

        System.out.println("=== DATA MAHASISWA ===\n");

        for (Mahasiswa dataMh : dataMhs) {
                dataMh.tampilkanData();
            }
        }
    }