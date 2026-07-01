public class Mahasiswa2D {
    public static void main(String[] args) {
        Mahasiswa[][] dataMahasiswa = new Mahasiswa[2][3];

        dataMahasiswa[0][0] = new Mahasiswa("230001", "Budi", "Malang", "12 Januari 2004", "Surabaya");
        dataMahasiswa[0][1] = new Mahasiswa("230002", "Sinta", "Jakarta", "20 Maret 2005", "Bandung");
        dataMahasiswa[0][2] = new Mahasiswa("230003", "Andi", "Yogyakarta", "5 Mei 2004", "Malang");

        dataMahasiswa[1][0] = new Mahasiswa("230004", "Dewi", "Semarang", "8 Juni 2004", "Solo");
        dataMahasiswa[1][1] = new Mahasiswa("230005", "Rudi", "Surabaya", "15 Oktober 2003", "Surabaya");
        dataMahasiswa[1][2] = new Mahasiswa("230006", "Lina", "Bandung", "22 Desember 2004", "Jakarta");

        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("========== Kelas " + (char)('A' + i) + " ==========");
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.println("Mahasiswa ke-" + (j + 1) + ":");
                dataMahasiswa[i][j].tampilData();
            }
        }
    }
}
