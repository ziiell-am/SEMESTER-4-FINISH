import java.io.*;

public class infofile {
    public static void main(String[] args) {
        File file = new File("tipe data.png");
        System.out.println("Apakah file ini ada? " + file.exists());
        System.out.println("File memiliki " + file.length() + " byte");
        System.out.println("Dapatkah file ini dibaca? " + file.canRead());
        System.out.println("Dapatkah file ini ditulis? " + file.canWrite());
        System.out.println("Apakah ini direktori? " + file.isDirectory());
        System.out.println("Apakah ini suatu file? " + file.isFile());
        System.out.println("Apakah ini nama absolut? " + file.isAbsolute());
        System.out.println("Apakah file ini hidden? " + file.isHidden());
        System.out.println("Absolute path adalah " + file.getAbsolutePath());
        System.out.println("Terakhir kali dimodifikasi " + new java.util.Date(file.lastModified()));
    }
}
