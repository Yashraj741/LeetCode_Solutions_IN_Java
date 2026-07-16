import java.util.Stack;
class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack();
        output = new Stack();    
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if (output.isEmpty()) {
            transfer();
        }
        return output.pop();
    }
    
    public int peek() {
        if (output.isEmpty()) {
            transfer();
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
    private void transfer() {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }
    }
}
