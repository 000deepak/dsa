package v.collection.stack.crud;

import java.util.Stack;

public class delete {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);

        s.pop();

        System.out.println(s);
    }
}
