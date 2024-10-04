public class LinkedListExample {
    public static void main(String[] args) {
        // Singly Linked List
        System.out.println("Singly Linked List:");
        SinglyLinkedList singlyList = new SinglyLinkedList();
        singlyList.addNode(5);
        singlyList.addNode(10);
        singlyList.addNode(15);
        singlyList.display(); // Display the list

        System.out.println("After deletion of 10:");
        singlyList.deleteNode(10); // Delete node with value 10
        singlyList.display(); // Display the updated list

        System.out.println("After adding 20:");
        singlyList.addNode(20);
        singlyList.display(); // Display after adding a new node

        // Doubly Linked List
        System.out.println("\nDoubly Linked List:");
        DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.addNode(7);
        doublyList.addNode(14);
        doublyList.addNode(21);
        doublyList.display(); // Display the list

        System.out.println("After deletion of 14:");
        doublyList.deleteNode(14); // Delete node with value 14
        doublyList.display(); // Display the updated list

        System.out.println("After adding 28:");
        doublyList.addNode(28);
        doublyList.display(); // Display after adding a new node

        // Circular Linked List
        System.out.println("\nCircular Linked List:");
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.addNode(3);
        circularList.addNode(6);
        circularList.addNode(9);
        circularList.display(); // Display the list

        System.out.println("After deletion of 6:");
        circularList.deleteNode(6); // Delete node with value 6
        circularList.display(); // Display the updated list

        System.out.println("After adding 12:");
        circularList.addNode(12);
        circularList.display(); // Display after adding a new node
    }
}
