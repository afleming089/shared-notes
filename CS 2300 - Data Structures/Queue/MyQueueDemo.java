public class MyQueueDemo {
    public static void main(String[] args) {
        // MyQueue<Integer> q1 = new MyQueue<>();
        MyQueueLL<Integer> q1 = new MyQueueLL<>();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        System.out.println(q1.dequeue()); // 10
        System.out.println(q1.dequeue()); // 20
        System.out.println(q1.dequeue()); // 30
        System.out.println(q1.dequeue()); // 40
        System.out.println(q1.dequeue()); // 50
        System.out.println(q1.dequeue()); // 60
        System.out.println(q1.dequeue()); // null
        q1.enqueue(70);
        q1.enqueue(80);
        System.out.println(q1.dequeue()); // 80
        System.out.println(q1.dequeue()); // 70
    }

}
