public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hi";

        System.out.println(s1.compareTo(s2)); // a negative because e < i
        System.out.println(s2.compareTo(s1)); // a positive because i < e
        System.out.println(s2.compareTo("Hello")); // same so 0
        System.out.println("100".compareTo("99")); // a negative -8

        String s3 = new String("Hello");
        System.out.println(s1 == s3); // false Still different memory addresses

        String s4 = s1;
        System.out.println(s1 == s4); // true

        // how to see if the value is the same
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.compareTo(s3) == 0); // true
    }

}
