import java.util.ArrayList;

public class MyStack2<E> extends ArrayList<E> implements StackInterfaces<E> {

    @SuppressWarnings("unchecked")
    public MyStack2() {

    }

    public void push(E val) {
        add(val);
    }

    public E pop() {
        return null;
    }

    public E peek() {
        return null;
    }

}
