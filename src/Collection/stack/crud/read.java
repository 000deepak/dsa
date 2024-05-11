package v.collection.stack.crud;

import java.util.Stack;

public class read {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);

        System.out.println(s.empty());


        System.out.println(s.peek());


    }
}
