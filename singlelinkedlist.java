public class singlelinkedlist{
Node head = null;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

  
    public static void main(String[] args) {
        singlelinkedlist list = new singlelinkedlist();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        System.out.println("Linked List:");
        list.display();

    }

}
