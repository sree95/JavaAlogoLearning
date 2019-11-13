package StacksAndQueues;

public class FindingMinInConstantTime {
    private Stack<Integer> actualstack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int data) throws Exception {
        int min = 0;
        min = data;

        if (!minStack.isEmpty()){
            if(min > minStack.peek()){
                min = minStack.peek();
            }
        }
        actualstack.push(data);
        minStack.push(min);
    }

    public int pop() throws Exception {
        if (!actualstack.isEmpty()){
            minStack.pop();
            return actualstack.pop();
        }
        return 0;
    }

    public int getMinimum() throws Exception {
        return minStack.peek();
    }

}
