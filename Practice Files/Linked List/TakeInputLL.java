import java.util.*;

class Node{
    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
        next = null;
    }
}

public class TakeInputLL {

    public static void printLL(Node head){        // function for printing the linked list
        if(head == null){
            System.out.print("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static Node getInputLL(){              // function for getting  the input linked list from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node data ");
        int data = sc.nextInt(); 

        if(data == -1) return null;

        Node head = new Node(data);
        Node temp = head;

        while(data != -1){
            System.out.println("Enter the next node data");
            data = sc.nextInt();
            if(data == -1){
                break;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }


    public static Node getTailLL(Node head){  // return's tail node value 
        if(head == null){
            return null;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;
        return tail;
    }

    public static Node reverseLL(Node head){
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }
        
        Node curr = head;
        Node prev = null;
        Node temp = null;
        while(curr != null){
            curr = curr.next;
            head.next = prev;
            prev = head;
            temp = head;
            head = curr;
        }

        return temp;
    }

    public static void main(String args[]){
        Node L1 = new Node(1);  // creating nodes
        Node head = L1;
        Node L2 = new Node(2);
        Node L3 = new Node(3);
        Node L4 = new Node(4);
        Node L5 = new Node(5);

        L1.next = L2;  // linking
        L2.next = L3;
        L3.next = L4;
        L4.next = L5;
        
        // printLL(head);

        // getting the input from the user

        Node headOfInputLL = getInputLL();  // Gets the head of the input linked list

        printLL(headOfInputLL);
        
        // System.out.println("Get head : "+headOfInputLL.val);
        // System.out.println("Get tail : "+getTailLL(headOfInputLL).val);

        Node reverseHead = reverseLL(headOfInputLL);

        printLL(reverseHead);   // function for reversing LL

        System.out.println("Get head : "+reverseHead.val);
        System.out.println("Get tail : "+getTailLL(reverseHead).val);

    }
}
