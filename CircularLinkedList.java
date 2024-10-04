class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    //  Add a new node
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // making it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintaining circular link
        }
    }

    //  Delete a node
    public void deleteNode(int data) {
        if (head == null) return;
        if (head.data == data) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node temp = head;
        while (temp.next != tail && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next.data == data) {
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
        } else {
            System.out.println("Node cannot found");
        }
    }

    //  Traverse through the linked list
    public void traverse() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    //  Display nodes
    public void display() {
        traverse();
    }
}
