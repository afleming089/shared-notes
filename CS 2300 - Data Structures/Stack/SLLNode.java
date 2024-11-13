/**
 * SLLNode
 * Single linked list
 */
public class SLLNode<E> { // singly linked list node
    // points [10] -> [20] -> [30] -> [null]
    E info;
    SLLNode<E> next;

    public SLLNode(E val) {
        info = val;
        next = null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "SLLNode(" + info + ")";
    }

    // @Override
    // public String toString() {
    // String str = "";
    // while (next != null) {
    // str = info.toString();
    // }

    // return str;
    // }
}