public class MyQueue<E> implements QueueInterface<E> {
    E[] elements;
    int front, rear, numElements;

    @SuppressWarnings("unchecked")
    public MyQueue() { // O(1)
        elements = (E[]) new Object[5];
        front = 0;
        rear = -1;
        numElements = 0;
    }

    private boolean isFull() {
        return numElements == elements.length;
    }

    private void enlarge() { // O(elements.length)

        E[] newArr = (E[]) new Object[2 * elements.length]; // want E because you will need to copy every time if
        // just
        // add one index
        for (int i = 0, j = front; i < numElements; i++, j = (j + 1) % elements.length)
            newArr[i] = elements[j];
        elements = newArr;
        front = 0;
        rear = numElements - 1;
    }

    public void enqueue(E val) { // o(1) ~ o(eLements.length)
        // rear++;
        // if (rear == elements.length)
        // rear = 0;
        if (isFull())
            enlarge();

        rear = (rear + 1) % elements.length;
        elements[rear] = val;
        numElements++;
    }

    public E dequeue() {
        if (numElements == 0)
            return null;

        E temp = elements[front];
        front = (front + 1) % elements.length;
        numElements--;
        return temp;
    }
}