package service;

import models.LRUCache;
import models.Node;

public class LRUService {

    public  LRUCache cache;

    public LRUService(int capacity) {
        this.cache = new LRUCache(capacity);
    }

    public void put(int key,int value)
    {
        cache.put(key, value);
        System.out.println("Inserted successfully");
    }

    public void get(int key)
    {
       int ans = cache.get(key);
        System.out.println("The value is :" + ans);
    }
}
