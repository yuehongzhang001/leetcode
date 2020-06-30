/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        ListNode first = prev;
        prev.next=head;
        while(head!=null){
            if(head.val==val)
                prev.next=head.next;
            else
                prev=head;
            head=head.next;
        }
        return first.next;
    }
}
