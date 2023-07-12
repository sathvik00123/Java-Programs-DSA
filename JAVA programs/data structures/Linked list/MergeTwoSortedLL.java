import java.util.Scanner;

class LL{
    private Node head1;
    private Node head2;
    private Node tail1;
    private Node tail2;
    private int size;

    public void insertIntoLLEnding1(int data){
        Node node = new Node(data);
        if(head1 == null){
            head1 = node;
            tail1 = node;
        }else {
            tail1.next = node;
            tail1 = node;
        }
        // size++;
    }

    public void display1(){
        Node temp = head1;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void insertIntoLLEnding2(int data){
        Node node = new Node(data);
        if(head2 == null){
            head2 = node;
            tail2 = node;
        }else {
            tail2.next = node;
            tail2 = node;
        }
        // size++;
    }


    public void display2(){
        Node temp = head2;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node mergeTwoLists(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Node finalhead = null; // head of the linkedlist

        if(l1.data < l2.data){
            finalhead = l1;
            l1 = l1.next;
        }else{
            finalhead = l2;
            l2 = l2.next;
        }

        Node p = finalhead;    // this p is used to connect the nodes of both lists.

        while(l1!=null && l2!=null){
            if(l1.data < l2.data){    // inserting at tail.
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if(l1 != null){
            p.next = l1;
        }else {
            p.next = l2;
        }
        return finalhead;
    }

    public Node mergeTwoListsRecurr(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;

        Node newHead = null;

        if(a.data < b.data){
            newHead = a;
            newHead.next = mergeTwoListsRecurr(a.next, b);
        }else {
            newHead = b;
            newHead.next = mergeTwoListsRecurr(a, b.next);
        }
        return newHead;
    }
    

    public void displayMerge(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayMergeRecurr(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void mergeFun(){
        Node l1 = head1;
        Node l2 = head2;
        Node finalH1 = mergeTwoLists(l1,l2);
        displayMerge(finalH1);
        System.out.println("Recurrsive approch ");
        Node finalH2 = mergeTwoListsRecurr(l1,l2);
        // displayMergeRecurr(finalH2);
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

public class MergeTwoSortedLL {
    public static void main(String args[]){
        LL l = new LL();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i >= 0; i++){
            int n = sc.nextInt(); 
            if(n == -1){
                break;
            }
            l.insertIntoLLEnding1(n);
        }
        l.display1();

        for(int i = 0; i >= 0; i++){
            int n = sc.nextInt(); 
            if(n == -1){
                break;
            }
            l.insertIntoLLEnding2(n);
        }
        l.display2();
        
        l.mergeFun();
    }
}

