/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        ListNode sentiel = new ListNode();
        sentiel.next=head;
         ListNode pre=sentiel;
        while(p!=null){
            if(p.val==val){
                pre.next=p.next;
                break;
            }else{
                pre=p;
                p=p.next;
            }   
        }
        return sentiel.next;
    }
}
