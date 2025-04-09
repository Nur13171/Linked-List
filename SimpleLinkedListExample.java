 class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class SimpleLinkedListExample {

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);

        Node temp = head.next; //20
        temp.next = new Node(30);
        temp = temp.next; // 30
        temp.next = new Node(40);

        Node current = head;

        while (current != null && current.data != 20){
            current = current.next;
        }
        Node newNode = new Node(25);

        newNode.next = current.next;
        current.next = newNode;





        Node n = head;
        while (n!= null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
