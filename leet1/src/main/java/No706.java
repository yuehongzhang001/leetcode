/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No706 {
    class MyHashMap {
        private int key_space;
        private Bucket[] bucketArray;
        /** Initialize your data structure here. */
        public MyHashMap() {
            key_space=2069;
            bucketArray=new Bucket[key_space];
            for(int i=0;i<bucketArray.length;i++){
                bucketArray[i]=new Bucket();
            }
        }
        
        private int hash(int key){
            return key % key_space;
        }
        /** value will always be non-negative. */
        public void put(int key, int value) {
            int index=hash(key);
            bucketArray[index].update(key, value);
        }
        
        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int index=hash(key);
            return bucketArray[index].get(key);
        }
        
        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int index=hash(key);
            bucketArray[index].remove(key);
        }
        
        
        public class Entry<K,V>{
            public K key;
            public V value;
            public Entry(K k,V v){
                key=k;
                value=v;
            }
        }
        public class Bucket{
            LinkedList<Entry<Integer,Integer>> container;
            public Bucket(){
               container = new LinkedList();
            }
            public Integer get(Integer k){
                for(Entry<Integer,Integer> e:container){
                    if(e.key.equals(k)){
                        return e.value;
                    } 
                }
                return null;
            } 
            public void update(Integer k,Integer v){
                boolean found=false;
                for(Entry<Integer,Integer> e:container){
                    if(e.key.equals(k)){
                        found=true;
                        e.value=v;
                        break;
                    } 
                }
                if(!found)
                    container.add(new Entry(k,v));
            }
            
            public void remove(Integer k){
                for(Entry<Integer,Integer> e:container){
                    if(e.key.equals(k)){
                        container.remove(e);
                        break;
                    } 
                }
            }
        }
    }
}
