/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No206 {
    public ListNode reverseList(ListNode head) {
        ListNode first=null;
        ListNode current = head;
        while(current!=null){
            ListNode next = current.next;
            current.next=first;
            first=current;
            current=next;
        }
        return first;
    }
    
    public ListNode reverseList1(ListNode head){
        if(head.next==null) return head;
        ListNode second = head.next;
        head.next=null;
        ListNode result = reverseList1(second);
        second.next=head;
        return result;
    }
}
