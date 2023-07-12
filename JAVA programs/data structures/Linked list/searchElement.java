
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

    public boolean isPresentIterative(int val){  // Iterative solution take O(1) space complexity and
        Node temp = head;                            // O(n) time complexity...
        while(temp != null){
            if(temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean isPresentRecurrsive(Node head,int val){
        if(head == null){
            return false;
        }
        if(head.data == val){
            return true;
        }
        return isPresentRecurrsive(head.next,val);
    }

    public void isPresentRecur(int val){     // recurrsive solution take O(n) space complexity due to call stack and
        if(isPresentRecurrsive(head,val)){        // O(n) time complexity...
            System.out.println("element exists.");
        }else {
            System.out.println("element not exists.");
        }
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

public class searchElement {
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
        // l1.display1();
        // l1.countDis();
        int m = sc.nextInt();

        if(l1.isPresentIterative(m)){
            System.out.println("element exists.");
        }else {
            System.out.println("element not exists.");
        }

        l1.isPresentRecur(m);

        // LL l2 = new LL();
        // l2.insertIntoLLBeginning(1);
        // l2.insertIntoLLBeginning(2);
        // l2.insertIntoLLBeginning(3);
        // l2.insertIntoLLBeginning(4);
        // l2.insertIntoLLBeginning(5);

        // l2.display1();


    }
}
