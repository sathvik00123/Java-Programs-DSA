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

    Node findMidOfLL(Node head) {
        Node slow = head;
        Node fast = head.next;

        while((fast != null) && (fast.next != null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){  // odd condition
                return slow;
            } // even condition
        return slow.next;   // even condition 
    }

    public void getMid(){
        System.out.println("Mid : " + findMidOfLL(head).data);
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

public class MidOfLL {
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
        l1.getMid();
    }
}
