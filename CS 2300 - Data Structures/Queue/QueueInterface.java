public interface QueueInterface<E> {
    void enqueue(E val);

    E dequeue();
}