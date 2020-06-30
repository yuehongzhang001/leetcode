/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashSet;
public class No160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;

        while(p1!=null){
           ListNode p2 = headA;
            while(p2!=null){
                if(p1==p2)
                    return p1;
                p2=p2.next;
            }
            p1=p1.next;
        }
        return null;
    }
    
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        HashSet<ListNode> set = new HashSet();
        ListNode p = headA;
        while(p!=null){
            set.add(p);
            p=p.next;
        }
        p=headB;
        while(p!=null){
            if(set.contains(p))
                return p;
            p=p.next;
        }
        return null;
    }
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB){
        if(headA==null||headB==null) return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1!=p2){
             if(p1==null) 
                p1=headB;
            else
                p1=p1.next;
            if(p2==null)
                p2=headA;
            else
                p2=p2.next;
        }
        return p1;
    }
}
