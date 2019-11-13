package StacksAndQueues;

public class Element<T> {
    private T data;
    private Element next;

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Element getNext(){
        return next;
    }

    public void setNext(Element element){
        this.next = element;
    }

    public Element(T data, Element next) {
        this.data = data;
        this.next = next;
    }
}


