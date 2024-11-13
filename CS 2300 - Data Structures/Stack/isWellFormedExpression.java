class isWellFormedExpression {

    static boolean isWellFormedExpression() {
        String expr = "";

        MyStack<Character> st1 = new MyStack<>();

        char c;
        char c2;
        for (int i = 0; i < expr.length(); i++) {
            c = expr.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st1.push(c);
            }

            // same thing
            // if("({[".contains(c+""))

            else if (c == ')' || c == '}' || c == ']') {
                if (st1.peek() == null)
                    return false;

            }
            c2 = st1.pop();
            if ((c == ')' && c2 != '(') || (c == '}' && c2 != '{') || (c == ']' && c2 != '['))
                return false;
        }
        return st1.peek() == null;
    }
}
