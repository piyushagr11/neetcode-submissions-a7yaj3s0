class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> minStackVal;
    public MinStack() {
        minStack = new Stack<>();
        minStackVal = new Stack<>();
    }

    public void push(int val) {
        minStack.push(val);
        if(minStackVal.isEmpty() || minStackVal.peek()>=val){
            minStackVal.push(val);
        }
    }

    public void pop() {
        int val = minStack.pop();
        if(minStackVal.peek() == val){
            minStackVal.pop();
        }
    }

    public int top() {
        return minStack.peek();
    }

    public int getMin() {
        return minStackVal.peek();
    }
}
