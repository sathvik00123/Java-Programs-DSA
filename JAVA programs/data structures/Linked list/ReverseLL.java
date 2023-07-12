import java.util.Scanner;

class LL{
    public Node head;
    private Node tail;
    private int size;

    public void insertIntoLLEnding(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        // size++;
    }

    public void display1(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    Node revLL(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    public void display2(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printRevLL(){
        Node head1 = revLL(head);
        display2(head1);
    }


    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}

public class ReverseLL {
    public static void main(String args[]){
        LL l1 = new LL();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i >= 0; i++){
            int n = sc.nextInt(); 
            if(n == -1){
                break;
            }
            l1.insertIntoLLEnding(n);
        }
        l1.display1();
        l1.printRevLL();
    }
}

