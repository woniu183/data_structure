package jianzhi_offer;

import java.util.Stack;

public class Solution2 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {

        if(stack2.isEmpty()) {
            for (int i = 0; i < stack1.size(); i++) {
                stack2.push(stack1.pop());
            }

        }
        return stack2.pop();

    }
}
