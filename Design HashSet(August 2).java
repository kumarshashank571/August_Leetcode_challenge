class MyHashSet {
    
    private int numbuckets = 20000;
    List<Integer>[] buckets;
    
    private int hashfunction(int key){
        return key%numbuckets;
    }

    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new LinkedList[numbuckets];
    }
    
    public void add(int key) {
        int i = hashfunction(key);
        if(buckets[i]==null){buckets[i]=new LinkedList<>();}
        if(buckets[i].indexOf(key)==-1){
            buckets[i].add(key);
        }
    }
    
    public void remove(int key) {
        int i = hashfunction(key);
        if(buckets[i]==null){return;}
        if(buckets[i].indexOf(key)!=-1){
            buckets[i].remove(buckets[i].indexOf(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
         int i = hashfunction(key);
        if(buckets[i]==null || buckets[i].indexOf(key)==-1){return false;}
        return true;
    }
}
