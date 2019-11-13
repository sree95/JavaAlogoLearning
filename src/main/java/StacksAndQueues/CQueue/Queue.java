package StacksAndQueues.CQueue;

import java.lang.reflect.Array;

public class Queue<T> {

    public static final int SPECIAL_EMPTY_VALUE = -1;

    private static int MAX_SIZE = 40;

    private T[] elements;

    private int headIndex = SPECIAL_EMPTY_VALUE;

    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> clazz) {
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isEmpty(){
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull(){
        int nextIndex = (tailIndex + 1) % elements.length;
        return nextIndex == headIndex;
    }

    public void enqueue(T data) throws Exception {
        if (isFull()){
            throw new Exception("Queue is full");
        }
        tailIndex = (tailIndex +1) % elements.length;
        elements[tailIndex] = data;

        if (headIndex == SPECIAL_EMPTY_VALUE){
            headIndex = tailIndex;
        }
    }

    public T dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        T data = elements[headIndex];
        if (headIndex == tailIndex){
            headIndex = SPECIAL_EMPTY_VALUE;
        }else {
            headIndex = (headIndex + 1) % elements.length;
        }
        return data;
    }

}
