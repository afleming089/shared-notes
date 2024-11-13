/**
 * MyLinkedListDemo
 */
public class MyLinkedListDemo {

    public static void main(String[] args) {
        MyLinkedList<Integer> myNums1 = new MyLinkedList<>();
        myNums1.add(10);
        myNums1.add(20);
        myNums1.printLinkedList(); // printLinkedList(2) 20 10
        System.out.println(myNums1.size()); // 2
        System.out.println(myNums1.get(0)); // 20
        System.out.println(myNums1.get(1)); // 10
        System.out.println(myNums1.get(10)); // null
        System.out.println(myNums1.get(-1)); // null
        System.out.println(myNums1.search(10)); // memory address or SLLNode(10)
        System.out.println(myNums1.search(20)); // memory address SLLNode(20)
        System.out.println(myNums1.search(420)); // memory address SLLNode(null)

        myNums1.add(30);
        myNums1.printLinkedList();
        myNums1.remove(20);
        myNums1.printLinkedList(); // 30 10
        myNums1.remove(30);
        myNums1.printLinkedList(); // 10
    }
}