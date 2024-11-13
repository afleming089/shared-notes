public class MyQueueLL<E> implements QueueInterface<E> {
    SLLNode<E> front = null, rear = null;

    @Override
    public void enqueue(E val) { // O(1)
        SLLNode<E> newNode = new SLLNode<>(val);
        if (rear == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    @Override
    public E dequeue() { // O(1)
        if (front == null)
            return null;
        E temp = front.info;
        front = front.next;
        return temp;
    }

}
