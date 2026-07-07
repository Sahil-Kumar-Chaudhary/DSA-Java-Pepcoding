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
        int size;
        
//Add at End of linkedlist
        void addatend(int x){
            Node temp = new Node(x);
            if(tail==null){
                head=tail=temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

//Add at HEadof linkedlist
        void addathead(int y){
            Node temp = new Node(y);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

// Insert a value on particular index.
        void insertatpoint(int val,int idx){
            Node temp = head;
            if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return;
            }else if(idx==size){
                addatend(val);

            }else if(idx==0){
                addathead(val);
            }else{
                
                for(int i=0;i<idx-1;i++){
                    temp = temp.next;
                }
                Node t = new Node(val);
                t.next = temp.next;
                temp.next=t;
                size++;
            }

        }

// Delete at a particular index;
        void deleteatindex(int idx){
            Node temp = head;
            if(idx<0 || idx>=size){
                System.out.print("Invalid Index");
                return;

            }
            if(idx==0){
                deletedathead();
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size) tail=temp;
            size--;

        }

        

        void deletedathead(){
            if(head == null){
                System.out.print("LinkedList is Empty");
                return;
            }
            head = head.next;
            if(head== null) tail=null;
            size--;
        }
        int checknum(int a){
            Node temp = head;
            int idx=0;
            // if(temp==null) return -1;
            while(temp!=null){
                if(temp.data==a){
                    return idx;
                }
                temp=temp.next;
                idx++;
            }
            return -1;

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
        System.out.print("\n");
        System.out.println(ll.checknum(80));
        System.out.println(ll.size);
        ll.insertatpoint(75,2);
        ll.display();



    }
    
}
