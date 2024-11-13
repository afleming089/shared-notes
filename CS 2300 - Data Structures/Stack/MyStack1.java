import java.util.ArrayList;

public class MyStack1<E> implements StackInterfaces<E> {
    ArrayList<E> elements;

    @SuppressWarnings("unchecked")
    public MyStack1() {
        elements = new ArrayList<>();
    }

    public void push(E val) {
        elements.add(val);
    }

    public E pop() {
        if (elements.size() == 0)
            return null;
        return elements.remove(elements.size() - 1);
    }

    public E peek() {
        if (elements.size() == 0)
            return null;
        return elements.get(elements.size() - 1);
    }

}
