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
}
