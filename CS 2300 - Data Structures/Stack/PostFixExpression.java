public class PostFixExpression {

    static Integer evaluate(String expr) {
        MyStack<Integer> st1 = new MyStack<>();
        String[] words = expr.split(" "); // ["2", "3", "+"]

        for (int i = 0; i < words.length; i++) {
            // \d means every digit the + means one or more
            // two \ means include the other back slash in the expression
            if (words[i].matches("-?\\d+")) { // "12" , "3" , "34343", "-10"
                st1.push(Integer.valueOf(words[i]));
            } else {
                Integer n1 = st1.pop();
                Integer n2 = st1.pop();

                if (n2 == null)
                    return null;

                if (words[i].equals("+"))
                    st1.push(n2 + n1);
                if (words[i].equals("-"))
                    st1.push(n2 - n1);
                if (words[i].equals("*"))
                    st1.push(n2 * n1);
                if (words[i].equals("/"))
                    st1.push(n2 / n1);
            }
        }

        // check if only one number left and if so return number
        int result = st1.pop();
        if (st1.peek() == null)
            return result;
        else
            return null;

    }

    public static void main(String[] args) {
        System.out.println(evaluate("2 3 +")); // 5
        System.out.println(evaluate("2 7 + 6 2 - *")); // 36
        System.out.println(evaluate("2 + ")); // null
        System.out.println(evaluate("2 3 5 + ")); // null
    }
}
