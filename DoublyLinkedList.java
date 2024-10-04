class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    // Add a new node
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    //  Delete a node
    public void deleteNode(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node cannot found");
            return;
        }
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
    }

    //  Traverse through the linked list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //  Display nodes
    public void display() {
        traverse();
    }
}
