import java.util.Scanner;

class UtilStack {
	public int[] M;
	public int top = 0;
	public int index;
	public String data;
	public int datastack;
	public Scanner input;

	public UtilStack(int s) {
		M = new int[s];
		index = s;
		input = new Scanner(System.in);
	}

	public void PushStack() {
		System.out.print("Push data : ");
		data = input.nextLine();
		datastack = Integer.parseInt(data);
		top = top + 1;
		M[top] = datastack;
		System.out.println("Telah Push data : " + M[top]);
		System.out.println("Status Top : " + top);
	}

	public void PopStack() {
		if (top == 0) {
			System.out.println("Stack telah kosong");
		} else {
			int dataKeluar = M[top];
			top = top - 1;
			System.out.println("Telah Pop data : " + dataKeluar);
			System.out.println("Status Top : " + top);
		}
	}
}

public class Stack {
	public static void main(String[] args) {
		UtilStack myStack = new UtilStack(20);
		myStack.PopStack();
	}
}