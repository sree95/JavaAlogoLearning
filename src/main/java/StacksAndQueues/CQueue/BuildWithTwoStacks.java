package StacksAndQueues.CQueue;

import StacksAndQueues.Stack;

public class BuildWithTwoStacks<T> {

    public Stack<T> forwardStack = new Stack<>();
    public Stack<T> reverseStack = new Stack<>();

    public boolean isFull(){
        return forwardStack.isFull() || reverseStack.isFull();
    }

    public boolean isEmpty(){
        return forwardStack.isEmpty() && reverseStack.isEmpty();
    }

    public void EnQueue(T data) throws Exception {
        if (isFull()){
            throw new Exception("Queue is full");
        }
        if (forwardStack.isEmpty()){
            while(!reverseStack.isEmpty()){
                forwardStack.push(reverseStack.pop());
            }
        }
        forwardStack.push(data);
    }

    public T dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        if (forwardStack.isEmpty()){
            return reverseStack.pop();
        }else {
            while (!forwardStack.isEmpty()){
                reverseStack.push(forwardStack.pop());
            }
            return reverseStack.pop();
        }
    }
}
