package LinkedList;
class LinkedList {

    private Node head;
    private int length;
    private Node tail;

    public LinkedList(int head) {
        Node node = new Node(head);
        this.head = node;
        this.tail = this.head;
        this.length = 1;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;
    }

    public LinkedList append(int value) {

        Node newNode = new Node(value);

        this.tail.setNext(newNode);

        this.tail = newNode;

        this.length++;

        return this;
    }

    public LinkedList prepend(int value) {

        Node newNode = new Node(value);

        newNode.setNext(this.head);

        this.head = newNode;

        this.length++;

        return this;
    }

    public void insert(int value, int index) {

        if (index < 0) {
            printList();
            return;
        }

        if (index == 0) {
            this.prepend(value);
            printList();
            return;
        }

        if (index >= this.length) {
            this.append(value);
            printList();
            return;
        }

        Node newNode = new Node(value);

        Node currentNode = getCurrentNode(index);

        Node nextNode = currentNode.getNext();

        currentNode.setNext(newNode);

        newNode.setNext(nextNode);

        this.length++;

        printList();

    }

    public void delete(int index) {

        if (index < 0) {
            printList();
            return;
        }

        if( index == 0) {

            this.head = this.head.getNext();
            this.length--;
            printList();
            return;
        }

        Node currentNode = getCurrentNode(index);

        Node nodeAfterDeletedNode = currentNode.getNext();

        currentNode.setNext(nodeAfterDeletedNode);

        this.length--;

        printList();
    }

    private Node getCurrentNode(int index) {

        Node currentNode = this.head;

        for (int i = 0; i < index - 1; i++) {

            currentNode = currentNode.getNext();
        }

        return currentNode;

    }

    public void printList() {

        Node currentNode = this.head;

        while (currentNode != null) {

            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

}

class Node {

    private int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

}