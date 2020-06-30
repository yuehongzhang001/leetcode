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
public class No234 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack= new Stack();
        ListNode p = head;
        while(p!=null){
            stack.push(p);
            p=p.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop().val!=head.val)
                return false;
            head=head.next;
        }
        return true;
    }
    
    public boolean isPalindrome1(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        boolean even = false;
        while(true){
            if(fast==null){
                even = true;
                break;
            }
            if(fast.next==null)
                break;
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode current = head;
        ListNode first = null;
        while(current!=slow){
            ListNode next = current.next;
            current.next=first;
            first=current;
            current=next;
         }
        if(!even)
            slow=slow.next;
        while(slow!=null){
            if(first.val!=slow.val)
                return false;
            first=first.next;
            slow=slow.next;
        }
        return true;
    }
    
    public boolean isPalindrome2(ListNode head){
        ArrayList<ListNode> list = new ArrayList();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        int low = 0;
        int high = list.size()-1;
        while(low<high){
            if(list.get(low).val!=list.get(high).val)
                return false;
            low++;
            high--;
        }
        return true;
    }
}
