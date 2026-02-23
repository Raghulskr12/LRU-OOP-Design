package models;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public Map<Integer,Node> storage;
    public int capacity;
    public Node head;
    public Node tail;

    public LRUCache(int capacity)
    {
        this.capacity=capacity;
        this.storage= new HashMap<>();
        this.head = new Node(0,0);
        this.tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;

    }

    public void insertAtHead(Node node)
    {
        Node n1 = head.next;
        head.next=node;
        node.prev=head;
        node.next=n1;
        n1.prev=node;

    }

    public void deleteNode(Node node)
    {
        Node n1 = node.prev;
        Node n2 = node.next;
        n1.next= n2;
        n2.prev=n1;
    }

    public int get(int key ){
        if(!storage.containsKey(key))
        {
            System.out.println("Cache Miss");
            return 0;
        }
            Node n1 = storage.get(key);
            int value = n1.value;

            deleteNode(n1);

            insertAtHead(n1);
            return value;
    }


    public void put(int key,int value)
    {
        if(storage.size()==capacity)
        {
            if(storage.containsKey(key))
            {
                Node n1 = storage.get(key);
                n1.value = value;
                deleteNode(n1);
                insertAtHead(n1);

            }
            else {
                Node n1 = tail.prev;

                deleteNode(n1);
                storage.remove(n1.key);
                Node n2 = new Node(key, value);

                insertAtHead(n2);
                storage.put(key, n2);
            }
        }

        else if(storage.containsKey(key))
        {
            Node n1 = storage.get(key);
            n1.value = value;
            deleteNode(n1);
            insertAtHead(n1);

        }
        else {
            Node n2= new Node(key,value);

            insertAtHead(n2);
            storage.put(key,n2);
        }
    }


}
