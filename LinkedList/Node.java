class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    void AddAtMiddle(int data,int position){
        Node newNode = new Node(data);
        if (head == null || position <= 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // void remove(int data) {
    //     if (head == null) return;

    //     if (head.data == data) {
    //         head = head.next;
    //         return;
    //     }

    //     Node temp = head;
    //     while (temp.next != null && temp.next.data != data)
    //         temp = temp.next;

    //     if (temp.next != null)
    //         temp.next = temp.next.next;
    // }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
