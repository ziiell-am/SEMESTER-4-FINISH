import java.util.Scanner;

class basicqueue {
    public int index;
	public int [] M;
	public int head = 1;
	public int max = index;
	public int tail = 0;
    public Scanner input;
    public String data;
	public int dataqueue;
    public basicqueue(int s){
        M = new int[s+1];
		index = s;
		input = new Scanner(System.in);
    } 

    public void enqueue(){
        System.out.print("Enqueue data : ");
		data = input.nextLine();
		dataqueue = Integer.parseInt(data);
		tail = tail + 1;
		M[tail] = dataqueue;
		System.out.println("Telah EnQueue Data : "+ M[tail]);
		System.out.println("Status Tail : "+ tail);
    }

    public void swipe(){
        //int temp;
        for (int i=1;i<tail;i++){
            M[i]= M[i+1];
        }
        
    }

    public void dequeue(){
        if (tail > head) {
            System.out.println("Dequeue data : " + M[head]);
            System.out.println("Tail "+tail+" = "+ M[tail]);
            swipe();
            tail = tail -1;
        } else if (tail == head){
            System.out.println("Dequeue data : " + M[head]);
            System.out.println("Tail "+tail+" = "+ M[tail]);
            tail = tail -1;
        } else {
            System.out.println("Dequeue data Failed, Empty Queue");
        }
        
    }
    
}

public class MYQueue {
    public static void main(String[] args) {
        basicqueue OpQueue = new basicqueue(5);

        OpQueue.enqueue();
        OpQueue.enqueue();
        OpQueue.enqueue();
        OpQueue.enqueue();
        OpQueue.enqueue();
        
        OpQueue.dequeue();
        OpQueue.dequeue();
        OpQueue.dequeue();
        OpQueue.dequeue();
        OpQueue.dequeue();
        OpQueue.dequeue();
       

        
    }   
}
