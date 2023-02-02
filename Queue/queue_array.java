package Queue;
class Queue1{
	int arr[];
	int topofqueue;
	int beginingofqueue;
	
	public Queue1(int size) {
		arr=new int[size];
		topofqueue=-1;
		beginingofqueue=-1;
	    System.out.println("Successfully created queue");
	}
	
	public boolean isFull() {
		if(topofqueue==arr.length-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(beginingofqueue==-1||beginingofqueue==arr.length) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else if(isEmpty()) {
			beginingofqueue=0;
			topofqueue++;
			arr[topofqueue]=value;
		}
		else {
			topofqueue++;
			arr[topofqueue]=value;
		}
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("No more elements to delete");
		}
		else {
			beginingofqueue++;
			if(beginingofqueue>topofqueue) {
				beginingofqueue=topofqueue=-1;
			}
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr[topofqueue];
	}
	
	public void delete() {
		arr=null;
		System.out.println("Queue got deleted");
	}
	
}


public class queue_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 q=new Queue1(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.dequeue();
		q.delete();

	}

}
