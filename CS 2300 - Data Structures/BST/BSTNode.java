public class BSTNode<E> {
    E info;
    BSTNode<E> left, right;

    public BSTNode(E val) {
        info = val;
        left = right = null;
    }
}