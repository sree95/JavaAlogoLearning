package PlayLinkedLists;

public class LinkedList<T extends Comparable<T>> implements Cloneable {
    private Node<T> head = null;

    public LinkedList() {
    }

    public int countNodes() {
        if (head == null) {
            return 0;
        } else {
            Node<T> curr = head;
            int counter = 0;
            while (curr != null) {
                curr = curr.getNext();
                counter++;
            }
            return counter;
        }
    }

    public void addANodeAtTheEndOfTheList(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    public T popAnElement(){
        if(head != null){
            Node<T> tobeReturned = head;
            head = tobeReturned.getNext();
            return tobeReturned.getData();
        }else {
            return null;
        }

    }
}
