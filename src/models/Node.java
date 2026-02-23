package models;


// doubly linked list model implementation
public class Node {
    public int value;
    public int key;
    public Node next;
    public Node prev;

    Node(int value,int key)
    {
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}

