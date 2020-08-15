/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S24 {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode current = head;
        while(current!=null){
            ListNode tmp=current;
            current=current.next;
            tmp.next=pre;
            pre=tmp;
        }
        return pre;
    }
}
