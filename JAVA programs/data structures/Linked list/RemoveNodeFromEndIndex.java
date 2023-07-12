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

    public Node removeNthFromEnd(Node head,int k) {
        Node one = head;
        Node two = head;

        for(int i=0;i<k;i++){
            two = two.next;
        }

        if(two == null){
            return one.next;
        }

        while(two.next != null){
            one = one.next;
            two = two.next;
        }
        Node remNode = one.next;
        one.next = one.next.next;
        remNode.next = null; 

        return head;
    }
    

    public void display2(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void nthNodeFromEnd(){
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        Node head1 = removeNthFromEnd(head,k);
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

public class RemoveNodeFromEndIndex {
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
        l1.nthNodeFromEnd();
    }
}

