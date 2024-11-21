public class MyBSTDemo {
    public static void main(String[] args) {
        MyBST<Integer> tr1 = new MyBST<>();
        tr1.add(20);
        tr1.add(10);
        tr1.add(30);

        tr1.treeTraverse();
        // 20 10 30
        // 10 20 30
        // 10 30 20

        tr1.add(15);
        tr1.add(25);
        tr1.add(30);

        tr1.treeTraverse();
        // 20 10 15 30 25 30
        // 10 15 20 25 30 30
        // 15 10 30 25 30 20
        System.out.println(tr1.search(15)); // BSTNode(15)
        System.out.println(tr1.search(30)); // BSTNode(30)
        System.out.println(tr1.search(421)); // null
    }
}
