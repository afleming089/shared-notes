public class MyBST<E> {
    BSTNode<E> root = null;

    void add(E val) {
        root = addHelper(root, val);
    }

    @SuppressWarnings("unchecked")
    BSTNode<E> addHelper(BSTNode<E> node, E val) {
        if (node == null) {
            return new BSTNode<E>(val);
        }
        if (((Comparable) val).compareTo(node.info) <= 0)
            node.left = addHelper(node.left, val);
        else
            node.right = addHelper(node.right, val);

        return node;
    }

    BSTNode<E> search(E val) {

        return searchHelper(root, val);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    BSTNode<E> searchHelper(BSTNode<E> node, E val) {
        if (node == null)
            return null;
        if (val.equals(node.info))
            return node;
        if (((Comparable) val).compareTo(node.info) < 0)
            return searchHelper(node.left, val);
        return searchHelper(node.right, val);
    }

    void remove(E val) {

    }

    E min() {
        BSTNode<E> node = root;
        if (node == null)
            return null;

        while (node.left != null) {
            node = node.left;
        }

        return node.info;
    }

    // orders and traversal
    void treeTraverse() {
        System.out.println("Pre order");
        PreOrder(root);
        System.out.println("\nIn order");
        InOrder(root);
        System.out.println("\nPost order");
        PostOrder(root);

    }

    void PreOrder(BSTNode<E> node) {
        if (node == null)
            return;

        System.out.print(node.info + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    void InOrder(BSTNode<E> node) {
        if (node == null)
            return;

        InOrder(node.left);
        System.out.print(node.info + " ");
        InOrder(node.right);
    }

    void PostOrder(BSTNode<E> node) {
        if (node == null)
            return;

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.info + " ");
    }

}