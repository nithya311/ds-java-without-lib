public class Queue {
private int queue[];
private int front;
private int rear;
private int size;
private int top;

public Queue(int size) {
this.size = size;
queue = new int[this.size];
front = 0;
rear = 0;
}

public boolean enqueue(int n) {
if(!isFull()) {
queue[front] = n;
front = (front +1) % size;
return true;
}
else
return false;
}

public int dequeue() {
int item = queue[rear];
rear = (rear + 1) % size;
return item;
}

public boolean isEmpty() {
if(front == 0 && rear == 0) {
return true;
}
else
return false;
}

public boolean isFull() {
if(front == size)
return true;
else
return false;
}

public static void main(String args[]) {
Queue q = new Queue(3);
System.out.println(q.isEmpty());
boolean elem = q.enqueue(1);
System.out.println(elem);
elem = q.enqueue(2);
System.out.println(elem);
elem = q.enqueue(3);
System.out.println(elem);
System.out.println(q.isFull());

int x = q.dequeue();
System.out.println(x);
}
}










 



