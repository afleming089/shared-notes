public class MyLinkedList<E> {
    SLLNode<E> head = null;

    void add(E val) { // O(1)
        SLLNode<E> newNode = new SLLNode<E>(val);
        newNode.next = head;

        head = newNode;
    }

    E get(int idx) {
        // return the element value located idx 'idx'
        // assume index is valid

        int count = 0;
        SLLNode<E> node = head;

        while (node != null) {
            if (count == idx)
                return node.info;

            count++;
            node = node.next;
        }

        return null;
    }

    // give as references
    SLLNode<E> search(E val) {
        // return node that is equal to val
        // return null if no val found
        SLLNode<E> node = head;

        while (node != null) {
            if (node.info.equals(val))
                return node;
            node = node.next;
        }

        return null;
    }

    void remove(E val) {
        // remove the node that is equal to val
        // if val not found then no change
        // if there are multiple then remove the left most one
        SLLNode<E> prev = null;
        SLLNode<E> node = head;

        while (node != null) {
            if (node.info.equals(val)) {
                if (prev == null)
                    head = node.next;
                else
                    prev.next = node.next;
            }

            prev = node;
            node = node.next;
        }
    }

    int size() {
        // return the numbeer of elemnts
        int count = 0;
        SLLNode<E> node = head;

        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }

    void printLinkedList() { // T(N) = O(N)
        SLLNode<E> node = head;
        System.out.println("printLinkedList(%d): " + size());
        while (node != null) {
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }

}
