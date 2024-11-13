/**
 * recursion
 * recursion is a function calling its self again and again till it hits a end
 * statement. where it returns a final value.
 * It stacks all the values in the stack and each function call that returns the
 * function is waiting for the function to return something.
 *
 * Recursion uses a lot of memory though.
 */
public class RecursionExamples {

    static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    static int sumFromTo(int a, int b) {
        // return the sum of a + (a+1) + ... + (b-1) + b
        // a <= b
        if (a == b)
            return b;

        return sumFromTo(a + 1, b) + a;
    }

    static int sumUpTo(int n) {
        // return the sum of 1 + 2 + ... + n;
        // Assume n >= 1
        // must use recursion
        if (n == 1)
            return 1;

        return sumUpTo(n - 1) + n;
    }

    static int power(int a, int b) {
        // return a to the power of b
        // eg_ power(2,3) = 8 (2*2*2)

        if (b == 0)
            return 1;

        return power(a, b - 1) * a;
    }

    // static int sumArray(int[] nums) {

    // if (nums.length == 0)
    // return 0;

    // int[] newArray = new int[nums.length - 1];
    // for (int i = 0; i < newArray.length; i++)
    // newArray[i] = nums[i + 1];

    // return sumArray(newArray) + nums[0];
    // }

    static int sumArray(int[] nums) {// better time complexity
        return sumArrayHelper(nums, 0);
    }

    static int sumArrayHelper(int[] nums, int start) {
        if (start >= nums.length)
            return 0;
        return sumArrayHelper(nums, start + 1) + nums[start];
    }

    static int sumLinkedList(SLLNode<Integer> node) {
        // return the sum of the elements in the list
        if (node == null)
            return 0;
        return node.info + sumLinkedList(node.next);
    }

    static int countEven(SLLNode<Integer> node) {
        // return the number of even elements in the list
        if (node == null)
            return 0;

        return countEven(node.next) + (node.info % 2 == 0 ? 1 : 0);
    }

    static SLLNode<Integer> buildLinkedList(int[] nums) { // O(nums.length)
        SLLNode<Integer> head = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            SLLNode<Integer> newNode = new SLLNode<Integer>(nums[i]);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    static SLLNode<Integer> positiveOnly(SLLNode<Integer> node) {
        if (node == null) {
            return null;
        }

        if (node.info > 0) {
            node.next = positiveOnly(node.next);
            return node;
        } else {
            return (positiveOnly(node.next));
        }
    }

    static SLLNode<Integer> copyLinkedList(SLLNode<Integer> node) {
        if (node == null)
            return null;

        SLLNode<Integer> newNode = new SLLNode<Integer>(node.info);
        newNode.next = copyLinkedList(node.next);

        return newNode;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3)); // 6
        System.out.println(sumUpTo(3)); // 6
        System.out.println(sumUpTo(1)); // 1
        System.out.println(sumUpTo(10)); // 55
        System.out.println(sumFromTo(10, 13)); // 46
        System.out.println(sumFromTo(10, 10)); // 10
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(power(2, 3)); // 8
        System.out.println(power(3, 0)); // 1
        System.out.println(sumArray(new int[] { 10, 2, 5 })); // 17
        System.out.println(sumArray(new int[] {})); // 0

        System.out.println(countEven(ListDemo.generateLinkedList(3))); // 1);
        System.out.println(countEven(ListDemo.generateLinkedList(4))); // 2);

        ListDemo.displayLinkedList(positiveOnly(buildLinkedList(new int[] { 10, -2, -5, 3 }))); // 10 3
    }
}