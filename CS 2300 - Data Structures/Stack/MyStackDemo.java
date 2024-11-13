public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> st1 = new MyStack<Integer>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        System.out.println(st1.pop()); // 30
        System.out.println(st1.pop()); // 20
        st1.push(40); // 10 40
        System.out.println(st1.pop()); // 40
        System.out.println(st1.pop()); // 10
        System.out.println(st1.pop()); // null

        MyStackLL<Integer> stLL1 = new MyStackLL<Integer>();
        stLL1.push(30);
        stLL1.push(20);
        stLL1.push(10);
        System.out.println(stLL1.pop()); // 30
        System.out.println(stLL1.pop()); // 20
        System.out.println(stLL1.pop()); // 10
    }
}
