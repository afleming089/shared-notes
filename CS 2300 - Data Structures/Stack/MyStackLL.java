public class MyStackLL<E> implements StackInterfaces<E> {
    SLLNode<E> top;

    public void push(E val) {
        SLLNode<E> newNode = new SLLNode<E>(val);
        newNode.next = top;
        top = newNode;
    }

    public E pop() {
        if (top == null)
            return null;
        E temp = top.info;
        top = top.next;
        return temp;
    }

    public E peek() {
        if (top == null)
            return null;
        return top.info;
    }

}
