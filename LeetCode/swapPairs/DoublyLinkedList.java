public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    public void swapPairs(){
        if(length <= 1) return;
        Node current = head;
        
        Node first = current;
        Node second = current.next;

        Node nextPair = second.next;

        if (first.prev != null) {
            first.prev.next = second; 
        } else {
            head = second; 
        }

        second.prev = first.prev;
        second.next = first;

        first.prev = second;
        first.next = nextPair;

        if (nextPair != null) {
            nextPair.prev = first;
        }

        current = nextPair;
        
    }
    // WRITE THE SWAPPAIRS METHOD HERE // 
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    
}

