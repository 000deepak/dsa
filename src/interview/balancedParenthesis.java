package interview;

import java.util.Stack;

public class balancedParenthesis {
    public static void main(String[] args) {
        String s = "[()]";
//        boolean flag = true;
//        while (flag) {
//            if (s.contains("()")) {
//                s = s.replace("()", "");
//            } else if (s.contains("{}")) {
//                s = s.replace("{}", "");
//            } else if (s.contains("[]")) {
//                s = s.replace("[]", "");
//            }
//
//            if(s.isEmpty()) flag = false;
//        }

        //String s = "[()]";
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                System.out.println(false);
                break;
            }
        }
        System.out.println(stack.isEmpty());
    }
}
