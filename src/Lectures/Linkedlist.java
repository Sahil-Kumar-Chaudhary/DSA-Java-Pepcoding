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
}
