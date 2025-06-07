public class ArrayQueue {
    int[] queue = new int[100]; 
    int front = -1, rear = -1;
    public void enqueue(int data) {
        if (rear == 99) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear++;
        queue[rear] = data;
    }
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        front++;
    }
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(40);
        q.enqueue(50);
        q.display();
    }
}
