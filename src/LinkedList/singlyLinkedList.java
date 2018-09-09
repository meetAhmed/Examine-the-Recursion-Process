package LinkedList;

public class singlyLinkedList {

    static node head;

    public void createNode(int value) {
        node n = new node();
        n.setValue(value);

        // Case 1 : first node
        if (head == null) {
            n.setNext(null);
            head = n;
        } // Case 2 : Last node
        else {
            node move = head;
            while (move.getNext() != null) {
                move = move.getNext();
            }
            move.setNext(n);
        }
    } // method ends here

    public int SumToSuspectNode(node n) {
        node move = getLastNode();
        int sum = 0;
        while (move != n) {
            sum += move.getValue();
            move = getPreviousNode(move);
        }
        return sum;
    } // ends here

    public int countNodes() {
        node move = head;
        int v = 0;
        while (move != null) {
            v++;
            move = move.getNext();
        }
        return v;
    } // ends here 

    private node getPreviousNode(node n) {
        node move = head;
        while (move.getNext() != n) {
            move = move.getNext();
        }
        return move;
    } // function ends here

    public node getLastNode() {
        node move = head;
        while (move.getNext() != null) {
            move = move.getNext();
        }
        return move;
    } // function ends here

    public node getNodeBeforeLast() {
        node move = head;
        node previous = null;
        while (move != null) {
            previous = move;
            move = move.getNext();
        }
        return previous;
    } // function ends here

    public node getHead() {
        return head;
    } // returns the head node ref   
}
