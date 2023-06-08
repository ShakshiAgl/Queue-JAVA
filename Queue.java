//implementation by using linked lists

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    // constructor for the class
    Queue() {
        // -1 denotes empty queue
        front = -1;
        rear = -1;
    }

    // method to check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    // method to check if the queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }

    }

    // method to add elements in the queue
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert" + element);
        }
    }

    // method to delete elments in the queue
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + "Deleted");
            return (element);

        }
    }

    // method to display the results
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println(" Empty Queue");
        } else {
            System.out.println("Front is at " + front);
            System.out.println("Items->");
            for (i = front; i <= rear; i++)
                System.out.println(items[i] + " ");
            System.out.println("Rear is at " + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.deQueue();
        for (int i = 1; i < 6; i++) {
            q.enQueue(i);
        }
        q.display();
        q.deQueue();
        q.display();
    }
}
