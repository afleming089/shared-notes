public class MyStack<E> implements StackInterfaces<E> {
    E[] elements;
    int numElements;

    private boolean isFull() {
        return numElements == elements.length;
    }

    private void enlarge() { // O(elements.length)
        E[] newArr = (E[]) new Object[2 * elements.length]; // want E because you will need to copy every time if
        // just
        // add one index
        for (int i = 0; i < numElements; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }

    @SuppressWarnings("unchecked")
    public MyStack() {
        elements = (E[]) new Object[5];
        numElements = 0;
    }

    public void push(E val) {
        if (isFull())
            enlarge();
        elements[numElements++] = val;
    }

    public E pop() {
        if (numElements == 0)
            return null;
        return elements[--numElements];
    }

    public E peek() {
        if (numElements == 0)
            return null;
        return elements[numElements - 1];
    }

}
