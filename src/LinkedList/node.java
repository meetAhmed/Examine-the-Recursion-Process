package LinkedList;

public class node {
    
    
    node next,previous;
    int value;

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public node getPrevious() {
        return previous;
    }

    public void setPrevious(node previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
