/**
 * ListDemo
 */

// const time add and remove
// but cant just get from the middle
public class ListDemo {
    // n is number of elements in list
    static void displayLinkedList(SLLNode<Integer> node) { // T(N) = O(N)
        // System.out.println(node.info + " ");
        // // next node
        // System.out.println(node.info + " ");
        // // next node
        // System.out.println(node.info);

        // while there is nodes or till .next == null

        // n repeat
        while (node != null) {
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }

    static SLLNode<Integer> generateLinkedList(int a, int b, int c) { // O(1)
        // build a linked list a -> b -> c and return it
        SLLNode<Integer> node1 = new SLLNode<Integer>(a);
        SLLNode<Integer> node2 = new SLLNode<Integer>(b);
        SLLNode<Integer> node3 = new SLLNode<Integer>(c);

        node1.next = node2;
        node2.next = node3;

        return node1;
    }

    static void add(SLLNode<Integer> node, int val) { // T(N) = O(N)
        // Make change by adding the new value at the end of the list
        // eg if list is 10 -> 20 -> 30
        // add 5
        // 10 -> 20 -> 30 -> 5

        // move to last node
        // create a new node with value = val.
        // make connection from the last node to the new node

        while (node.next != null)
            node = node.next;

        SLLNode<Integer> newNode = new SLLNode<>(val);
        node = newNode;
    }

    static SLLNode<Integer> addAtBeginning(SLLNode<Integer> node, int val) { // O(1)
        // add new element at beginng
        SLLNode<Integer> newNode = new SLLNode<Integer>(val);
        newNode.next = node;

        return newNode;
    }

    static void removeSecondOne(SLLNode<Integer> node) { // O(1)
        // assume has at least two elements

        node.next = node.next.next;
        // int count = 0;

        // while (count != 2) {
        // node = node.next;
        // count++;
        // }

        // node = node.next;
    }

    static void splitSecondOneInHalf(SLLNode<Integer> node) { //
        // assume list has at least two elements
        int val1 = node.next.info / 2;
        int val2 = node.next.info = val1;

        node.next.info = val1;
        SLLNode<Integer> newNode = new SLLNode<Integer>(val2);
        newNode.next = node.next.next;
        node.next.next = newNode;
    }

    static SLLNode<Integer> generateLinkedList(int cnt) { // O(cnt)
        SLLNode<Integer> node = new SLLNode<Integer>(1);

        // T(cnt) = O(cnt^2)
        // for (int i = 2; i <= cnt; i++) {
        // add(node, i);
        // }

        for (int i = cnt; i >= 0; i--) {
            node = addAtBeginning(node, i);
        }

        return node;
    }

    public static void main(String[] args) {
        // [node1] -> [node2]
        // [10] -> [null]
        SLLNode<Integer> node1 = new SLLNode<Integer>(10);
        SLLNode<Integer> node2 = new SLLNode<Integer>(20);
        SLLNode<Integer> node3 = new SLLNode<Integer>(30);

        // make connection to build a list 10 -> 20 -> 30
        // [node1] -> [node2]
        // [10] -> [20] -> [null]
        node1.next = node2;
        // [10] -> [20] -> [30] -> [null]
        node2.next = node3;
        displayLinkedList(node1); // 10 20 30
        displayLinkedList(node2); // 20 30
        displayLinkedList(node3); // 30
        displayLinkedList(null); // (new line)

        // Make changes to the connection 30 -> 20 -> 10
        node3.next = node2;
        node2.next = node1;
        node1.next = null;
        displayLinkedList(node3); // 30 20 10

        SLLNode<Integer> list = generateLinkedList(31, 51, 234);
        displayLinkedList(list); // 31 51 234
        add(list, 10);
        System.out.print("Add ");
        displayLinkedList(list); // 31 51 234 10
        removeSecondOne(list);
        displayLinkedList(list); // 31 234 10

        splitSecondOneInHalf(list);
        displayLinkedList(list);

        SLLNode<Integer> ls1 = generateLinkedList(2, 3, 4);
        splitSecondOneInHalf(ls1);
        displayLinkedList(ls1); // 2 1 2 4

        ls1 = addAtBeginning(ls1, 40);
        displayLinkedList(ls1); // 40 2 1 1 4

        displayLinkedList(generateLinkedList(3)); // 1 2 3
        displayLinkedList(generateLinkedList(5)); // 1 2 3 4 5
    }
}