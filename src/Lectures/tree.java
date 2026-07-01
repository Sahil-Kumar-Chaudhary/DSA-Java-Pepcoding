package Lectures;
import java.util.*;
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}



public class tree {
    public static void main(String[] args){

        Node a = new Node(2);
        a.left  = new Node(3);
        a.right = new Node(4);
        a.left.left = new Node(5);
        a.left.right = new Node(6);
        a.right.left  = new Node(7);
        a.right.right  = new Node(8);

        System.out.println(a.data);
        System.out.println(a.left.data);
        System.out.println(a.right.data);
        System.out.println(a.left.left.data);
        System.out.println(a.left.right.data);

        
    }
    
}
