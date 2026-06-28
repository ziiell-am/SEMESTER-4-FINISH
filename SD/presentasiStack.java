import java.util.Stack;

public class presentasiStack {
    public static void main(String[] args) {
        Stack<String> buku = new Stack<>();

        buku.push("Buku A");
        buku.push("Buku B");
        buku.push("Buku C");

        System.out.println("Isi Stack: " + buku);
        System.out.println("Data Teratas: " + buku.peek());
        System.out.println("Data Dihapus: " + buku.pop());
        System.out.println("Setelah Pop: " + buku);
    }
}