package enqueuQueue;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void enqueue(int value){
        while(!stack1.isEmpty()){
            int values = stack1.pop();
            stack2.push(values);
        }

        stack1.push(value);
        while (!stack2.isEmpty()) {
            int finalValues = stack2.pop();
            stack1.push(finalValues);
        }
    }
    // WRITE THE ENQUEUE METHOD HERE //
    //                               //
    //                               //
    //                               //
    //                               //
    ///////////////////////////////////
    
    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
