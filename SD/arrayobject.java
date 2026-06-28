class mydata {
    public String nama;
    public String nim;
    public String alamat;
    public String noTelp;
    public String tglLahir;
    public String prodi;
}

public class arrayobject {
    public static void main(String[] args) {
        mydata[] dataMhs = new mydata[3];
        dataMhs[1] = new mydata();
        dataMhs[1].nama = "Ziel";

        System.out.println(dataMhs[1].nama);
    }
}