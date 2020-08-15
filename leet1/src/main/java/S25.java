/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentiel=new ListNode();
        ListNode current=sentiel;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    current.next=l1;
                    l1=l1.next;
                }else{
                    current.next=l2;
                    l2=l2.next;
                }
            }else if(l1==null){
                current.next=l2;
                l2=l2.next;
            }else{
                current.next=l1;
                l1=l1.next;
            }
            current=current.next;
        }
        return sentiel.next;
    }
}
