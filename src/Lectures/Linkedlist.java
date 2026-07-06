package Lectures;

class Node{
    int data;
    Node next; 
    Node(int val){
        data = val;
    }
}
class Linlist{
        Node head;
        Node tail;

        void addatend(int x){
            Node temp = new Node(x);
            if(tail==null){
                head=tail=temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        void addathead(int y){
            Node temp = new Node(y);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

        void deletedathead(int z){
            if(head == null){
                System.out.print("LinkedList is Empty");
                return;
            }
            head = head.next;
            if(head== null) tail=null;
        }

        void display(){
            Node temp = head;
            if(head == null) return ;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

    }

public class Linkedlist {

    public static void displays(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    
    public static void reversell(Node head){
        if(head==null) return;
        reversell(head.next);
        System.out.print(head.data+" ");
        
    }

    

    public static void main(String[] args){
        Linlist ll = new Linlist();

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        // System.out.println(a);
        // System.out.println(a.next.data);
        // System.out.println(b);
        // System.out.println(c.next);
        // System.out.println(d.next);
        // System.out.println(e.next);
        // display(a);
        // reversell(a);
        ll.addatend(70);
        ll.addatend(80);
        ll.addatend(90);
        ll.addatend(100);
        ll.display();
        System.out.print("\n");
        ll.addathead(65);
        ll.display();



    }
    
}
