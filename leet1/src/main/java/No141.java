/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.LinkedHashSet;
import java.util.HashSet;
public class No141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet();
        while(head!=null){
            if(set.contains(head))
                return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
    public boolean hasCycle1(ListNode head){
        if(head==null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
}
