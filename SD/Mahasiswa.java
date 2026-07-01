public class Mahasiswa {
    String nim;
    String nama;
    String alamat;
    String tanggalLahir;
    String tempatLahir;

    public Mahasiswa(String nim, String nama, String alamat, String tanggalLahir, String tempatLahir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
    }

    public void tampilData() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println();
    }

    public static void main(String[] args) {
        Mahasiswa[] dataMahasiswa = new Mahasiswa[3];

        dataMahasiswa[0] = new Mahasiswa(
            "230001",
            "Budi",
            "Malang",
            "12 Januari 2004",
            "Surabaya"
        );

        dataMahasiswa[1] = new Mahasiswa(
            "230002",
            "Sinta",
            "Jakarta",
            "20 Maret 2005",
            "Bandung"
        );

        dataMahasiswa[2] = new Mahasiswa(
            "230003",
            "Andi",
            "Yogyakarta",
            "5 Mei 2004",
            "Malang"
        );

        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i].tampilData();
        }
    }
}