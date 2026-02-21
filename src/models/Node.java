package models;


// doubly linked list model implementation
public class Node {
    public int val;
    public Node right;
    public Node left;

    Node(int val)
    {
        this.val=val;
        this.right=null;
        this.left=null;
    }
}

