package pratikum5.Latihan4;

import java.util.Scanner;

public class Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        size++;
        System.out.println(item + " inserted to queue");
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(item + " removed from queue");
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = queueArray[front];
        System.out.println("Front element = " + item);
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        System.out.println("Size = " + size);
        return size;
    }

    public void display() {
        System.out.print("Queue = ");
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % capacity;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline
        
        Queue queue = new Queue(capacity);
    
        char choice;
        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. tambah");
            System.out.println("2. hapus");
            System.out.println("3. peek");
            System.out.println("4. cek kosong");
            System.out.println("5. check full");
            System.out.println("6. size");
            System.out.print("\npilihan  ");
    
            int operation = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline setelah nextInt()
    
            switch (operation) {
                case 1:
                    System.out.print("Masukan data: ");
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    queue.insert(value);
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    System.out.println("Queue empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue full? " + queue.isFull());
                    break;
                case 6:
                    queue.size();
                    break;
                default:
                    System.out.println("pilihan invalid");
            }
            
            queue.display();
            
            System.out.print("\nmau lanjut atau tidak ");
            choice = scanner.nextLine().charAt(0);
        } while (Character.toLowerCase(choice) == 'y');
        
        scanner.close();
    }
}