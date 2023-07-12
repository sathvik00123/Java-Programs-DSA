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

    public void insertIntoLLBeginning(int data){
        Node node = new Node(data);
        if(tail == null){
            tail = node;
        }else {
            node.next = head;
            head = node;
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

    public void countIterative(){
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        System.out.println("Count of LL iteratively : "+size);
    }

    public int countRecurrsive(Node head){
        if(head == null){
            return 0;
        }
        return 1 + countRecurrsive(head.next);
    }

    public void countDis(){
        System.out.println("count : "+ countRecurrsive(head));
        countIterative();
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

public class LengthOfLLRecurrsive {
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
        l1.countDis();

        // LL l2 = new LL();
        // l2.insertIntoLLBeginning(1);
        // l2.insertIntoLLBeginning(2);
        // l2.insertIntoLLBeginning(3);
        // l2.insertIntoLLBeginning(4);
        // l2.insertIntoLLBeginning(5);

        // l2.display1();


    }
}
