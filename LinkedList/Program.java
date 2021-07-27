package LinkedList;
public class Program {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(10);

        myLinkedList.prepend(1);
        myLinkedList.append(20);
        myLinkedList.append(16);
        myLinkedList.printList();

        System.out.println("=========== Inserting at index 2 ===========");
        myLinkedList.insert(2, 2);

        System.out.println("=========== Deleting at index 2 ===========");
        myLinkedList.delete(0);
    }
}
