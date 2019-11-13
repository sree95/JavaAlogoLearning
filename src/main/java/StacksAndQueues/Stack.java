package StacksAndQueues;

public class Stack<T> {
    private static int MAX_SIZE = 50;

    private Element<T> top;

    private int size = 0;


    public void push(T data) throws Exception {
        if (size == MAX_SIZE){
            throw new Exception("Stack Overflow Exception");
        }
        Element element1 = new Element(data, top);
        top = element1;
        size++;
    }

    public T pop() throws Exception {
        if (size == 0){
            throw new Exception("Stack Under flow exception");
        }

        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() throws Exception {
        if (size == 0){
            throw new Exception("Stack Under flow exception");
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == MAX_SIZE;
    }
}
