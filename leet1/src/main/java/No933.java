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
public class No933 {
    Deque<Integer> deque;
    public RecentCounter() {
        deque= new LinkedList();
    }
    
    public int ping(int t) {
        deque.add(t);
        while(deque.peek()<t-3000)
            deque.pollFirst();
        return deque.size();
    }
}
