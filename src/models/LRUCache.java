package models;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public Map<Integer,Node> storage;
    public int capacity;
    public Node head;
    public Node tail;

    LRUCache(int capacity)
    {
        this.capacity=capacity;
        this.storage= new HashMap<>();
        this.head = new Node(0,0);
        this.tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;

    }



    public void put(int key,int value)
    {

    }


}
