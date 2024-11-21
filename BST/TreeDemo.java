public class TreeDemo {
    static void treeTraverse(BSTNode<Integer> node) {
        System.out.println("Pre order");
        PreOrder(node);
        System.out.println("\nIn order");
        InOrder(node);
        System.out.println("\nPost order");
        PostOrder(node);

    }

    static void PreOrder(BSTNode<Integer> node) {
        if (node == null)
            return;

        System.out.print(node.info + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    static void InOrder(BSTNode<Integer> node) {
        if (node == null)
            return;

        InOrder(node.left);
        System.out.print(node.info + " ");
        InOrder(node.right);
    }

    static void PostOrder(BSTNode<Integer> node) {
        if (node == null)
            return;

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.info + " ");
    }

    static Integer min(BSTNode<Integer> node) {
        if (node == null)
            return null;

        while (node.left != null) {
            node = node.left;
        }

        return node.info;
    }

    public static void main(String[] args) {
        BSTNode<Integer> node1 = new BSTNode<>(10);
        BSTNode<Integer> node2 = new BSTNode<>(20);
        BSTNode<Integer> node3 = new BSTNode<>(30);
        BSTNode<Integer> node4 = new BSTNode<>(40);
        BSTNode<Integer> node5 = new BSTNode<>(50);

        node2.left = node1;
        node2.right = node4;
        node4.left = node3;
        node4.right = node5;

        treeTraverse(node2);
        // pre order 20 10 40 30 50 root left right
        // in order 10 20 30 40 50 left root right
        // post order 10 30 50 40 20 left right root

        BSTNode<Integer> node6 = new BSTNode<>(60);
        BSTNode<Integer> node7 = new BSTNode<>(70);

        node5.left = node2;
        node5.right = node7;
        node2.left = node1;
        node2.right = node4;
        node7.left = node6;
        node4.left = node3;
        node4.right = null;

        System.out.println("\n");
        treeTraverse(node5);
        // pre order 50 20 10 40 30 70 60 root left right
        // in order 10 20 30 40 50 60 70 left root right
        // post order 10 30 40 20 60 70 50 left right root

        System.out.println("\nMin: " + min(node5)); // 10
    }
}
