/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashMap;
public class No83 {
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap();
        ListNode pointer=head;
        ListNode prev=null;
        while(pointer!=null){
            int val=pointer.val;
            if(!map.containsKey(val)){
                map.put(val, 0);
                prev=pointer;
            }else{
                prev.next=pointer.next;
            }
            pointer=pointer.next;
        }
        return head;
    }
    
    public static ListNode deleteDuplicates1(ListNode head){
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.next.val==current.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
}
