
// class Node {
// 	public int data;
// 	public String nama;
// 	public Node next;

// 	public Node(int d, String n) {
// 		data = d;
// 		nama = n;
// 		next = null;
// 	}
// }

class Linklist {
	private Node head, tail, temp;

	public Linklist() {
		head = null;
	}

	public void tambahbelakang(int d, String n) {
		Node baru = new Node(d, n);
		if (head == null) {
			head = baru;
			tail = baru;
		} else {
			tail.next = baru;
			tail = baru;
		}
	}

	public Node hapusbelakang() {
		if (head != null) {
			Node bantu, temp;
			if (head.next == null) {
				temp = head;
				head = tail = null;
			} else {
				bantu = head;
				while (bantu.next != tail) {
					bantu = bantu.next;
				}
				temp = tail;
				tail = bantu;
				tail.next = null;
			}
			return temp;
		} else {
			System.out.println("List Kosong");
			return null;
		}
	}

	public void cetak() {
		temp = head;
		while (temp != null) {
			System.out.println(
					"Data : " + temp.data + " Nama : " + temp.nama);
			temp = temp.next;
		}
	}

}

public class Contohsatu {
	public static void main(String[] args) {

		Linklist list = new Linklist();

		list.tambahbelakang(10, "Ziel");
		list.tambahbelakang(20, "Orion");
		list.tambahbelakang(30, "Fulan");
		System.out.println("Sebelum hapus:");
		list.cetak();

		list.hapusbelakang();

		System.out.println("Sesudah hapus:");
		list.cetak();

	}
}
